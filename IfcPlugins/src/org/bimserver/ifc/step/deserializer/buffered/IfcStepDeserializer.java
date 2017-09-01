package org.bimserver.ifc.step.deserializer.buffered;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Factory;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBoolean;
import org.bimserver.models.ifc2x3tc1.IfcLogical;
import org.bimserver.models.ifc2x3tc1.Tristate;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.EmfDeserializer;
import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.DefinedType;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.ExplicitAttribute;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.shared.ListWaitingObject;
import org.bimserver.shared.SingleWaitingObject;
import org.bimserver.shared.WaitingList;
import org.bimserver.utils.FakeClosingInputStream;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;

public class IfcStepDeserializer extends EmfDeserializer {

	private SchemaDefinition schema;
	
	private static final String WRAPPED_VALUE = "wrappedValue";
	
	private final WaitingList<Long> waitingList = new WaitingList<Long>();
	
	private static final Map<String, EClassifier> classes = initClasses();
	private static final EPackage ePackage = Ifc2x3tc1Package.eINSTANCE;
	
	private static Map<String, EClassifier> initClasses() {
		HashMap<String, EClassifier> classes = new HashMap<String, EClassifier>(
			Ifc2x3tc1Package.eINSTANCE.getEClassifiers().size());
		for (EClassifier classifier : Ifc2x3tc1Package.eINSTANCE.getEClassifiers()) {
			classes.put(classifier.getName().toUpperCase(), classifier);
		}
		return classes;
	}

	public void init(SchemaDefinition schema) {
		this.schema = schema;
	}

