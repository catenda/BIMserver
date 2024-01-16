package org.bimserver.step;

import java.util.Iterator;

public class StepAttributeIterator implements Iterator<StepAttribute> {

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
		int tokenType = tokenBuffer.tokenAt(index).getType();
		return tokenType != StepTokenizer.TOKEN_RPAREN;
	}

	@Override
	public StepAttribute next() {
		StepToken token = tokenBuffer.tokenAt(index);
		StepAttribute attribute = null;
		switch (token.getType()) {
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
			if (tokenBuffer.tokenAt(index + 1).getType() == StepTokenizer.TOKEN_LPAREN) {
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
