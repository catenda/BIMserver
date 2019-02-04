package org.bimserver.ifc.step.deserializer;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.step.deserializer.buffered.StepStringDecoder;
import org.bimserver.interfaces.objects.SIfcHeader;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.EmfDeserializer;
import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.BooleanType;
import org.bimserver.plugins.schema.DefinedType;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.ExplicitAttribute;
import org.bimserver.plugins.schema.IntegerType;
import org.bimserver.plugins.schema.RealType;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.schema.StringType;
import org.bimserver.plugins.schema.UnderlyingType;
import org.bimserver.shared.ListWaitingObject;
import org.bimserver.shared.SingleWaitingObject;
import org.bimserver.shared.WaitingList;
import org.bimserver.utils.FakeClosingInputStream;
import org.bimserver.utils.StringUtils;
import org.bimserver.utils.TokenizeException;
import org.bimserver.utils.Tokenizer;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;

import com.google.common.base.Charsets;

public class IfcStepDeserializer extends EmfDeserializer {

	private static final int AVERAGE_LINE_LENGTH = 58;
	private EPackage ePackage;
	private static final String WRAPPED_VALUE = "wrappedValue";
	private Map<String, EClassifier> classes;

	/*
	 * The following hacks are present
	 * 
	 * - For every feature of type double there is an extra feature (name
	 * appended with "AsString") of type String to keep the original String
	 * version this is also done for aggregate features - WrappedValues for all
	 * for derived primitive types and enums that are used in a "select"
	 */

	private final WaitingList<Long> waitingList = new WaitingList<Long>();
	private SchemaDefinition schema;
	private Mode mode = Mode.HEADER;
	private IfcModelInterface model;

	public enum Mode {
		HEADER, DATA, FOOTER, DONE
	}

	public void init(SchemaDefinition schema) {
		this.schema = schema;
		String name = this.schema.getName();
		if ("IFC2X3".equals(name.toUpperCase())) {
			ePackage = Ifc2x3tc1Package.eINSTANCE;
		} else if ("IFC4".equals(name.toUpperCase())) {
			ePackage = Ifc4Package.eINSTANCE;
		}
		classes = initClasses(ePackage);
	}

	public IfcModelInterface read(InputStream in, String filename, long fileSize) throws DeserializeException {
		mode = Mode.HEADER;
		if (filename != null && (filename.toUpperCase().endsWith(".ZIP") || filename.toUpperCase().endsWith(".IFCZIP"))) {
			ZipInputStream zipInputStream = new ZipInputStream(in);
			ZipEntry nextEntry;
			try {
				nextEntry = zipInputStream.getNextEntry();
				if (nextEntry == null) {
					throw new DeserializeException("Zip files must contain exactly one IFC-file, this zip-file looks empty");
				}
				if (nextEntry.getName().toUpperCase().endsWith(".IFC")) {
					IfcModelInterface model = null;
					FakeClosingInputStream fakeClosingInputStream = new FakeClosingInputStream(zipInputStream);
					model = read(fakeClosingInputStream, fileSize);
					if (model.size() == 0) {
						throw new DeserializeException("Uploaded file does not seem to be a correct IFC file");
					}
					if (zipInputStream.getNextEntry() != null) {
						zipInputStream.close();
						throw new DeserializeException("Zip files may only contain one IFC-file, this zip-file contains more files");
					} else {
						zipInputStream.close();
						return model;
					}
				} else {
					throw new DeserializeException("Zip files must contain exactly one IFC-file, this zip-file seems to have one or more non-IFC files");
				}
			} catch (IOException e) {
				throw new DeserializeException(e);
			}
		} else {
			return read(in, fileSize);
		}
	}

	private void filterComments(Tokenizer tokenizer) throws TokenizeException {
		if (tokenizer.startsWith("/*")) {
			tokenizer.zoomIn("/*", "*/");
			tokenizer.readAll();
			tokenizer.zoomOut();
		}
	}
	
