package org.bimserver.ifc.step.deserializer.readonly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.EmfDeserializer;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.utils.FakeClosingInputStream;

public class IfcStepReadOnlyDeserializer extends EmfDeserializer {

	private SchemaDefinition schema;
	private IfcModelInterface model;

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
			model = read(in, sourceFile.length());
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
		IfcModelInterface model;
		try {
			StepExchange exchange = new StepParser(inputStream).parse();
			model = new StepModel(exchange, schema);
		} catch (IOException e) {
			throw new DeserializeException(e);
		}
		return model;
	}

	public IfcModelInterface getModel() {
		return model;
	}
}