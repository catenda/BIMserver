package org.bimserver.ifc.step.deserializer.buffered;

class TokenBuffer {
	private TokenBufferPage first = new TokenBufferPage(1 << 20);
	private TokenBufferPage readPage = first;
	private TokenBufferPage writePage = first;
	private int readPageIndex = 0;
	private int writePageIndex = 0;
	private int length;

	public void append(long token) {
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

	public long tokenAt(int index) {
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
		return length;
	}

	public void set(int index, long token) {
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
}
