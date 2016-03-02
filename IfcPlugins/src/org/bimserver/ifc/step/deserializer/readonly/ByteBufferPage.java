package org.bimserver.ifc.step.deserializer.readonly;

class ByteBufferPage {
	byte[] buffer;
	int position;
	public ByteBufferPage next;

	public ByteBufferPage(int length) {
		buffer = new byte[length];
	}
}
