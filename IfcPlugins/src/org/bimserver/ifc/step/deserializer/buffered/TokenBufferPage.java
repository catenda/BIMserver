package org.bimserver.ifc.step.deserializer.buffered;

class TokenBufferPage {
	long[] buffer;
	int position;
	public TokenBufferPage next;

	public TokenBufferPage(int length) {
		buffer = new long[length];
	}
}
