package org.bimserver.ifc.step.deserializer.buffered;

import java.io.IOException;

class StepParseException extends IOException {
	private static final long serialVersionUID = 1L;

	public StepParseException(String message) {
		super(message);
	}
}
