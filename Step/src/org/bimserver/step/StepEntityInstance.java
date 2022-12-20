package org.bimserver.step;

public interface StepEntityInstance {
	int getIndex();
	StepAttributeIterator getAttributeIterator();
	long getInstanceName();
	String getIdentifier();
}
