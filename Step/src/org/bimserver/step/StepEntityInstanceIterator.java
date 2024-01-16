package org.bimserver.step;

import java.util.Iterator;


public class StepEntityInstanceIterator implements Iterator<StepEntityInstance> {

	private ByteBuffer dataBuffer;
	private TokenBuffer tokenBuffer;
	private int index;

	public StepEntityInstanceIterator(ByteBuffer dataBuffer,
			TokenBuffer tokenBuffer, int index) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.index = index;
		skipLoc();
	}

	private void skipLoc() {
		while (tokenBuffer.tokenAt(index).getType() == StepToken.TOKEN_LOC) {
			index++;
		}
	}

	@Override
	public boolean hasNext() {
		return tokenBuffer.tokenAt(index).getType() != StepToken.TOKEN_ENDSEC;
	}

	@Override
	public StepEntityInstance next() {
		StepEntityInstanceImpl instance = new StepEntityInstanceImpl(dataBuffer, tokenBuffer, index);
		index += instance.tokenLength();
		skipLoc();
		return instance;
	}

	@Override
	public void remove() {
	}

}