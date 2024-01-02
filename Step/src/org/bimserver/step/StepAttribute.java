package org.bimserver.step;

public interface StepAttribute {
	Object getValue();
	String getTokenValue();
	boolean isUnset();
	boolean isRedeclared();
	boolean isBinary();
	boolean isEnum();
	boolean isInline();
	boolean isInstanceName();
	boolean isList();
	boolean isInteger();
	boolean isReal();
	boolean isString();
}
