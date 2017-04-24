package org.bimserver.ifc.step.deserializer.buffered;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.bimserver.interfaces.objects.SIfcHeader;

abstract class StepHeaderParser {

	public static SIfcHeader parseIfcHeader(StepEntityInstanceIterator it) {
		SIfcHeader ifcHeader = new SIfcHeader();
		while (it.hasNext()) {
			StepEntityInstance instance = it.next();
			String identifier = instance.getIdentifier();
			if (identifier.equals("FILE_DESCRIPTION")) {
				/*
				ENTITY file_description;
				  description          : LIST [1:?] OF STRING (256) ;
				  implementation_level : STRING (256) ;
				END_ENTITY;
				*/
				StepAttributeIterator attributeIt = instance.getAttributeIterator();

				StepAttributeList description = (StepAttributeList) attributeIt.next();
				StepAttributeIterator descriptionIt = description.getAttributeIterator();
				while (descriptionIt.hasNext()) {
					ifcHeader.getDescription().add((String) descriptionIt.next().getValue());
				}

				StepAttribute implementationLevel = attributeIt.next();
				ifcHeader.setImplementationLevel((String) implementationLevel.getValue());

			} else if (identifier.equals("FILE_NAME")) {
				/*
				ENTITY file_name;
				  name                 : STRING (256) ;
				  time_stamp           : time_stamp_text ;
				  author               : LIST [ 1 : ? ] OF STRING (256) ;
				  organization         : LIST [ 1 : ? ] OF STRING (256) ;
				  preprocessor_version : STRING (256) ;
				  originating_system   : STRING (256) ;
				  authorization        : STRING (256) ;
				END_ENTITY;
				*/
				StepAttributeIterator attributeIt = instance.getAttributeIterator();

				StepAttribute name = attributeIt.next();
				ifcHeader.setFilename((String) name.getValue());

				StepAttribute timeStamp = attributeIt.next();
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss");
					ifcHeader.setTimeStamp(dateFormat.parse((String) timeStamp.getValue()));
				} catch (ParseException e) {
					throw new RuntimeException("Invalid time_stamp format", e);
				}

				StepAttributeList author = (StepAttributeList) attributeIt.next();
				StepAttributeIterator authorIt = author.getAttributeIterator();
				while (authorIt.hasNext()) {
					ifcHeader.getAuthor().add((String) authorIt.next().getValue());
				}

				StepAttributeList organization = (StepAttributeList) attributeIt.next();
				StepAttributeIterator organizationIt = organization.getAttributeIterator();
				while (organizationIt.hasNext()) {
					ifcHeader.getOrganization().add((String) organizationIt.next().getValue());
				}

				StepAttribute preProcessorVersion = attributeIt.next();
				ifcHeader.setPreProcessorVersion((String) preProcessorVersion.getValue());

				StepAttribute originatingSystem = attributeIt.next();
				ifcHeader.setOriginatingSystem((String) originatingSystem.getValue());

				StepAttribute authorization = attributeIt.next();
				ifcHeader.setAuthorization((String) authorization.getValue());
			} else if (identifier.equals("FILE_SCHEMA")) {
				/*
				ENTITY file_schema;
				  schema_identifiers : LIST [1:?] OF UNIQUE schema_name;
				END_ENTITY;
				*/
				StepAttributeIterator attributeIt = instance.getAttributeIterator();

				StepAttributeList schemaIdentifiers = (StepAttributeList) attributeIt.next();
				StepAttributeIterator schemaIdentifiersIt = schemaIdentifiers.getAttributeIterator();
				while (schemaIdentifiersIt.hasNext()) {
					ifcHeader.setIfcSchemaVersion((String) schemaIdentifiersIt.next().getValue());
					break;
				}
			} else {
				throw new RuntimeException("Unkown header entity " + identifier);
			}
		}
		return ifcHeader;
	}

}
