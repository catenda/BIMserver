package org.bimserver.ifc.step.deserializer.readonly;

import java.util.Iterator;

class StepAttributeIterator implements Iterator<StepAttribute> {

	private ByteBuffer dataBuffer;
	private TokenBuffer tokenBuffer;
	private int index;

	public StepAttributeIterator(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index + 1;
	}

	@Override
	public boolean hasNext() {
		int tokenType = StepTokenizer.tokenType(tokenBuffer.tokenAt(index));
		return tokenType != StepTokenizer.TOKEN_RPAREN;
	}

	@Override
	public StepAttribute next() {
		long token = tokenBuffer.tokenAt(index);
		StepAttribute attribute = null;
		switch (StepTokenizer.tokenType(token)) {
		case StepTokenizer.TOKEN_INTEGER:
		case StepTokenizer.TOKEN_REAL:
		case StepTokenizer.TOKEN_STRING:
		case StepTokenizer.TOKEN_UNSET:
		case StepTokenizer.TOKEN_REDECLARED:
		case StepTokenizer.TOKEN_INSTANCE_NAME:
		case StepTokenizer.TOKEN_ENUM:
			attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, index);
			break;
		case StepTokenizer.TOKEN_IDENTIFIER:
			attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, index);
			if (StepTokenizer.tokenType(tokenBuffer.tokenAt(index + 1)) == StepTokenizer.TOKEN_LPAREN) {
				int listLength = new StepAttributeListImpl(dataBuffer,
						tokenBuffer, index + 1).tokenLength();
				index += listLength;
			}
			break;
		case StepTokenizer.TOKEN_LPAREN:
			StepAttributeListImpl list = new StepAttributeListImpl(
					dataBuffer, tokenBuffer, index);
			index += list.tokenLength() - 1;
			attribute = list;
			break;
		default:
			throw new RuntimeException();
		}
		index++;
		return attribute;
	}

	@Override
	public void remove() {
	}


}
