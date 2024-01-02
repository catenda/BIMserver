package org.bimserver.step;

import java.io.EOFException;

class StepTokenizer {

	public static byte[] BEGIN_EXCHANGE = "ISO-10303-21".getBytes();
	public static byte[] END_EXCHANGE = "END-ISO-10303-21".getBytes();
	public static byte[] HEADER = "HEADER".getBytes();
	public static byte[] DATA = "DATA".getBytes();
	public static byte[] ENDSEC = "ENDSEC".getBytes();

	private ByteBuffer dataBuffer;
	private long dataPosition;
	private long line = 1;

	private final static StepToken SENTINEL_TOKEN = new StepToken((byte) 0, 0L, 0);

	public StepTokenizer(ByteBuffer dataBuffer) {
		this.dataBuffer = dataBuffer;
	}

	public long getLine() {
		return line;
	}

	private byte peek(int i) {
		if (dataPosition + i >= dataBuffer.length()) {
			return 0;
		}
		return dataBuffer.byteAt(dataPosition + i);
	}

	private boolean atEnd() {
		return dataPosition >= dataBuffer.length();
	}

	private StepParseException unexpectedCharacter(byte c, String message) {
		String prefix;
		if (Character.isValidCodePoint(c)) {
			prefix = String.format("Unexpected character %c", c);
		} else {
			prefix = String.format("Unexpected character %#x", c);
		}

		return new StepParseException(prefix + ". " + message);
	}

	private static boolean isLower(byte c) {
		return (c >= 'a' && c <= 'z');
	}

	private static boolean isUpper(byte c) {
		return (c >= 'A' && c <= 'Z') || c == '_';
	}

	private static boolean isDigit(byte c) {
		return c >= '0' && c <= '9';
	}

	private boolean isHex(byte c) {
		return isDigit(c) || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
	}

	private static boolean isUpperOrDigit(byte c) {
		return isUpper(c) || isDigit(c);
	}

	public StepToken parseToken() throws EOFException, StepParseException {
		StepToken token = lex();
		if (token == SENTINEL_TOKEN) {
			return SENTINEL_TOKEN;
		}
		switch (token.getType()) {
			case StepToken.TOKEN_INSTANCE_NAME:
				dataPosition += token.getLength();
				break;
			case StepToken.TOKEN_BINARY:
			case StepToken.TOKEN_ENUM:
			case StepToken.TOKEN_STRING:
				dataPosition += token.getLength();
				break;
			default:
				dataPosition += token.getLength();
				break;
		}
		return token;
	}

	private StepToken lex() throws EOFException, StepParseException {
		skipWhitespace();

		if (atEnd()) {
			return makeToken(StepToken.TOKEN_EOF, 0);
		}

		byte c = peek(0);

		switch (c) {
			case '+':
			case '-':
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
				return parseNumber();
			case '(':
				return makeToken(StepToken.TOKEN_LPAREN, 1);
			case ')':
				return makeToken(StepToken.TOKEN_RPAREN, 1);
			case ',':
				return makeToken(StepToken.TOKEN_COMMA, 1);
			case '\'':
				return parseString();
			case '.':
				return parseEnum();
			case '"':
				return parseBinary();
			case '#':
				return parseInstanceName();
			case '$':
				return makeToken(StepToken.TOKEN_UNSET, 1);
			case '*':
				return makeToken(StepToken.TOKEN_REDECLARED, 1);
			case '=':
				return makeToken(StepToken.TOKEN_EQUAL, 1);
			case ';':
				return makeToken(StepToken.TOKEN_SEMICOLON, 1);
			default:
				return parseKeywordOrIdentifier();
		}
	}

