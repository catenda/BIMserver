package org.bimserver.ifc.step.deserializer.readonly;

interface StepAttribute {
	Object getValue();
	boolean isUnset();
	boolean isRedeclared();
	boolean isEnum();
	boolean isList();
	boolean isInstanceName();
	boolean isInline();
}
