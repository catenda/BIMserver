package org.bimserver.ifc.step.deserializer.buffered;

class StepAttributeImpl implements StepAttribute {

	private final ByteBuffer dataBuffer;
	private final TokenBuffer tokenBuffer;
	private final int index;

	public StepAttributeImpl(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
	}

	public int tokenLength() {
		return 1;
	}

	@Override
	public Object getValue() {
		long token = tokenBuffer.tokenAt(index);
		int offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		switch (StepTokenizer.tokenType(token)) {
		case StepTokenizer.TOKEN_INTEGER:
		{
			byte[] buffer = new byte[length];
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer);
			try {
				return Long.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid integer " + new String(buffer));
		}
		case StepTokenizer.TOKEN_REAL:
		{
			byte[] buffer = new byte[length];
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer);
			try {
				return Double.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid real " + new String(buffer));
		}
		case StepTokenizer.TOKEN_INSTANCE_NAME:
		{
			byte[] buffer = new byte[length];
			dataBuffer.bytesAt(buffer, offset, length);
			String str = new String(buffer);
			try {
				return Long.valueOf(str);
			} catch (NumberFormatException e) {
			}
			throw new RuntimeException("Invalid instance id " + new String(buffer));
		}
		case StepTokenizer.TOKEN_ENUM:
		{
			byte[] buffer = new byte[length];
			dataBuffer.bytesAt(buffer, offset, length);
			return new String(buffer);
		}
		case StepTokenizer.TOKEN_STRING:
		{
			byte[] buffer = new byte[length];
			dataBuffer.bytesAt(buffer, offset, length);
			return StepStringDecoder.decode(buffer);
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
		long token = tokenBuffer.tokenAt(index);
		int offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		byte[] buffer = new byte[length];
		dataBuffer.bytesAt(buffer, offset, length);
		return new String(buffer);
	}

	@Override
	public boolean isUnset() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) == StepTokenizer.TOKEN_UNSET;
	}

	public void markAsUnset() {
		long token = tokenBuffer.tokenAt(index);
		tokenBuffer.set(index, StepTokenizer.token(StepTokenizer.tokenType(StepTokenizer.TOKEN_UNSET), StepTokenizer.tokenPosition(token), StepTokenizer.tokenLength(token)));
	}

	@Override
	public boolean isRedeclared() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) == StepTokenizer.TOKEN_REDECLARED;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isInstanceName() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) == StepTokenizer.TOKEN_INSTANCE_NAME;
	}

	@Override
	public boolean isEnum() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) == StepTokenizer.TOKEN_ENUM;
	}

	@Override
	public boolean isInline() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) == StepTokenizer.TOKEN_IDENTIFIER &&
			StepTokenizer.tokenType(tokenBuffer.tokenAt(index + 1)) == StepTokenizer.TOKEN_LPAREN;
	}

}