	private void skipWhitespace() {
		while (true) {
			byte c = peek(0);
			switch (c) {
				case '/':
					if (peek(1) == '*') {
						skipComment();
					} else {
						return;
					}
					break;
				case '\n':
					line++;
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
			byte c = peek(0);
			switch (c) {
				case 0:
					return;
				case '*':
					if (peek(1) == '/') {
						dataPosition += 2;
						return;
					} else {
						dataPosition++;
					}
					break;
				case '/':
					if (peek(1) == '*') {
						skipComment();
					} else {
						dataPosition++;
					}
					break;
				case '\n':
					line++;
				default:
					dataPosition++;
					break;
			}
		}
	}

	private StepToken parseKeywordOrIdentifier() throws StepParseException {
		StepToken token;

		byte c = peek(0);

		switch (c) {
			case 'I':
				token = parseKeyword(BEGIN_EXCHANGE, StepToken.TOKEN_BEGIN_EXCHANGE);
				if (token != SENTINEL_TOKEN) {
					return token;
				}
				break;
			case 'E':
				token = parseKeyword(ENDSEC, StepToken.TOKEN_ENDSEC);
				if (token == SENTINEL_TOKEN) {
					token = parseKeyword(END_EXCHANGE, StepToken.TOKEN_END_EXCHANGE);
				}
				if (token != SENTINEL_TOKEN) {
					return token;
				}
				break;
			case 'H':
				token = parseKeyword(HEADER, StepToken.TOKEN_HEADER);
				if (token != SENTINEL_TOKEN) {
					return token;
				}
				break;
			case 'D':
				token = parseKeyword(DATA, StepToken.TOKEN_DATA);
				if (token != SENTINEL_TOKEN) {
					return token;
				}
				break;
		}

		token = parseIdentifier();
		if (token == SENTINEL_TOKEN) {
			throw unexpectedCharacter(c, "Unexpected identifier");
		} else {
			return token;
		}
	}

	private StepToken parseKeyword(byte[] keyword, byte keywordToken) {
		if (dataBuffer.length() < dataPosition + keyword.length) {
			return SENTINEL_TOKEN;
		}
		for (int i = 0; i < keyword.length; i++) {
			if (keyword[i] != peek(i)) {
				return SENTINEL_TOKEN;
			}
		}
		if (dataBuffer.length() == dataPosition + keyword.length) {
			return makeToken(keywordToken, keyword.length);
		} else {
			byte c = peek(keyword.length);
			switch (c) {
				case '\n':
					line++;
				case ';':
				case '\t':
				case ' ':
					return makeToken(keywordToken, keyword.length);
				default:
					return SENTINEL_TOKEN;
			}
		}
	}

	private StepToken parseIdentifier() {
		byte c = peek(0);
		if (isUpper(c)) {
			int i = 1;
			for (;; i++) {
				c = peek(i);
				if (!(isUpperOrDigit(c))) {
					break;
				}
			}
			return makeToken(StepToken.TOKEN_IDENTIFIER, i);
		} else {
			return SENTINEL_TOKEN;
		}
	}

	private StepToken parseInstanceName() throws EOFException, StepParseException {
		byte c = peek(1);

		if (c == 0) {
			throw new EOFException();
		} else if (!isDigit(c)) {
			throw unexpectedCharacter(c, "Expected digit");
		}

		int i = 2;
		for (;; i++) {
			c = peek(i);
			if (!isDigit(c)) {
				break;
			}
		}
		return makeToken(StepToken.TOKEN_INSTANCE_NAME, i);
	}

	private StepToken parseNumber() throws EOFException, StepParseException {
		int i = 0;

		byte c = peek(i);
		if (c == '-' || c == '+') {
			i++;
		}

		c = peek(i);
		if (!isDigit(c)) {
			throw unexpectedCharacter(c, "Expected digit");
		}

		for (i++;; i++) {
			c = peek(i);
			if (!isDigit(c)) {
				break;
			}
		}

		if (c != '.' && c != 'E' && c != 'e') {
			return makeToken(StepToken.TOKEN_INTEGER, i);
		}
		if (c == '.') {
			i++;
		}

		if (peek(i) == '#') {
			for (i++;; i++) {
				c = peek(i);
				if (!isUpper(c)) {
					break;
				}
			}
			return makeToken(StepToken.TOKEN_REAL, i);
		}

		i = parseFraction(i);

		return makeToken(StepToken.TOKEN_REAL, i);
	}

	private int parseFraction(int i) throws StepParseException {
		byte c;
		for (;; i++) {
			c = peek(i);
			if (!isDigit(c)) {
				break;
			}
		}

		if (c == 'E') {
			i++;

			c = peek(i);
			if (c == '-' || c == '+') {
				i++;
			}

			c = peek(i);
			if (!isDigit(c)) {
				throw unexpectedCharacter(c, "Expected digit");
			}
			for (i++;; i++) {
				c = peek(i);
				if (!isDigit(c)) {
					break;
				}
			}
		}
		return i;
	}

	private StepToken parseString() throws EOFException, StepParseException {
		int i = 1;
		for (;; i++) {
			byte c = peek(i);
			if (c == '\n') {
				line++;
			} else if (c == 0) {
				throw new EOFException();
			} else if (c == '\'') {
				if (peek(i + 1) == '\'') {
					i++;
				} else {
					break;
				}
			} else if (c == '\\') {
				if (peek(i + 1) == '\\') {
					i++;
				} else {
					i = parseControlDirective(i);
				}
			}
		}
		return makeToken(StepToken.TOKEN_STRING, i + 1);
	}

	private int parseControlDirective(int i) throws EOFException, StepParseException {
		i++;

		byte c = peek(i);

		switch (c) {
			case 'S':
				return parsePageControlDirective(i);
			case 'P':
				return parseAlphabetControlDirective(i);
			case 'X': {
				switch (peek(i + 1)) {
					case '\\':
						return parseArbitraryControlDirective(i);
					case '2':
						return parseExtended2ControlDirective(i);
					case '4':
						return parseExtended4ControlDirective(i);
					default:
						throw unexpectedCharacter(c, "Expected control directive");
				}
			}
			default:
				throw unexpectedCharacter(c, "Expected control directive");
		}
	}

	private int parseExtended4ControlDirective(int i) throws StepParseException, EOFException {
		i += 2;

		byte c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}
		i++;

		i = parseHexFour(i);

		while (true) {
			i++;
			c = peek(i);
			if (c == 0) {
				throw new EOFException();
			} else if (c == '\\') {
				break;
			} else {
				i = parseHexFour(i);
			}
		}

		return parseEndExtended(i);
	}

