package org.bimserver.ifc.step.deserializer.readonly;

class StepExchangeImpl implements StepExchange {
	private final ByteBuffer dataBuffer;
	private final TokenBuffer tokenBuffer;
	private final int headerIndex;
	private final int dataIndex;

	public StepExchangeImpl(ByteBuffer dataBuffer, TokenBuffer tokenBuffer,
			int headerIndex, int dataIndex) {
		this.dataBuffer = dataBuffer;
		this.tokenBuffer = tokenBuffer;
		this.headerIndex = headerIndex;
		this.dataIndex = dataIndex;
	}

	@Override
	public StepEntityInstanceIterator getHeaderEntityIterator() {
		return new StepEntityInstanceIterator(dataBuffer, tokenBuffer, headerIndex);
	}

	@Override
	public StepEntityInstanceIterator getDataEntityIterator() {
		return new StepEntityInstanceIterator(dataBuffer, tokenBuffer, dataIndex);
	}

	@Override
	public StepEntityInstance getDataEntity(int index) {
		return new StepEntityInstanceImpl(dataBuffer, tokenBuffer, index);
	}
}
