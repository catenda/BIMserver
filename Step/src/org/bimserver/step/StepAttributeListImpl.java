package org.bimserver.step;

import java.util.ArrayList;

import org.apache.commons.lang.builder.EqualsBuilder;

public class StepAttributeListImpl implements StepAttributeList {

	private final ByteBuffer dataBuffer;
	private final TokenBuffer tokenBuffer;
	private final int index;

	public StepAttributeListImpl(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StepAttributeListImpl))
			return false;
		if (obj == this)
			return true;
		StepAttributeListImpl other = (StepAttributeListImpl) obj;
		return new EqualsBuilder().append(dataBuffer, other.dataBuffer)
				.append(tokenBuffer, other.tokenBuffer)
				.append(index, other.index).isEquals();
	}

	public int tokenLength() {
		int length = 0;
		int i = index;
		StepToken token = tokenBuffer.tokenAt(i++);
		if (token.getType() != StepTokenizer.TOKEN_LPAREN) {
			throw new RuntimeException("Invalid state");
		}
		length++;
		token = tokenBuffer.tokenAt(i);
		if (token.getType() == StepTokenizer.TOKEN_RPAREN) {
			length++;
			return length;
		}
		while (true) {
			token = tokenBuffer.tokenAt(i++);
			switch (token.getType()) {
			case StepTokenizer.TOKEN_INTEGER:
			case StepTokenizer.TOKEN_REAL:
			case StepTokenizer.TOKEN_STRING:
			case StepTokenizer.TOKEN_UNSET:
			case StepTokenizer.TOKEN_REDECLARED:
			case StepTokenizer.TOKEN_INSTANCE_NAME:
			case StepTokenizer.TOKEN_ENUM:
				length++;
				break;
			case StepTokenizer.TOKEN_IDENTIFIER:
				length++;
				if (tokenBuffer.tokenAt(i).getType() == StepTokenizer.TOKEN_LPAREN) {
					int listLength = new StepAttributeListImpl(dataBuffer,
							tokenBuffer, i).tokenLength();
					i += listLength;
					length += listLength;
				}
				break;
			case StepTokenizer.TOKEN_LPAREN:
				int listLength = new StepAttributeListImpl(dataBuffer,
						tokenBuffer, i - 1).tokenLength();
				i += listLength - 1;
				length += listLength;
				break;
			case StepTokenizer.TOKEN_RPAREN:
				length++;
				return length;
			default:
				throw new RuntimeException("Unkonwn token");
			}
		}
	}

	@Override
	public StepAttribute get(int attributeIndex) {
		int i = index;
		StepToken token = tokenBuffer.tokenAt(i++);
		if (token.getType() != StepTokenizer.TOKEN_LPAREN) {
			throw new RuntimeException("Invalid state");
		}
		token = tokenBuffer.tokenAt(i);
		if (token.getType() == StepTokenizer.TOKEN_RPAREN) {
			throw new IndexOutOfBoundsException();
		}
		int currentAttributeIndex = 0;
		StepAttribute attribute = null;
		while (true) {
			token = tokenBuffer.tokenAt(i);
			switch (token.getType()) {
			case StepTokenizer.TOKEN_INTEGER:
			case StepTokenizer.TOKEN_REAL:
			case StepTokenizer.TOKEN_STRING:
			case StepTokenizer.TOKEN_UNSET:
			case StepTokenizer.TOKEN_REDECLARED:
			case StepTokenizer.TOKEN_INSTANCE_NAME:
			case StepTokenizer.TOKEN_ENUM:
				attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, i);
				i++;
				break;
			case StepTokenizer.TOKEN_IDENTIFIER:
				attribute = new StepAttributeImpl(dataBuffer, tokenBuffer, i);
				if (tokenBuffer.tokenAt(i + 1).getType() == StepTokenizer.TOKEN_LPAREN) {
					int listLength = new StepAttributeListImpl(dataBuffer,
							tokenBuffer, i + 1).tokenLength();
					i += listLength;
				}
				break;
			case StepTokenizer.TOKEN_LPAREN:
				StepAttributeListImpl list = new StepAttributeListImpl(
						dataBuffer, tokenBuffer, i);
				i += list.tokenLength() - 1;
				attribute = list;
				break;
			case StepTokenizer.TOKEN_RPAREN:
				throw new IndexOutOfBoundsException();
			default:
				throw new RuntimeException("Unkown token");
			}
			if (currentAttributeIndex == attributeIndex) {
				return attribute;
			}
			currentAttributeIndex++;
		}
	}

	@Override
	public StepAttributeIterator getAttributeIterator() {
		return new StepAttributeIterator(dataBuffer, tokenBuffer, index);
	}

	@Override
	public int length() {
		return rawLength() >> 1;
	}

	public int rawLength() {
		StepToken token = tokenBuffer.tokenAt(index);
		if (token.getType() != StepTokenizer.TOKEN_LPAREN) {
			throw new RuntimeException("Invalid state");
		}
		return token.getLength();
	}

	public void setRawLength(int length) {
		StepToken token = tokenBuffer.tokenAt(index);
		tokenBuffer.set(index, new StepToken(token.getType(), token.getPosition(), length));
	}

	@Override
	public Object getValue() {
		ArrayList<Object> list = new ArrayList<Object>();
		for (int i = 0; i < this.length(); i++) {
			list.add(this.get(i).getValue());
		}
		return list;
	}

	@Override
	public String getTokenValue() {
		return null;
	}
	
	@Override
	public boolean isUnset() {
		return false;
	}

	@Override
	public boolean isRedeclared() {
		return false;
	}

	@Override
	public boolean isList() {
		return true;
	}

	@Override
	public boolean isInstanceName() {
		return false;
	}

	@Override
	public boolean isEnum() {
		return false;
	}

	@Override
	public boolean isInline() {
		return false;
	}

}
