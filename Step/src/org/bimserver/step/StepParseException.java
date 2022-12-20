package org.bimserver.step;

import java.io.IOException;

public class StepParseException extends IOException {
	private static final long serialVersionUID = 1L;

	public StepParseException(String message) {
		super(message);
	}
}
