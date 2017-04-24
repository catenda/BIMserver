package org.bimserver.ifc.step.deserializer.buffered;

interface StepAttributeList extends StepAttribute {

	StepAttribute get(int index);

	int length();

	StepAttributeIterator getAttributeIterator();

}
