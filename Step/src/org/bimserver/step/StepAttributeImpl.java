package org.bimserver.step;

public class StepAttributeImpl implements StepAttribute {

	private final ByteBuffer dataBuffer;
	private final TokenBuffer tokenBuffer;
	private final int index;
	private long token;

	private static byte[] buffer = new byte[0];

	public StepAttributeImpl(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
		this.token = tokenBuffer.tokenAt(index);
	}

	public int tokenLength() {
		return 1;
	}

	@Override
	public Object getValue() {
		long offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		switch (StepTokenizer.tokenType(token)) {
		case StepTokenizer.TOKEN_INTEGER:
		{
			if (buffer.length < length) {
				buffer = new byte[length];
			}
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer, 0, length);
			try {
				return Long.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid integer " + new String(buffer));
		}
		case StepTokenizer.TOKEN_REAL:
		{
			if (buffer.length < length) {
				buffer = new byte[length];
			}
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer, 0, length);
			try {
				return Double.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid real " + new String(buffer));
		}
		case StepTokenizer.TOKEN_INSTANCE_NAME:
		{
			if (buffer.length < length) {
				buffer = new byte[length];
			}
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer, 0, length);
			try {
				return Long.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid instance id " + new String(buffer));
		}
		case StepTokenizer.TOKEN_ENUM:
		{
			if (buffer.length < length) {
				buffer = new byte[length];
			}
			dataBuffer.bytesAt(buffer, offset, length);
			return new String(buffer, 0, length);
		}
		case StepTokenizer.TOKEN_STRING:
		{
			if (buffer.length < length) {
				buffer = new byte[length];
			}
			dataBuffer.bytesAt(buffer, offset, length);
			return StepStringDecoder.decode(buffer, 0, length);
		}
		case StepTokenizer.TOKEN_IDENTIFIER:
			if (StepTokenizer.tokenType(tokenBuffer.tokenAt(index + 1)) == StepTokenizer.TOKEN_LPAREN) {
				return new StepEntityInstanceImpl(dataBuffer, tokenBuffer, index);
			} else {
				throw new RuntimeException("Missing attribute list for inline instance");
			}
		case StepTokenizer.TOKEN_UNSET:
		case StepTokenizer.TOKEN_REDECLARED:
			return null;
		default:
			throw new RuntimeException("Unknown token");
		}
	}

	public String getTokenValue() {
		long offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		if (buffer.length < length) {
			buffer = new byte[length];
		}
		dataBuffer.bytesAt(buffer, offset, length);
		return new String(buffer, 0, length);
	}

	@Override
	public boolean isUnset() {
		return StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_UNSET;
	}

	public void markAsUnset() {
		token = StepTokenizer.token(StepTokenizer.tokenType(StepTokenizer.TOKEN_UNSET), StepTokenizer.tokenPosition(token), StepTokenizer.tokenLength(token));
		tokenBuffer.set(index, token);
	}

	@Override
	public boolean isRedeclared() {
		return StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_REDECLARED;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isInstanceName() {
		return StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_INSTANCE_NAME;
	}

	@Override
	public boolean isEnum() {
		return StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_ENUM;
	}

	@Override
	public boolean isInline() {
		return StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_IDENTIFIER &&
			StepTokenizer.tokenType(tokenBuffer.tokenAt(index + 1)) == StepTokenizer.TOKEN_LPAREN;
	}

}
