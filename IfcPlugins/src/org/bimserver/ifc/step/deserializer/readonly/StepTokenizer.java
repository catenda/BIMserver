package org.bimserver.ifc.step.deserializer.readonly;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

class StepTokenizer {
	public static final byte POSITION_BITS = 32;
	public static final byte LENGTH_BITS = 27;
	public static final byte TYPE_BITS = 5;

	public static final byte TOKEN_BEGIN_EXCHANGE = 0;
	public static final byte TOKEN_END_EXCHANGE = 1;
	public static final byte TOKEN_HEADER = 2;
	public static final byte TOKEN_DATA = 3;
	public static final byte TOKEN_ENDSEC = 4;
	public static final byte TOKEN_IDENTIFIER = 5;
	public static final byte TOKEN_ENUM = 6;
	public static final byte TOKEN_INSTANCE_NAME = 7;
	public static final byte TOKEN_INTEGER = 8;
	public static final byte TOKEN_REAL= 9;
	public static final byte TOKEN_STRING = 10;
	public static final byte TOKEN_UNSET = 11;
	public static final byte TOKEN_REDECLARED = 12;
	public static final byte TOKEN_EQUAL = 13;
	public static final byte TOKEN_LPAREN = 14;
	public static final byte TOKEN_RPAREN = 15;
	public static final byte TOKEN_COMMA = 16;
	public static final byte TOKEN_SEMICOLON = 17;
	public static final byte TOKEN_EOF = 18;

	public static byte[] BEGIN_EXCHANGE = "ISO-10303-21".getBytes();
	public static byte[] END_EXCHANGE = "END-ISO-10303-21".getBytes();
	public static byte[] HEADER = "HEADER".getBytes();
	public static byte[] DATA = "DATA".getBytes();
	public static byte[] ENDSEC = "ENDSEC".getBytes();

	private ByteBuffer dataBuffer;
	private TokenBuffer tokenBuffer;

	private int dataPosition;
	private long token;

	private static class ListElement {
		public int index;
		public int length;
	}

	private Deque<ListElement> listStack = new ArrayDeque<ListElement>();