	private IfcModelInterface read(InputStream inputStream, long fileSize) throws DeserializeException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
		int initialCapacity = (int) (fileSize / AVERAGE_LINE_LENGTH);
		model = new IfcModel(initialCapacity);
		int lineNumber = 0;
		try {
			String line = reader.readLine();
			MessageDigest md = MessageDigest.getInstance("MD5");
			while (line != null) {
				byte[] bytes = line.getBytes(Charsets.UTF_8);
				md.update(bytes, 0, bytes.length);
				try {
					while (!processLine(line.trim())) {
						String readLine = reader.readLine();
						if (readLine == null) {
							break;
						}
						line += readLine;
						lineNumber++;
					}
				} catch (Exception e) {
					throw new DeserializeException("Error on line " + lineNumber + " (" + e.getMessage() + ") " + line, e);
				}
				line = reader.readLine();
				lineNumber++;
			}
			model.getModelMetaData().setChecksum(md.digest());
			if (mode == Mode.HEADER) {
				throw new DeserializeException("No valid IFC header found");
			}
		} catch (FileNotFoundException e) {
			throw new DeserializeException(e);
		} catch (IOException e) {
			throw new DeserializeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new DeserializeException(e);
		}
		return model;
	}

	public IfcModelInterface read(File sourceFile) throws DeserializeException {
		try {
			FileInputStream in = new FileInputStream(sourceFile);
			read(in, sourceFile.length());
			in.close();
			model.getModelMetaData().setDate(new Date());
			model.getModelMetaData().setName(sourceFile.getName());
			return model;
		} catch (FileNotFoundException e) {
			throw new DeserializeException(e);
		} catch (IOException e) {
			throw new DeserializeException(e);
		}
	}

	public IfcModelInterface getModel() {
		return model;
	}

	private static Map<String, EClassifier> initClasses(EPackage ePackage) {
		HashMap<String, EClassifier> classes = new HashMap<String, EClassifier>(ePackage.getEClassifiers().size());
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			classes.put(classifier.getName().toUpperCase(), classifier);
		}
		return classes;
	}

	private boolean processLine(String line) throws DeserializeException {
		switch (mode) {
		case HEADER:
			if (line.length() > 0) {
				if (line.endsWith(";")) {
					processHeader(line);
				} else {
					return false;
				}
			}
			if (line.equals("DATA;")) {
				mode = Mode.DATA;
			}
			break;
		case DATA:
			if (line.equals("ENDSEC;")) {
				mode = Mode.FOOTER;
			} else {
				if (line.length() > 0 && line.charAt(0) == '#') {
					while (line.endsWith("*/")) {
						line = line.substring(0, line.lastIndexOf("/*")).trim();
					}
					if (line.endsWith(";")) {
						processRecord(line);
					} else {
						return false;
					}
				}
			}
			break;
		case FOOTER:
			if (line.equals("ENDSEC;")) {
				mode = Mode.DONE;
			}
			break;
		case DONE:
		}
		return true;
	}

	private void processHeader(String line) throws DeserializeException {
		try {
			SIfcHeader ifcHeader = model.getModelMetaData().getIfcHeader();
			if (ifcHeader == null) {
				model.getModelMetaData().setIfcHeader(new SIfcHeader());
			}
			if (line.startsWith("FILE_DESCRIPTION")) {
				Tokenizer tokenizer = new Tokenizer(line.substring(line.indexOf("(")));
				tokenizer.zoomIn("(", ")");
				filterComments(tokenizer);
				tokenizer.zoomIn("(", ")");
				filterComments(tokenizer);
				while (!tokenizer.isEmpty()) {
					ifcHeader.getDescription().add(tokenizer.readSingleQuoted());
					if (tokenizer.nextIsAComma()) {
						tokenizer.readComma();
					}
				}
				tokenizer.zoomOut();
				tokenizer.readComma();
				filterComments(tokenizer);
				ifcHeader.setImplementationLevel(tokenizer.readSingleQuoted());
				tokenizer.zoomOut();
				tokenizer.shouldBeFinished();
			} else if (line.startsWith("FILE_NAME")) {
				Tokenizer tokenizer = new Tokenizer(line.substring(line.indexOf("(")));
				tokenizer.zoomIn("(", ")");
				filterComments(tokenizer);
				if (tokenizer.nextIsDollar()) {
					tokenizer.readDollar();
					ifcHeader.setFilename("");
				} else {
					ifcHeader.setFilename(tokenizer.readSingleQuoted());
				}
				SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss");
				tokenizer.readComma();
				filterComments(tokenizer);
				ifcHeader.setTimeStamp(dateFormatter.parse(tokenizer.readSingleQuoted()));
				tokenizer.readComma();
				filterComments(tokenizer);
				tokenizer.zoomIn("(", ")");
				while (!tokenizer.isEmpty()) {
					ifcHeader.getAuthor().add(tokenizer.readSingleQuoted());
					if (tokenizer.nextIsAComma()) {
						tokenizer.readComma();
					}
				}
				tokenizer.zoomOut();
				tokenizer.readComma();
				filterComments(tokenizer);
				tokenizer.zoomIn("(", ")");
				while (!tokenizer.isEmpty()) {
					ifcHeader.getOrganization().add(tokenizer.readSingleQuoted());
					if (tokenizer.nextIsAComma()) {
						tokenizer.readComma();
					}
				}
				tokenizer.zoomOut();
				tokenizer.readComma();
				filterComments(tokenizer);
				ifcHeader.setPreProcessorVersion(tokenizer.readSingleQuoted());
				tokenizer.readComma();
				filterComments(tokenizer);
				ifcHeader.setOriginatingSystem(tokenizer.readSingleQuoted());
				tokenizer.readComma();
				filterComments(tokenizer);
				if (tokenizer.nextIsDollar()) {
					tokenizer.readDollar();
				} else {
					ifcHeader.setAuthorization(tokenizer.readSingleQuoted());
				}
				tokenizer.zoomOut();
				tokenizer.shouldBeFinished();
			} else if (line.startsWith("FILE_SCHEMA")) {
				Tokenizer tokenizer = new Tokenizer(line.substring(line.indexOf("(")));
				ifcHeader.setIfcSchemaVersion(tokenizer.zoomIn("(", ")").zoomIn("(", ")").readSingleQuoted());
			} else if (line.startsWith("ENDSEC;")) {
				// Do nothing
			}
		} catch (TokenizeException e) {
			throw new DeserializeException(e);
		} catch (ParseException e) {
			throw new DeserializeException(e);
		}
	}

	public void processRecord(String line) throws DeserializeException {
		int equalSignLocation = line.indexOf("=");
		int lastIndexOfSemiColon = line.lastIndexOf(";");
		if (lastIndexOfSemiColon == -1) {
			throw new DeserializeException("No semicolon found in line");
		}
		int indexOfFirstParen = line.indexOf("(", equalSignLocation);
		if (indexOfFirstParen == -1) {
			throw new DeserializeException("No left parenthesis found in line");
		}
		int indexOfLastParen = line.lastIndexOf(")", lastIndexOfSemiColon);
		if (indexOfLastParen == -1) {
			throw new DeserializeException("No right parenthesis found in line");
		}
		long recordNumber = Long.parseLong(line.substring(1, equalSignLocation).trim());
		String name = line.substring(equalSignLocation + 1, indexOfFirstParen).trim();
		EClass classifier = (EClass) classes.get(name);
		if (classifier != null) {
			IdEObject object = (IdEObject) ePackage.getEFactoryInstance().create(classifier);
			try {
				model.add(recordNumber, object);
			} catch (IfcModelInterfaceException e) {
				throw new DeserializeException(e);
			}
			((IdEObjectImpl) object).setExpressId(recordNumber);
			String realData = line.substring(indexOfFirstParen + 1, indexOfLastParen);
			int lastIndex = 0;
			EntityDefinition entityBN = schema.getEntityBN(name);
			if (entityBN == null) {
				throw new DeserializeException("Unknown entity " + name);
			}
			for (Attribute attribute : entityBN.getAttributesCached(true)) {
				if (attribute instanceof ExplicitAttribute) {
					if (!entityBN.isDerived(attribute.getName())) {
						EStructuralFeature structuralFeature = classifier.getEStructuralFeature(attribute.getName());
						if (structuralFeature == null) {
							throw new DeserializeException("Unknown feature " + classifier.getName() + "." + attribute.getName());
						}
						int nextIndex = StringUtils.nextString(realData, lastIndex);
						String val = null;
						try {
							val = realData.substring(lastIndex, nextIndex - 1).trim();
						} catch (Exception e) {
							int expected = 0;
							for (Attribute attribute2 : entityBN.getAttributesCached(true)) {
								if (attribute2 instanceof ExplicitAttribute) {
									expected++;
								}
							}
							throw new DeserializeException(classifier.getName() + " expects " + expected + " fields, but less found");
						}
						lastIndex = nextIndex;
						char firstChar = val.charAt(0);
						if (firstChar == '$') {
							object.eUnset(structuralFeature);
							if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
								EStructuralFeature doubleStringFeature = classifier.getEStructuralFeature(attribute.getName() + "AsString");
								object.eSet(doubleStringFeature, val);
							}
						} else if (firstChar == '#') {
							readReference(val, object, structuralFeature);
						} else if (firstChar == '.') {
							readEnum(val, object, structuralFeature);
						} else if (firstChar == '(') {
							readList(val, object, structuralFeature);
						} else if (firstChar == '*') {
						} else {
							if (!structuralFeature.isMany()) {
								object.eSet(structuralFeature, convert(structuralFeature.getEType(), val));
								if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
									EStructuralFeature doubleStringFeature = classifier.getEStructuralFeature(attribute.getName() + "AsString");
									object.eSet(doubleStringFeature, val);
								}
							} else {
								// It's not a list in the file, but it is in the
								// schema??
							}
						}
					} else {
						int nextIndex = StringUtils.nextString(realData, lastIndex);
						lastIndex = nextIndex;
					}
				}
			}
			if (waitingList.containsKey(recordNumber)) {
				waitingList.updateNode(recordNumber, classifier, object);
			}
		} else {
			throw new DeserializeException(name + " is not a known entity");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void readList(String val, EObject object, EStructuralFeature structuralFeature) throws DeserializeException {
		int index = 0;
		if (!structuralFeature.isMany()) {
			throw new DeserializeException("Field " + structuralFeature.getName() + " of " + structuralFeature.getEContainingClass().getName() + " is no aggregation");
		}
		AbstractEList list = (AbstractEList) object.eGet(structuralFeature);
		AbstractEList doubleStringList = null;
		if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
			EStructuralFeature doubleStringFeature = structuralFeature.getEContainingClass().getEStructuralFeature(structuralFeature.getName() + "AsString");
			if (doubleStringFeature == null) {
				throw new DeserializeException("Field not found: " + structuralFeature.getName() + "AsString");
			}
			doubleStringList = (AbstractEList) object.eGet(doubleStringFeature);
		}
		String realData = val.substring(1, val.length() - 1);
		int lastIndex = 0;
		while (lastIndex != realData.length() + 1) {
			int nextIndex = StringUtils.nextString(realData, lastIndex);
			String stringValue = realData.substring(lastIndex, nextIndex - 1).trim();
			lastIndex = nextIndex;
			if (stringValue.length() > 0) {
				if (stringValue.charAt(0) == '#') {
					Long referenceId = Long.parseLong(stringValue.substring(1));
					if (model.contains(referenceId)) {
						EObject referencedObject = model.get(referenceId);
						if (referencedObject != null) {
							EClass referenceEClass = referencedObject.eClass();
							if (((EClass) structuralFeature.getEType()).isSuperTypeOf(referenceEClass)) {
								while (list.size() <= index) {
									list.addUnique(ePackage.getEFactoryInstance().create(referenceEClass));
								}
								list.setUnique(index, referencedObject);
							} else {
								throw new DeserializeException(referenceEClass.getName() + " cannot be stored in " + structuralFeature.getName());
							}
						}
					} else {
						waitingList.add(referenceId, new ListWaitingObject(object, structuralFeature, index));
					}
				} else {
					Object convert = convert(structuralFeature.getEType(), stringValue);
					if (convert != null) {
						while (list.size() <= index) {
							if (doubleStringList != null) {
								doubleStringList.addUnique(stringValue);
							}
							list.addUnique(convert);
						}
						if (doubleStringList != null) {
							doubleStringList.setUnique(index, stringValue);
						}
						list.setUnique(index, convert);
					}
				}
			}
			index++;
		}
	}

	private Object convertSimpleValue(Class<?> instanceClass, String value) throws DeserializeException {
		if (!value.equals("")) {
			if (instanceClass == Integer.class || instanceClass == int.class) {
				return Integer.parseInt(value);
			} else if (instanceClass == Long.class || instanceClass == long.class) {
				return Long.parseLong(value);
			} else if (instanceClass == Boolean.class || instanceClass == boolean.class) {
				return Boolean.parseBoolean(value);
			} else if (instanceClass == Double.class || instanceClass == double.class) {
				try {
					return Double.parseDouble(value);
				} catch (NumberFormatException e) {
					throw new DeserializeException("Incorrect double floating point value", e);
				}
			} else if (instanceClass == String.class) {
				if (value.startsWith("'") && value.endsWith("'")) {
					return readString(value);
				} else {
					return value;
				}
			}
		}
		return null;
	}

	private String readString(String value) throws DeserializeException {
		String result = value.substring(1, value.length() - 1);
		try {
			return StepStringDecoder.decode(result);
		} catch (Exception e) {
			throw new DeserializeException(e);
		}
	}

	private Object convert(EClassifier classifier, String value) throws DeserializeException {
		if (classifier != null) {
			if (classifier instanceof EClassImpl) {
				if (null != ((EClassImpl) classifier).getEStructuralFeature(WRAPPED_VALUE)) {
					IdEObject create = (IdEObject) ePackage.getEFactoryInstance().create((EClass) classifier);
					Class<?> instanceClass = create.eClass().getEStructuralFeature(WRAPPED_VALUE).getEType().getInstanceClass();
					if (value.equals("")) {

					} else {
						if (instanceClass == Integer.class || instanceClass == int.class) {
							try {
								create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Integer.parseInt(value));
							} catch (NumberFormatException e) {
								throw new DeserializeException(value + " is not a valid integer value");
							}
						} else if (instanceClass == Long.class || instanceClass == long.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Long.parseLong(value));
						} else if (instanceClass == Boolean.class || instanceClass == boolean.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), value.equals(".T."));
						} else if (instanceClass == Double.class || instanceClass == double.class) {
							try {
								create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Double.parseDouble(value));
							} catch (NumberFormatException e) {
								throw new DeserializeException(value + " is not a valid double floating point number");
							}
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE + "AsString"), value);
						} else if (instanceClass == String.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), readString(value));
						} else if (instanceClass.getSimpleName().equals("Tristate")) {
							Object tristate = null;
							if (value.equals(".T.")) {
								tristate = createEnumerator("Tristate", "TRUE");
							} else if (value.equals(".F.")) {
								tristate = createEnumerator("Tristate", "FALSE");
							} else if (value.equals(".U.")) {
								tristate = createEnumerator("Tristate", "UNDEFINED");
							}
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), tristate);
						}
					}
					return create;
				} else {
					return processInline(classifier, value);
				}
			} else if (classifier instanceof EDataType) {
				return convertSimpleValue(classifier.getInstanceClass(), value);
			}
		}
		return null;
	}

	private Object processInline(EClassifier classifier, String value) throws DeserializeException {
		if (value.indexOf("(") != -1) {
			String typeName = value.substring(0, value.indexOf("(")).trim();
			String v = value.substring(value.indexOf("(") + 1, value.length() - 1);
			EClassifier eClassifier = classes.get(typeName);
			if (eClassifier instanceof EClass) {
				EClass cl = (EClass) classes.get(typeName);
				if (cl == null) {
					DefinedType typeBN = schema.getTypeBN(typeName);
					if (typeBN == null) {
						throw new DeserializeException(typeName + " is not an existing IFC entity");
					}
					return convertSimpleValue(typeBN.getDomain(), v);
				} else {
					Object convert = convert(cl, v);
					try {
						model.add(-1, (IdEObject) convert);
					} catch (IfcModelInterfaceException e) {
						throw new DeserializeException(e);
					}
					return convert;
				}
			} else {
				throw new DeserializeException(typeName + " is not an existing IFC entity");
			}
		} else {
			return convertSimpleValue(classifier.getInstanceClass(), value);
		}
	}

	private Object convertSimpleValue(UnderlyingType domain, String value) {
		if (!value.equals("")) {
			if (domain instanceof RealType) {
				return Double.parseDouble(value);
			} else if (domain instanceof IntegerType) {
				return Long.parseLong(value);
			} else if (domain instanceof BooleanType) {
				return Boolean.parseBoolean(value);
			} else if (domain instanceof StringType) {
				return value;
			}
		}
		return null;
	}

	private void readEnum(String val, EObject object, EStructuralFeature structuralFeature) throws DeserializeException {
		if (val.equals(".T.")) {
			if (structuralFeature.getEType().getName().equals("Tristate")) {
				object.eSet(structuralFeature, createEnumerator("Tristate", "TRUE"));
			} else if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				EClass eClass = (EClass) classes.get("IfcBoolean");
				EObject bool = create(eClass);
				bool.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "TRUE"));
				object.eSet(structuralFeature, bool);
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				object.eSet(structuralFeature, true);
			} else {
				EClass eClass = (EClass) classes.get("IfcLogical");
				EObject logical = create(eClass);
				logical.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "TRUE"));
				object.eSet(structuralFeature, logical);
			}
		} else if (val.equals(".F.")) {
			if (structuralFeature.getEType().getName().equals("Tristate")) {
				object.eSet(structuralFeature, createEnumerator("Tristate", "FALSE"));
			} else if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				EClass eClass = (EClass) classes.get("IfcBoolean");
				EObject bool = create(eClass);
				bool.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "FALSE"));
				object.eSet(structuralFeature, bool);
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				object.eSet(structuralFeature, false);
			} else {
				EClass eClass = (EClass) classes.get("IfcLogical");
				EObject logical = create(eClass);
				logical.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "FALSE"));
				object.eSet(structuralFeature, logical);
			}
		} else if (val.equals(".U.")) {
			if (structuralFeature.getEType().getName().equals("Tristate")) {
				object.eSet(structuralFeature, createEnumerator("Tristate", "UNDEFINED"));
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				object.eUnset(structuralFeature);
			} else {
				EClass eClass = (EClass) classes.get("IfcLogical");
				EObject createIfcBoolean = create(eClass);
				createIfcBoolean.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "UNDEFINED"));
				object.eSet(structuralFeature, createIfcBoolean);
			}
		} else {
			if (structuralFeature.getEType() instanceof EEnumImpl) {
				String realEnumValue = val.substring(1, val.length() - 1);
				EEnumLiteral enumValue = (((EEnumImpl) structuralFeature.getEType()).getEEnumLiteral(realEnumValue));
				if (enumValue == null) {
					/*
					 *  Workaround for supporting IFC files from Revit.
					 */
					if ("NOTDEFINED".equals(realEnumValue)) {
						object.eUnset(structuralFeature);
					} else {
						throw new DeserializeException("Enum type " + structuralFeature.getEType().getName() + " has no literal value '" + realEnumValue + "'");
					}
				} else {
					object.eSet(structuralFeature, enumValue.getInstance());
				}
			} else {
				throw new DeserializeException("Value " + val + " indicates enum type but " + structuralFeature.getEType().getName() + " expected");
			}
		}
	}

	private void readReference(String val, EObject object, EStructuralFeature structuralFeature) throws DeserializeException {
		long referenceId;
		try {
			referenceId = Long.parseLong(val.substring(1));
		} catch (NumberFormatException e) {
			throw new DeserializeException("'" + val + "' is not a valid reference");
		}
		if (model.contains(referenceId)) {
			object.eSet(structuralFeature, model.get(referenceId));
		} else {
			waitingList.add(referenceId, new SingleWaitingObject(object, structuralFeature));
		}
	}

	public <T extends IdEObject> T create(EClass eClass) {
		if (eClass.getEPackage() == ePackage) {
		return (T) ePackage.getEFactoryInstance().create(eClass);
		}
		throw new RuntimeException("Mismatch");
	}

	public Object createEnumerator(String enumName, String literalName) {
		EClassifier eClassifier = ePackage.getEClassifier(enumName);
		if (eClassifier == null) {
			throw new RuntimeException("Classifier " + enumName + " not found in package " + ePackage.getName());
		}
		if (eClassifier instanceof EEnum) {
			EEnum eEnum = (EEnum)eClassifier;
			Object enumerator = ePackage.getEFactoryInstance().createFromString(eEnum, literalName);
			if (enumerator == null) {
				throw new RuntimeException("No enum literal " + literalName + " found on " + ePackage.getName() + "." + enumName);
			}
			return enumerator;
		} else {
			throw new RuntimeException("Classifier " + enumName + " is not of type enum");
		}
	}
}