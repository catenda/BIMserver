package org.bimserver.ifc.step.deserializer.buffered;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class StepParser {
	public static final byte POSITION_BITS = 32;
	public static final byte DATA_BITS = 27;
	public static final byte TYPE_BITS = 5;

	public static final byte ELEMENT_ENTITY_INSTANCE = 0;
	public static final byte ELEMENT_INSTANCE_NAME = 1;
	public static final byte ELEMENT_LIST = 2;
	public static final byte ELEMENT_STRING = 3;
	public static final byte ELEMENT_INTEGER = 4;
	public static final byte ELEMENT_REAL = 5;
	public static final byte ELEMENT_ENUM = 6;

	private InputStream in;

	public StepParser(InputStream in) {
		this.in = in;
	}

	public StepExchange parse() throws IOException {
		ByteBuffer dataBuffer = new ByteBuffer();
		TokenBuffer tokenBuffer = new TokenBuffer();
		read(in, dataBuffer);
		StepTokenizer tokenizer = new StepTokenizer(dataBuffer, tokenBuffer);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_BEGIN_EXCHANGE,
				"Expected 'ISO-10303-21'");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
		int headerIndex = parseHeader(tokenizer);
		int dataIndex = parseData(tokenizer);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_END_EXCHANGE,
				"Expected 'END-ISO-10303-21'");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
		return new StepExchangeImpl(dataBuffer, tokenBuffer, headerIndex,
				dataIndex);
	}

	private static void expectNextTokenType(StepTokenizer tokenizer,
			byte tokenType, String missingMessage) throws IOException {
		if (tokenizer.nextToken()) {
			tokenizer.parseToken();
			expectTokenType(tokenizer, tokenType, missingMessage);
		} else {
			throw new EOFException();
		}
	}

	private static void expectTokenType(StepTokenizer tokenizer,
			byte tokenType, String missingMessage) throws StepParseException {
		if (tokenizer.tokenType() != tokenType) {
			byte[] buffer = new byte[tokenizer.tokenLength()];
			tokenizer.tokenValue(buffer);
			throw new StepParseException("Unexpected token '"
					+ new String(buffer) + "'. " + missingMessage);
		}
	}

	private static void expectTokenType(StepTokenizer tokenizer, byte tokenType)
			throws StepParseException {
		if (tokenizer.tokenType() != tokenType) {
			byte[] buffer = new byte[tokenizer.tokenLength()];
			tokenizer.tokenValue(buffer);
			throw new StepParseException("Unexpected token '"
					+ new String(buffer) + "'");
		}
	}

	private static int parseHeader(StepTokenizer tokenizer) throws IOException {
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_HEADER,
				"Expected 'HEADER'");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
		int index = tokenizer.getTokenBuffer().length();
		while (tokenizer.nextToken()) {
			tokenizer.parseToken();
			switch (tokenizer.tokenType()) {
			case StepTokenizer.TOKEN_ENDSEC:
				expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
						"Expected ';'");
				return index;
			default:
				parseEntityInstance(tokenizer);
				break;
			}
		}
		return -1;
	}

	private static void parseEntityInstance(StepTokenizer tokenizer)
			throws IOException {
		expectTokenType(tokenizer, StepTokenizer.TOKEN_IDENTIFIER);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_LPAREN,
				"Expected '('");
		parseList(tokenizer);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
	}

	private static void parseList(StepTokenizer tokenizer) throws IOException {
		while (tokenizer.nextToken()) {
			tokenizer.parseToken();
			switch (tokenizer.tokenType()) {
			case StepTokenizer.TOKEN_RPAREN:
				return;
			case StepTokenizer.TOKEN_COMMA:
				break;
			default:
				parseAttribute(tokenizer);
				break;
			}
		}
	}

	private static void parseAttribute(StepTokenizer tokenizer)
			throws IOException {
		switch (tokenizer.tokenType()) {
		case StepTokenizer.TOKEN_LPAREN:
			parseList(tokenizer);
			break;
		default:
			break;
		}
	}

	private static int parseData(StepTokenizer tokenizer) throws IOException {
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_DATA,
				"Expected 'DATA'");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
		int index = tokenizer.getTokenBuffer().length();
		while (tokenizer.nextToken()) {
			tokenizer.parseToken();
			switch (tokenizer.tokenType()) {
			case StepTokenizer.TOKEN_ENDSEC:
				expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
						"Expected ';'");
				return index;
			default:
				parseNamedEntityInstance(tokenizer);
				break;
			}
		}
		return -1;
	}

	private static void parseNamedEntityInstance(StepTokenizer tokenizer)
			throws IOException {
		expectTokenType(tokenizer, StepTokenizer.TOKEN_INSTANCE_NAME);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_EQUAL,
				"Expected '='");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_IDENTIFIER,
				"Expected identifier");
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_LPAREN,
				"Expected '('");
		parseList(tokenizer);
		expectNextTokenType(tokenizer, StepTokenizer.TOKEN_SEMICOLON,
				"Expected ';'");
	}

	private static void read(InputStream in, ByteBuffer dataBuffer)
			throws IOException {
		byte[] buffer = new byte[4096];
		int length = 0;
		while ((length = in.read(buffer, 0, buffer.length)) > 0) {
			dataBuffer.append(buffer, 0, length);
		}
	}
}
