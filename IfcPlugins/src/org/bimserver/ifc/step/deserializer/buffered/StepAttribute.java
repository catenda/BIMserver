package org.bimserver.ifc.step.deserializer.buffered;

interface StepAttribute {
	Object getValue();
	String getTokenValue();
	boolean isUnset();
	boolean isRedeclared();
	boolean isEnum();
	boolean isList();
	boolean isInstanceName();
	boolean isInline();
}
