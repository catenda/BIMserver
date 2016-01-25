package org.bimserver.ifc.step.deserializer.readonly;

class StepEntityInstanceImpl implements StepEntityInstance {

	private final ByteBuffer dataBuffer;
	private final TokenBuffer tokenBuffer;
	private final int index;

	public StepEntityInstanceImpl(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
	}

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public StepAttributeIterator getAttributeIterator() {
		int i = index;
		long token = tokenBuffer.tokenAt(i++);
		if (StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_INSTANCE_NAME) {
			token = tokenBuffer.tokenAt(i++);
			if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_EQUAL) {
				throw new RuntimeException();
			}
			token = tokenBuffer.tokenAt(i++);
		}
		if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_IDENTIFIER) {
			throw new RuntimeException();
		}
		return new StepAttributeIterator(dataBuffer, tokenBuffer, i);
	}

	public int tokenLength() {
		int length = 0;
		int i = index;
		long token = tokenBuffer.tokenAt(i++);
		if (StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_INSTANCE_NAME) {
			length++;
			token = tokenBuffer.tokenAt(i++);
			if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_EQUAL) {
				throw new RuntimeException();
			}
			length++;
			token = tokenBuffer.tokenAt(i++);
		}
		if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_IDENTIFIER) {
			throw new RuntimeException();
		}
		length++;

		int listLength = new StepAttributeListImpl(dataBuffer, tokenBuffer, i).tokenLength();
		i += listLength;
		length += listLength;

		return length;
	}

	@Override
	public String getIdentifier() {
		int i = index;
		long token = tokenBuffer.tokenAt(i++);
		if (StepTokenizer.tokenType(token) == StepTokenizer.TOKEN_INSTANCE_NAME) {
			token = tokenBuffer.tokenAt(i++);
			if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_EQUAL) {
				throw new RuntimeException();
			}
			token = tokenBuffer.tokenAt(i++);
		}
		if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_IDENTIFIER) {
			throw new RuntimeException();
		}

		int offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		byte[] buffer = new byte[length];
		dataBuffer.bytesAt(buffer, offset, length);
		return new String(buffer);
	}

	@Override
	public long getInstanceName() {
		long token = tokenBuffer.tokenAt(index);
		if (StepTokenizer.tokenType(token) != StepTokenizer.TOKEN_INSTANCE_NAME) {
			return -1;
		}
		int offset = StepTokenizer.tokenPosition(token);
		int length = StepTokenizer.tokenLength(token);
		byte[] buffer = new byte[length];
		dataBuffer.bytesAt(buffer, offset, length);
		return Long.parseLong(new String(buffer));
	}

}
