package org.bimserver.ifc.step.deserializer.readonly;

interface StepExchange {
	StepEntityInstanceIterator getHeaderEntityIterator();
	StepEntityInstanceIterator getDataEntityIterator();
	StepEntityInstance getDataEntity(int index);
}
