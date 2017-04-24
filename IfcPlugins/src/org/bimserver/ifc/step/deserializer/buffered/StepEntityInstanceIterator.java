package org.bimserver.ifc.step.deserializer.buffered;

import java.util.Iterator;

class StepEntityInstanceIterator implements Iterator<StepEntityInstance> {

	private ByteBuffer dataBuffer;
	private TokenBuffer tokenBuffer;
	private int index;

	public StepEntityInstanceIterator(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
	}

	@Override
	public boolean hasNext() {
		return StepTokenizer.tokenType(tokenBuffer.tokenAt(index)) != StepTokenizer.TOKEN_ENDSEC;
	}

	@Override
	public StepEntityInstance next() {
		StepEntityInstanceImpl instance = new StepEntityInstanceImpl(dataBuffer, tokenBuffer, index);
		index += instance.tokenLength();
		return instance;
	}

	@Override
	public void remove() {
	}

}