	public StepTokenizer(ByteBuffer dataBuffer, TokenBuffer tokenBuffer) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
	}

	public ByteBuffer getDataBuffer() {
		return dataBuffer;
	}

	public TokenBuffer getTokenBuffer() {
		return tokenBuffer;
	}

	public void parseToken() throws IOException {
		boolean parsed = false;
		skipWhitespace();
		byte c = dataBuffer.byteAt(dataPosition);
		switch (c) {
		case '+':
		case '-':
			parseNumber();
			parsed = true;
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			parseNumber();
			parsed = true;
			break;
		case '(':
		{
			ListElement elmt = new ListElement();
			elmt.index = tokenBuffer.length();
			elmt.length = 0;
			listStack.push(elmt);

			tokenBuffer.append((token = token(TOKEN_LPAREN, 1)));
			parsed = true;
			break;
		}
		case ')':
		{
			if (listStack.isEmpty()) {
				throw new StepParseException("Unexpected character )");
			}
			ListElement elmt = listStack.pop();
			if (elmt.index != tokenBuffer.length() - 1) {
				elmt.length++;
			}
			tokenBuffer.set(elmt.index, token(TOKEN_LPAREN, elmt.length << 1));

			tokenBuffer.append((token = token(TOKEN_RPAREN, 1)));
			parsed = true;
			break;
		}
		case ',':
			listStack.peek().length++;
			token = token(TOKEN_COMMA, 1);
			parsed = true;
			break;
		case '\'':
			parseString();
			parsed = true;
			break;
		case '.':
			parseEnum();
			parsed = true;
			break;
		case '#':
			parseInstanceName();
			parsed = true;
			break;
		case '$':
			tokenBuffer.append((token = token(TOKEN_UNSET, 1)));
			parsed = true;
			break;
		case '*':
			tokenBuffer.append((token = token(TOKEN_REDECLARED, 1)));
			parsed = true;
			break;
		case '=':
			tokenBuffer.append((token = token(TOKEN_EQUAL, 1)));
			parsed = true;
			break;
		case ';':
			token = token(TOKEN_SEMICOLON, 1);
			parsed = true;
			break;
		case 'I':
			parsed = parseKeyword(BEGIN_EXCHANGE, TOKEN_BEGIN_EXCHANGE);
			break;
		case 'E':
			parsed = parseKeyword(ENDSEC, TOKEN_ENDSEC)
					|| parseKeyword(END_EXCHANGE, TOKEN_END_EXCHANGE);
			break;
		case 'H':
			parsed = parseKeyword(HEADER, TOKEN_HEADER);
			break;
		case 'D':
			parsed = parseKeyword(DATA, TOKEN_DATA);
			break;
		default:
			break;
		}
		if (!parsed) {
			if (!parseIdentifier()) {
				throw new StepParseException(String.format(
						"Unexpected character %c", c));
			}
		}
	}

	private void skipWhitespace() {
		while (true) {
			byte c = dataBuffer.byteAt(dataPosition);
			switch (c) {
			case '/':
				if (dataBuffer.byteAt(dataPosition + 1) == '*') {
					skipComment();
				} else {
					return;
				}
				break;
			case '\n':
			case 13:
			case '\t':
			case ' ':
				dataPosition++;
				continue;
			default:
				return;
			}
		}
	}

	private void skipComment() {
		dataPosition += 2;
		while (true) {
			byte c = dataBuffer.byteAt(dataPosition);
			switch (c) {
			case '*':
				if (dataBuffer.byteAt(dataPosition + 1) == '/') {
					dataPosition += 2;
					return;
				} else {
					dataPosition++;
				}
				break;
			case '/':
				if (dataBuffer.byteAt(dataPosition + 1) == '*') {
					skipComment();
				} else {
					dataPosition++;
				}
				break;
			default:
				dataPosition++;
				break;
			}
		}
		
	}

	private boolean parseKeyword(byte[] keyword, byte keywordToken) {
		if (dataBuffer.length() < dataPosition + keyword.length) {
			return false;
		}
		for (int i = 0; i < keyword.length; i++) {
			if (keyword[i] != dataBuffer.byteAt(dataPosition + i)) {
				return false;
			}
		}
		if (dataBuffer.length() == dataPosition + keyword.length) {
			tokenBuffer.append((token = token(keywordToken, keyword.length)));
			return true;
		} else {
			byte c = dataBuffer.byteAt(dataPosition + keyword.length);
			switch (c) {
			case ';':
			case '\t':
			case '\n':
			case ' ':
				tokenBuffer.append((token = token(keywordToken, keyword.length)));
				return true;
			default:
				return false;
			}
		}
	}

	private void parseInstanceName() {
		int i = dataPosition + 1;
		for (;; i++) {
			if (i >= dataBuffer.length()) {
				break;
			}
			byte c = dataBuffer.byteAt(i);
			if (c < '0' || c > '9') {
				break;
			}
		}
		tokenBuffer.append((token = token(TOKEN_INSTANCE_NAME, dataPosition + 1, i
				- dataPosition - 1)));
	}

	private void parseNumber() {
		byte c = 0;
		int i = dataPosition + 1;
		for (;; i++) {
			if (i >= dataBuffer.length()) {
				break;
			}
			c = dataBuffer.byteAt(i);
			if (c < '0' || c > '9') {
				break;
			}
		}
		if (c == '.') {
			for (i++;; i++) {
				if (i >= dataBuffer.length()) {
					break;
				}
				c = dataBuffer.byteAt(i);
				if (c < '0' || c > '9') {
					break;
				}
			}
			if (c == 'E') {
				for (i++;;) {
					if (i >= dataBuffer.length()) {
						break;
					}
					c = dataBuffer.byteAt(i);
					if (c == '-' || c == '+') {
						i++;
					}
					for (;; i++) {
						if (i >= dataBuffer.length()) {
							break;
						}
						c = dataBuffer.byteAt(i);
						if (c < '0' || c > '9') {
							break;
						}
					}
					break;
				}
			}
			tokenBuffer.append((token = token(TOKEN_REAL, i - dataPosition)));
		} else {
			tokenBuffer.append((token = token(TOKEN_INTEGER, i - dataPosition)));
		}
	}

	private void parseString() throws EOFException, StepParseException {
		int i = dataPosition + 1;
		for (;; i++) {
			if (i >= dataBuffer.length()) {
				throw new EOFException();
			}
			byte c = dataBuffer.byteAt(i);
			if (c == '\'') {
				if (dataBuffer.byteAt(i + 1) == '\'') {
					i++;
				} else {
					break;
				}
			} else if (c == '\\') {
				if (i  + 3 >= dataBuffer.length()) {
					throw new EOFException();
				}
				// Ignore testing for end-of-string in \S control code to
				// support the character § encoded as \S\'
				if (dataBuffer.byteAt(i + 1) == 'S' && dataBuffer.byteAt(i + 2) == '\\') {
					i += 3;
				}
			}
		}
		validateControlCodes(dataPosition + 1, i - dataPosition - 1);
		tokenBuffer.append((token = token(TOKEN_STRING, dataPosition + 1, i
				- dataPosition - 1)));
	}

	private void validateControlCodes(int position, int length) throws StepParseException {
	    int index = position;
        while (index - position < length) {

            char c = (char) dataBuffer.byteAt(index);
            switch (c) {

            case '\'':

                switch ((char) dataBuffer.byteAt(index + 1)) {

                case '\'':
                    index += 2;
                    break;

                default:
                    throw new StepParseException("Invalid string");

                }

                break;

            case '\\':

                switch ((char) dataBuffer.byteAt(index + 1)) {

                case '\\':
                    index += 2;
                    break;

                case 'S':
                    if ((char) dataBuffer.byteAt(index + 2) == '\\') {
                        index += 4;
                    } else {
                        index++;
                    }
                    break;

                case 'P':
                    index += 4;
                    break;

                case 'X':
                    switch ((char) dataBuffer.byteAt(index + 2)) {

                    case '\\': {
                        index += 5;
                    }
                        break;
                    case '2': {
                        if ((char) dataBuffer.byteAt(index + 3) != '\\') {
                            throw new StepParseException("Expected \\");
                        }
                        int i = index + 4;
                        do {
                            i += 4;
                        } while ((char) dataBuffer.byteAt(i) != '\\');
                        index = i + 4;
                    }
                        break;
                    case '4': {
                        if ((char) dataBuffer.byteAt(index + 3) != '\\') {
                            throw new StepParseException("Expected \\");
                        }
                        int i = index + 4;
                        do {
                            i += 8;
                        } while ((char) dataBuffer.byteAt(i) != '\\');
                        index = i + 4;
                    }
                        break;
                    }

                    break;

                default:
                    throw new StepParseException("Unknown control code \\" + (char) dataBuffer.byteAt(index + 1));

                }

                break;
            default:
                index++;
                break;
            }
        }
    }

    private boolean parseIdentifier() {
		byte c = dataBuffer.byteAt(dataPosition);
		if (c >= 'A' && c <= 'Z') {
			int i = dataPosition + 1;
			for (;; i++) {
				if (i >= dataBuffer.length()) {
					break;
				}
				c = dataBuffer.byteAt(i);
				if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '_')) {
					break;
				}
			}
			tokenBuffer.append((token = token(TOKEN_IDENTIFIER, dataPosition, i
					- dataPosition)));
			return true;
		} else {
			return false;
		}
	}

	private void parseEnum() throws EOFException {
		int i = dataPosition + 1;
		for (;; i++) {
			if (i >= dataBuffer.length()) {
				throw new EOFException();
			}
			byte c = dataBuffer.byteAt(i);
			if (c == '.') {
				break;
			}
		}
		tokenBuffer.append((token = token(TOKEN_ENUM, dataPosition + 1, i - dataPosition
				- 1)));
	}

	private long token(byte type, int length) {
		return token(type, dataPosition, length);
	}

	static long token(byte type, int position, int length) {
		return ((long) position << POSITION_BITS) | (length << TYPE_BITS)
				| (type & ((1 << TYPE_BITS) - 1));
	}

	public byte tokenType() {
		return tokenType(token);
	}

	public static byte tokenType(long token) {
		return (byte) (token & ((1 << TYPE_BITS) - 1));
	}

	public int tokenPosition() {
		return tokenPosition(token);
	}

	public static int tokenPosition(long token) {
		return (int) (token >> POSITION_BITS);
	}

	public int tokenLength() {
		return tokenLength(token);
	}

	public static int tokenLength(long token) {
		return (int) ((token >> TYPE_BITS) & ((1 << LENGTH_BITS) - 1));
	}

	public void tokenValue(byte[] buffer) {
		dataBuffer.bytesAt(buffer, tokenPosition(), tokenLength());
	}

	public boolean nextToken() {
		if (tokenBuffer.length() > 0) {
			switch (tokenType()) {
			case TOKEN_INSTANCE_NAME:
				dataPosition += tokenLength() + 1;
				break;
			case TOKEN_ENUM:
			case TOKEN_STRING:
				dataPosition += tokenLength() + 2;
				break;
			default:
				dataPosition += tokenLength();
				break;
			}
		}
		return dataPosition < dataBuffer.length();
	}
}
