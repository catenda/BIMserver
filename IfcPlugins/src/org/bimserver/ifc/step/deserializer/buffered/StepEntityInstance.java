package org.bimserver.ifc.step.deserializer.buffered;

interface StepEntityInstance {
	int getIndex();
	StepAttributeIterator getAttributeIterator();
	long getInstanceName();
	String getIdentifier();
}
