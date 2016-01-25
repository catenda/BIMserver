package org.bimserver.ifc.step.deserializer.readonly;

interface StepEntityInstance {
	int getIndex();
	StepAttributeIterator getAttributeIterator();
	long getInstanceName();
	String getIdentifier();
}
