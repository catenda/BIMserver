package org.bimserver.ifc.step.deserializer.buffered;

interface StepExchange {
	StepEntityInstanceIterator getHeaderEntityIterator();
	StepEntityInstanceIterator getDataEntityIterator();
	StepEntityInstance getDataEntity(int index);
}