	public IfcModelInterface read(InputStream in, String filename, long fileSize) throws DeserializeException {
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

	public IfcModelInterface read(File sourceFile) throws DeserializeException {
		if (schema == null) {
			throw new DeserializeException("No schema");
		}
		try {
			FileInputStream in = new FileInputStream(sourceFile);
			IfcModelInterface model = read(in, sourceFile.length());
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

	private IfcModelInterface read(InputStream inputStream, long fileSize) throws DeserializeException {
		IfcModel model;
		try {
			StepExchange exchange = new StepParser(inputStream).parse();
			model = new IfcModel();
			model.getModelMetaData().setIfcHeader(StepHeaderParser.parseIfcHeader(exchange.getHeaderEntityIterator()));
			StepEntityInstanceIterator iterator = exchange.getDataEntityIterator();
			while (iterator.hasNext()) {
				createEntityInstance(iterator.next(), model);
			}
		} catch (IOException e) {
			throw new DeserializeException(e);
		}
		return model;
	}
	
	private Object createEntityOrTypeInstance(StepEntityInstance instance, IfcModel model) throws DeserializeException {
		String identifier = instance.getIdentifier();
		EClass classifier = (EClass) classes.get(identifier);
		if (classifier != null) {
			if (null != ((EClassImpl) classifier).getEStructuralFeature(WRAPPED_VALUE)) {
				IdEObject object = (IdEObject) ePackage.getEFactoryInstance().create((EClass) classifier);
				Class<?> instanceClass = object.eClass().getEStructuralFeature(WRAPPED_VALUE).getEType().getInstanceClass();
				StepAttributeIterator attributeIterator = instance.getAttributeIterator();
				if (attributeIterator.hasNext()) {
					StepAttribute stepAttribute = attributeIterator.next();
					Object value;
					if (stepAttribute.isEnum()) {
						value = createEnumValue((String) stepAttribute.getValue(), object.eClass().getEStructuralFeature(WRAPPED_VALUE));
					} else {
						value = stepAttribute.getValue();
					}

					if (instanceClass == Double.class || instanceClass == double.class) {
						Class<?> valueClass = value.getClass();
						if (valueClass == Integer.class) {
							value = Double.valueOf((Integer) value);
						} else if (valueClass == int.class) {
							value = Double.valueOf((int) value);
						} else if (valueClass == Long.class) {
							value = Double.valueOf((Long) value);
						} else if (valueClass == long.class) {
							value = Double.valueOf((long) value);
						}
					}

					object.eSet(object.eClass().getEStructuralFeature(WRAPPED_VALUE), value);
					if (instanceClass == Double.class || instanceClass == double.class) {
						object.eSet(object.eClass().getEStructuralFeature(WRAPPED_VALUE + "AsString"), stepAttribute.getTokenValue());
					}
				}
				return object;
			} else {
				return createEntityInstance(instance, model);
			}
		} else {
			return createTypeInstance(instance);
		}
	}

	private Object createTypeInstance(StepEntityInstance instance) throws DeserializeException {
		String identifier = instance.getIdentifier();
		DefinedType type = schema.getTypeBN(identifier);
		if (type == null) {
			throw new DeserializeException(identifier + " is not a known entity or type");
		}
		StepAttributeIterator attributeIterator = instance.getAttributeIterator();
		if (!attributeIterator.hasNext()) {
			return null;
		}
		return attributeIterator.next().getValue();
	}

	private IdEObject createEntityInstance(StepEntityInstance instance, IfcModel model) throws DeserializeException {
		String identifier = instance.getIdentifier();
		EClass classifier = (EClass) classes.get(identifier);
		if (classifier == null) {
			throw new DeserializeException(identifier + " is not a known entity");
		}

		EntityDefinition entityBN = schema.getEntityBN(identifier);
		if (entityBN == null) {
			throw new DeserializeException("Unknown entity " + identifier);
		}

		IdEObject object = (IdEObject) Ifc2x3tc1Factory.eINSTANCE.create(classifier);
		((IdEObjectImpl) object).setExpressId(instance.getInstanceName());

		try {
			model.add(((IdEObjectImpl) object).getExpressId(), object);
		} catch (IfcModelInterfaceException e) {
			throw new DeserializeException(e);
		}

		StepAttributeIterator attributeIterator = instance.getAttributeIterator();
		for (Attribute attribute : entityBN.getAttributesCached(true)) {
			if (!(attribute instanceof ExplicitAttribute)) {
				continue;
			}

			EStructuralFeature structuralFeature = classifier.getEStructuralFeature(attribute.getName());
			if (structuralFeature == null) {
				throw new DeserializeException("Unknown feature " + classifier.getName() + "." + attribute.getName());
			}

			if (!attributeIterator.hasNext()) {
				int expected = 0;
				for (Attribute item : entityBN.getAttributesCached(true)) {
					if (item instanceof ExplicitAttribute) {
						expected++;
					}
				}
				throw new DeserializeException(classifier.getName() + " expects " + expected + " fields, but less found");
			}

			StepAttribute stepAttribute = attributeIterator.next();
			if (stepAttribute.isRedeclared()) {
			} else if (stepAttribute.isUnset()) {
				object.eUnset(structuralFeature);
				if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
					object.eSet(classifier.getEStructuralFeature(attribute.getName() + "AsString"), null);
				}
			} else if (stepAttribute.isInstanceName()) {
				Long value = (Long) stepAttribute.getValue();
				if (model.contains(value)) {
					object.eSet(structuralFeature, model.get(value));
				} else {
					waitingList.add(value, new SingleWaitingObject(object, structuralFeature));
				}
			} else if (stepAttribute.isEnum()) {
				Object value = createEnumValue((String) stepAttribute.getValue(), structuralFeature);
				if (value == null) {
					object.eUnset(structuralFeature);
				} else {
					object.eSet(structuralFeature, value);
				}
			} else if (stepAttribute.isList()) {
				setListAttribute((StepAttributeList) stepAttribute, object, structuralFeature, model);
			} else if (stepAttribute.isInline()) {
				Object value = createEntityOrTypeInstance((StepEntityInstance) stepAttribute.getValue(), model);
				object.eSet(structuralFeature, value);
			} else {
				Object value = stepAttribute.getValue();
				object.eSet(structuralFeature, value);
				if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
					object.eSet(classifier.getEStructuralFeature(attribute.getName() + "AsString"), stepAttribute.getTokenValue());
				}
			}
		}
		
		if (waitingList.containsKey(instance.getInstanceName())) {
			waitingList.updateNode(instance.getInstanceName(), classifier, object);
		}

		return object;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void setListAttribute(StepAttributeList stepList, IdEObject object, EStructuralFeature structuralFeature, IfcModel model) throws DeserializeException {
		if (!structuralFeature.isMany()) {
			throw new DeserializeException("Field " + structuralFeature.getName() + " of " + structuralFeature.getEContainingClass().getName() + " is no aggregation");
		}
		if (stepList == null) {
			return;
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

		StepAttributeIterator attributeIterator = stepList.getAttributeIterator();
		int index = -1;
		while (attributeIterator.hasNext()) {
			index++;
			StepAttribute stepAttribute = attributeIterator.next();
			if (stepAttribute.isRedeclared()) {
				list.addUnique(null);
			} else if (stepAttribute.isUnset()) {
				list.addUnique(null);
			} else if (stepAttribute.isInstanceName()) {
				Long value = (Long) stepAttribute.getValue();
				if (model.contains(value)) {
					EObject referencedObject = model.get(value);
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
					waitingList.add(value, new ListWaitingObject(object, structuralFeature, index));
				}
			} else if (stepAttribute.isEnum()) {
				Object value = createEnumValue((String) stepAttribute.getValue(), structuralFeature);
				list.addUnique(value);
			} else if (stepAttribute.isList()) {
			} else if (stepAttribute.isInline()) {
				Object value = createEntityOrTypeInstance((StepEntityInstance) stepAttribute.getValue(), model);
				list.addUnique(value);
			} else {
				Object value = stepAttribute.getValue();
				if (value != null) {
					while (list.size() <= index) {
						if (doubleStringList != null) {
							doubleStringList.addUnique(stepAttribute.getTokenValue());
						}
						list.addUnique(value);
					}
					if (doubleStringList != null) {
						doubleStringList.setUnique(index, stepAttribute.getTokenValue());
					}
					list.setUnique(index, value);
				}
			}
		}
	}

	private Object createEnumValue(String value, EStructuralFeature structuralFeature) throws DeserializeException {
		Object enumValue;
		if (value.equals("T")) {
			if (structuralFeature.getEType() == Ifc2x3tc1Package.eINSTANCE.getTristate()) {
				enumValue = Tristate.TRUE;
			} else if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				IfcBoolean bool = Ifc2x3tc1Factory.eINSTANCE.createIfcBoolean();
				bool.setWrappedValue(Tristate.TRUE);
				enumValue = bool;
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				enumValue = true;
			} else {
				IfcLogical bool = Ifc2x3tc1Factory.eINSTANCE.createIfcLogical();
				bool.setWrappedValue(Tristate.TRUE);
				enumValue = bool;
			}
		} else if (value.equals("F")) {
			if (structuralFeature.getEType() == Ifc2x3tc1Package.eINSTANCE.getTristate()) {
				enumValue = Tristate.FALSE;
			} else if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				IfcBoolean bool = Ifc2x3tc1Factory.eINSTANCE.createIfcBoolean();
				bool.setWrappedValue(Tristate.FALSE);
				enumValue = bool;
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				enumValue = false;
			} else {
				IfcLogical bool = Ifc2x3tc1Factory.eINSTANCE.createIfcLogical();
				bool.setWrappedValue(Tristate.FALSE);
				enumValue = bool;
			}
		} else if (value.equals("U")) {
			if (structuralFeature.getEType() == Ifc2x3tc1Package.eINSTANCE.getTristate()) {
				enumValue = Tristate.UNDEFINED;
			} else if (structuralFeature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				enumValue = null;
			} else {
				IfcLogical bool = Ifc2x3tc1Factory.eINSTANCE.createIfcLogical();
				bool.setWrappedValue(Tristate.UNDEFINED);
				enumValue = bool;
			}
		} else {
			if (structuralFeature.getEType() instanceof EEnumImpl) {
				EEnumLiteral enumLiteral = (((EEnumImpl) structuralFeature.getEType()).getEEnumLiteral(value));
				if (enumLiteral == null) {
					/*
					 *  Workaround for supporting IFC files from Revit.
					 */
					if ("NOTDEFINED".equals(value)) {
						enumValue = null;
					} else {
						throw new DeserializeException("Enum type " + structuralFeature.getEType().getName() + " has no literal value '" + value + "'");
					}
				} else {
					enumValue = enumLiteral.getInstance();
				}
			} else {
				throw new DeserializeException("Value " + value + " indicates enum type but " + structuralFeature.getEType().getName() + " expected");
			}
		}
		return enumValue;
	}

}
