package org.bimserver.ifc.step.deserializer.readonly;

class ByteBuffer {
	private ByteBufferPage first = new ByteBufferPage(1 << 20);
	private ByteBufferPage writePage = first;
	private ByteBufferPage readPage = first;
	private int writePageIndex = 0;
	private int readPageIndex = 0;
	private int length;

	public void append(byte[] values, int offset, int length) {
		int pageIndex = this.length >> 20;
		ByteBufferPage page = writePage;
		if (writePageIndex != pageIndex) {
			int i = writePageIndex;
			if (writePageIndex < pageIndex) {
				page = first;
				i = 0;
			}
			for (; i < pageIndex; i++) {
				if (page.next == null) {
					page.next = new ByteBufferPage(1 << 20);
				}
				page = page.next;
			}
			writePage = page;
			writePageIndex = pageIndex;
		}
		int bytesCopied = 0;
		while (true) {
			int destinationLength = Math.min(
					page.buffer.length - page.position, length - bytesCopied);
			System.arraycopy(values, bytesCopied, page.buffer, page.position,
					destinationLength);
			page.position += destinationLength;
			this.length += destinationLength;
			bytesCopied += destinationLength;
			if (bytesCopied < length) {
				page.next = new ByteBufferPage(1 << 20);
				page = page.next;
				writePage = page;
				writePageIndex++;
				continue;
			}
			break;
		}
	}

	public byte byteAt(int index) {
		if (index >= length) {
			throw new IndexOutOfBoundsException();
		}
		int pageIndex = index >> 20;
		ByteBufferPage page = readPage;
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

	public int bytesAt(byte[] buffer, int offset, int length) {
		if (offset >= this.length || offset + length > this.length) {
			throw new IndexOutOfBoundsException();
		}
		int pageIndex = offset >> 20;
		ByteBufferPage page = readPage;
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
		int bytesCopied = 0;
		int position = offset - (pageIndex * 1 << 20);
		while (true) {
			int sourceLength = Math.min(page.buffer.length - position, length
					- bytesCopied);
			System.arraycopy(page.buffer, position, buffer, bytesCopied,
					sourceLength);
			position += sourceLength;
			bytesCopied += sourceLength;
			if (bytesCopied < length) {
				page = page.next;
				pageIndex++;
				readPage = page;
				readPageIndex = pageIndex;
				position = 0;
				continue;
			}
			break;
		}
		return bytesCopied;
	}

	public int length() {
		return length;
	}
}
