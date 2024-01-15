package org.bimserver.step;

public interface StepAttributeList extends StepAttribute {

	StepAttribute get(int index);

	int length();

	StepAttributeIterator getAttributeIterator();

}
