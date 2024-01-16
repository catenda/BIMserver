package org.bimserver.step;

class TokenBuffer {
	private static final byte LENGTH_BITS = 27;
	private static final byte TYPE_BITS = 5;

	private TokenBufferPage first = new TokenBufferPage(1 << 20);
	private TokenBufferPage readPage = first;
	private TokenBufferPage writePage = first;
	private int readPageIndex = 0;
	private int writePageIndex = 0;
	private int length;

	public void append(StepToken token) {
		append(makeToken(token.getType(), token.getLength()));
		append(token.getPosition());
	}

	private void append(long token) {
		int pageIndex = length >> 20;
		TokenBufferPage page = writePage;
		if (writePageIndex != pageIndex) {
			int i = writePageIndex;
			if (writePageIndex < pageIndex) {
				page = first;
				i = 0;
			}
			for (; i < pageIndex; i++) {
				if (page.next == null) {
					page.next = new TokenBufferPage(1 << 20);
				}
				page = page.next;
			}
			writePage = page;
			writePageIndex = pageIndex;
		}

		page.buffer[page.position] = token;
		page.position++;
		length++;
	}

	public StepToken tokenAt(int index) {
		long token = _tokenAt(2 * index);
		long position = _tokenAt(2 * index + 1);
		return new StepToken(TokenBuffer.tokenType(token), position, TokenBuffer.tokenLength(token));
	}

	private long _tokenAt(int index) {
		if (index >= length) {
			throw new IndexOutOfBoundsException();
		}
		int pageIndex = index >> 20;
		TokenBufferPage page = readPage;
		if (readPageIndex != pageIndex) {
			int i = readPageIndex;
			if (pageIndex < readPageIndex) {
				page = first;
				i = 0;
			}
			for (; i < pageIndex; i++) {
				page = page.next;
			}
			readPage = page;
			readPageIndex = pageIndex;
		}
		return page.buffer[index & 0xFFFFF];
	}

	public int length() {
		return length / 2;
	}

	public void set(int index, StepToken token) {
		_set(2 * index, makeToken(token.getType(), token.getLength()));
		_set(2 * index + 1, token.getPosition());
	}

	private void _set(int index, long token) {
		if (index >= length) {
			throw new IndexOutOfBoundsException();
		}

		int pageIndex = index >> 20;
		TokenBufferPage page = writePage;
		if (writePageIndex != pageIndex) {
			int i = writePageIndex;
			if (pageIndex < writePageIndex) {
				page = first;
				i = 0;
			}
			for (; i < pageIndex; i++) {
				if (page.next == null) {
					page.next = new TokenBufferPage(1 << 20);
				}
				page = page.next;
			}
			writePage = page;
			writePageIndex = pageIndex;
		}

		page.buffer[index & 0xFFFFF] = token;
	}

	static long makeToken(byte type, long length) {
		return (length << TYPE_BITS)
				| (type & ((1 << TYPE_BITS) - 1));
	}

	static StepToken location(byte type, long line) {
		return new StepToken(type, line, 0);
	}

	static long line(StepToken token) {
		return token.getPosition();
	}

	private static byte tokenType(long token) {
		return (byte) (token & ((1 << TYPE_BITS) - 1));
	}

	private static int tokenLength(long token) {
		return (int) ((token >> TYPE_BITS) & ((1 << LENGTH_BITS) - 1));
	}
}