	private int parseExtended2ControlDirective(int i) throws StepParseException, EOFException {
		i += 2;

		byte c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}
		i++;

		i = parseHexTwo(i);

		while (true) {
			i++;
			c = peek(i);
			if (c == 0) {
				throw new EOFException();
			} else if (c == '\\') {
				break;
			} else {
				i = parseHexTwo(i);
			}
		}

		return parseEndExtended(i);
	}

	private int parseEndExtended(int i) throws StepParseException {
		byte c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}
		i++;

		c = peek(i);
		if (c != 'X') {
			throw unexpectedCharacter(c, "Expected 'X'");
		}
		i++;

		c = peek(i);
		if (c != '0') {
			throw unexpectedCharacter(c, "Expected '0'");
		}
		i++;

		c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}

		return i;
	}

	private int parseHexFour(int i) throws StepParseException {
		for (int n = 0; n < 2; n++) {
			i = parseHexTwo(i);
			if (n == 0) {
				i++;
			}
		}
		return i;
	}

	private int parseHexTwo(int i) throws StepParseException {
		for (int n = 0; n < 2; n++) {
			i = parseHexOne(i);
			if (n == 0) {
				i++;
			}
		}
		return i;
	}


	private int parseHexOne(int i) throws StepParseException {
		for (int n = 0; n < 2; n++) {
			byte c = peek(i);
			if (!isHex(peek(i))) {
				throw unexpectedCharacter(c, "Expected hex");
			}
			if (n == 0) {
				i ++;
			}
		}
		return i;
	}

	private int parseArbitraryControlDirective(int i) throws StepParseException {
		i += 2;

		i = parseHexOne(i);

		return i;
	}

	private int parseAlphabetControlDirective(int i) throws StepParseException {
		i++;

		byte c = peek(i);
		if (!isUpper(c)) {
			throw unexpectedCharacter(c, "Expected alpha");
		}
		i++;

		c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}

		return i;
	}

	private int parsePageControlDirective(int i) throws StepParseException, EOFException {
		i++;

		byte c = peek(i);
		if (c != '\\') {
			throw unexpectedCharacter(c, "Expected '\'");
		}
		i++;

		c = peek(i);
		if (c == 0) {
			throw new EOFException();
		}

		return i;
	}

	private StepToken parseEnum() throws EOFException, StepParseException {
		byte c = peek(1);

		if (c == 0) {
			throw new EOFException();
		} else if (isDigit(c)) {
			int i = parseFraction(1);
			return makeToken(StepToken.TOKEN_REAL, i);
		} else if (!isUpper(c)) {
			throw unexpectedCharacter(c, "Expected alpha");
		}

		int i = 2;


		for (;; i++) {
			c = peek(i);
			if (isUpperOrDigit(c)) {
				continue;
			} else if (c == 0) {
				throw new EOFException();
			} else if (c == '.') {
				break;
			} else if (isLower(c) || c == ' ') {
				continue;
			} else {
				throw unexpectedCharacter(c, "Expected alphanumeric");
			}
		}

		return makeToken(StepToken.TOKEN_ENUM, i + 1);
	}

	private StepToken parseBinary() throws EOFException, StepParseException {
		byte c = peek(1);
		if (c == 0) {
			throw new EOFException();
		} else if (!(c >= '0' || c >= '3')) {
			throw unexpectedCharacter(c, "Expected digit between 0 and 3");
		}

		int i = 2;
		for (;; i++) {
			c = peek(i);
			if (isHex(c)) {
				continue;
			} else if (c == 0) {
				throw new EOFException();
			} else if (c == '"') {
				break;
			} else {
				throw unexpectedCharacter(c, "Expected hex");
			}
		}
		return makeToken(StepToken.TOKEN_BINARY, i + 1);
	}

	private StepToken makeToken(byte type, int length) {
		return new StepToken(type, dataPosition, length);
	}
}
