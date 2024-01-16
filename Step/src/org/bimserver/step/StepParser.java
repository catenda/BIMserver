package org.bimserver.step;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class StepParser {
	private final InputStream in;
	private final ByteBuffer dataBuffer = new ByteBuffer();
	private final TokenBuffer tokenBuffer = new TokenBuffer();
	private final StepTokenizer tokenizer = new StepTokenizer(dataBuffer);

	private StepToken token;
	private byte tokenType;

	public StepParser(InputStream in) {
		this.in = in;
	}

	private void insertLocationToken() {
		StepToken token = tokenBuffer.tokenAt(tokenBuffer.length() - 1);
		tokenBuffer.set(tokenBuffer.length() - 1, TokenBuffer.location(StepToken.TOKEN_LOC, tokenizer.getLine()));
		tokenBuffer.append(token);
	}

	private void next() throws IOException, StepParseException {
		token = tokenizer.parseToken();
		tokenType = token.getType();

		if (tokenType != StepToken.TOKEN_EOF &&
				tokenType != StepToken.TOKEN_COMMA &&
				tokenType != StepToken.TOKEN_SEMICOLON) {
			tokenBuffer.append(token);
		}
	}



	private boolean match(byte type) {
		return tokenType == type;
	}

	private void fail(StepParseException cause) throws StepParseException, IOException {
		throw cause;
	}

	private void fail(String message) throws StepParseException, IOException {
		throw new StepParseException(message);
	}

	private void failIfFalse(boolean condition, String message) throws StepParseException, IOException {
		if (!condition) {
			fail(message);
		}
	}

	private String unexpectedTokenMessage(String message) {
		Optional<String> tokenValue = tokenValue(token);
		if (tokenValue.isPresent()) {
			return "Unexpected token '" + tokenValue.get() + "'. " + message;
		} else {
			return "Unexpected token. " + message;
		}
	}

	private Optional<String> tokenValue(StepToken token) {
		byte[] buffer = new byte[token.getLength()];
		if (buffer.length > 0) {
			dataBuffer.bytesAt(buffer, token.getPosition(), token.getLength());
			return Optional.of(new String(buffer));
		}
		return Optional.empty();
	}

	public StepExchange parse() throws IOException, StepParseException {
		dataBuffer.append(in);
		next();
		failIfFalse(
				match(StepToken.TOKEN_BEGIN_EXCHANGE),
				unexpectedTokenMessage("Expected 'ISO-10303-21'"));

		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));

		int headerIndex = parseHeader();
		int dataIndex = parseData();

		next();
		failIfFalse(
				match(StepToken.TOKEN_END_EXCHANGE),
				unexpectedTokenMessage("Expected 'END-ISO-10303-21'"));

		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));
		return new StepExchangeImpl(dataBuffer, tokenBuffer, headerIndex,
				dataIndex);
	}

	private int parseHeader() throws IOException, StepParseException {
		next();
		failIfFalse(
				match(StepToken.TOKEN_HEADER),
				unexpectedTokenMessage("Expected 'HEADER'"));

		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));

		int index = tokenBuffer.length();

		while (true) {
			next();
			switch (tokenType) {
				case StepToken.TOKEN_EOF: {
					fail("Unexpected end of file");
				}
				case StepToken.TOKEN_ENDSEC:
					next();
					failIfFalse(
							match(StepToken.TOKEN_SEMICOLON),
							unexpectedTokenMessage("Expected ';'"));
					return index;
				default:
					parseEntityInstance();
					break;
			}
		}
	}

	private int parseData() throws IOException, StepParseException {
		next();
		failIfFalse(
				match(StepToken.TOKEN_DATA),
				unexpectedTokenMessage("Expected 'DATA'"));
		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));


		int index = tokenBuffer.length();

		while (true) {
			next();
			switch (tokenType) {
				case StepToken.TOKEN_EOF: {
					fail("Unexpected end of file");
				}
				case StepToken.TOKEN_ENDSEC:
					next();
					failIfFalse(
							match(StepToken.TOKEN_SEMICOLON),
							unexpectedTokenMessage("Expected ';'"));
					return index;
				default:
					parseNamedEntityInstance();
					break;
			}
		}
	}

	private void parseEntityInstance()
			throws IOException, StepParseException {
		insertLocationToken();

		failIfFalse(
				match(StepToken.TOKEN_IDENTIFIER),
				"Expected entity type");

		next();
		failIfFalse(
				match(StepToken.TOKEN_LPAREN),
				unexpectedTokenMessage("Expected '('"));

		parseParameterList();

		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));
	}

	private void parseNamedEntityInstance()
			throws IOException, StepParseException {
		insertLocationToken();

		failIfFalse(
				match(StepToken.TOKEN_INSTANCE_NAME),
				"Expected instance name");

		next();
		failIfFalse(
				match(StepToken.TOKEN_EQUAL),
				"Expected '='");

		next();
		failIfFalse(
				match(StepToken.TOKEN_IDENTIFIER),
				"Expected entity type");

		next();
		failIfFalse(
				match(StepToken.TOKEN_LPAREN),
				unexpectedTokenMessage("Expected '('"));

		parseParameterList();

		next();
		failIfFalse(
				match(StepToken.TOKEN_SEMICOLON),
				unexpectedTokenMessage("Expected ';'"));
	}

	private void parseParameterList() throws IOException, StepParseException {
		int index = this.tokenBuffer.length() - 1;
		int length = 0;

		next();

		if (match(StepToken.TOKEN_RPAREN)) {
			return;
		}

		parseParameter();
		length = 1;
		next();

		while (match(StepToken.TOKEN_COMMA)) {
			next();

			if (match(StepToken.TOKEN_RPAREN)) {
				break;
			}

			parseParameter();
			length++;
			next();

			if (match(StepToken.TOKEN_RPAREN)) {
				break;
			}
		}

		tokenBuffer.set(index, new StepToken(StepToken.TOKEN_LPAREN, tokenBuffer.tokenAt(index).getPosition(), length << 1));

		failIfFalse(
				match(StepToken.TOKEN_RPAREN),
				unexpectedTokenMessage("Expected ')'"));
	}

	private void parseParameter()
			throws IOException, StepParseException {
		switch (tokenType) {
			case StepToken.TOKEN_LPAREN:
				parseParameterList();
				break;
			case StepToken.TOKEN_IDENTIFIER:
				next();
				failIfFalse(
						match(StepToken.TOKEN_LPAREN),
						unexpectedTokenMessage("Expected '('"));

				parseParameterList();
				break;
			case StepToken.TOKEN_BINARY:
			case StepToken.TOKEN_ENUM:
			case StepToken.TOKEN_INSTANCE_NAME:
			case StepToken.TOKEN_INTEGER:
			case StepToken.TOKEN_REAL:
			case StepToken.TOKEN_REDECLARED:
			case StepToken.TOKEN_STRING:
			case StepToken.TOKEN_UNSET:
				break;
			default:
				fail(unexpectedTokenMessage("Expected valid parameter"));
				break;
		}
	}

}
