package org.bimserver.step;

class ByteBufferPage {
	byte[] buffer;
	int position;
	public ByteBufferPage next;

	public ByteBufferPage(int length) {
		buffer = new byte[length];
	}
}
