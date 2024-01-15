package org.bimserver.step;

public interface StepExchange {
	StepEntityInstanceIterator getHeaderEntityIterator();
	StepEntityInstanceIterator getDataEntityIterator();
	StepEntityInstance getDataEntity(int index);
}
