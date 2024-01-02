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
		return tokenType != StepToken.TOKEN_RPAREN;
	}

	@Override
	public StepAttribute next() {
		StepToken token = tokenBuffer.tokenAt(index);
		StepAttribute attribute = null;
		switch (token.getType()) {
			case StepToken.TOKEN_INTEGER:
			case StepToken.TOKEN_REAL:
			case StepToken.TOKEN_STRING:
			case StepToken.TOKEN_UNSET:
			case StepToken.TOKEN_REDECLARED:
			case StepToken.TOKEN_INSTANCE_NAME:
			case StepToken.TOKEN_ENUM:
			case StepToken.TOKEN_BINARY:
				attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, index);
				break;
			case StepToken.TOKEN_IDENTIFIER:
				attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, index);
				if (tokenBuffer.tokenAt(index + 1).getType() == StepToken.TOKEN_LPAREN) {
					int listLength = new StepAttributeListImpl(dataBuffer,
							tokenBuffer, index + 1).tokenLength();
					index += listLength;
				}
				break;
			case StepToken.TOKEN_LPAREN:
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
