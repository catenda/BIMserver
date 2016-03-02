package org.bimserver.ifc.step.deserializer.readonly;

interface StepAttributeList extends StepAttribute {

	StepAttribute get(int index);

	int length();

	StepAttributeIterator getAttributeIterator();

}
