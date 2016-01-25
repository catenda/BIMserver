package org.bimserver.ifc.step.deserializer.readonly;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.emf.ModelMetaData;
import org.bimserver.emf.OidProvider;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.shared.PublicInterfaceNotFoundException;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.BiMap;
import com.google.common.collect.Lists;

class StepModel implements IfcModelInterface {

	private StepEStore eStore;
	private final ModelMetaData modelMetaData = new ModelMetaData();

	public StepModel(StepExchange exchange, SchemaDefinition schema) {
		this.eStore = new StepEStore(exchange, schema);
		this.modelMetaData.setIfcHeader(this.eStore.getIfcHeader());
	}

	@Override
	public Iterator<IdEObject> iterator() {
		return eStore.iterator();
	}

	@Override
	public IfcRoot getByGuid(String guid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IdEObject getByName(EClass eClass, String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IdEObject get(long oid) {
		return eStore.get(oid);
	}

	@Override
	public Set<String> getGuids(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getNames(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long size() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsGuid(String referredGuid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(long oid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int count(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<IdEObject> getValues() {
		return Lists.newArrayList(iterator());
	}

	@Override
	public BiMap<Long, IdEObject> getObjects() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Long> keySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T extends IdEObject> List<T> getAll(Class<T> clazz) {
		return eStore.getAll(clazz);
	}

	@Override
	public <T extends IdEObject> List<T> getAll(EClass clazz) {
		return eStore.getAll(clazz);
	}

	@Override
	public <T extends IdEObject> List<T> getAllWithSubTypes(Class<T> clazz) {
		return eStore.getAllWithSubTypes(clazz);
	}

	@Override
	public <T extends IdEObject> List<T> getAllWithSubTypes(EClass eClass) {
		return eStore.getAllWithSubTypes(eClass);
	}

	@Override
	public boolean contains(IdEObject referencedObject) {
		return eStore.contains(referencedObject);
	}

	@Override
	public void add(long oid, IdEObject newObject)
			throws IfcModelInterfaceException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addAllowMultiModel(long oid, IdEObject newObject)
			throws IfcModelInterfaceException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(IdEObject objectToRemove) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ModelMetaData getModelMetaData() {
		return modelMetaData;
	}

	@Override
	public <T extends IdEObject> T create(EClass eClass)
			throws IfcModelInterfaceException {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T extends IdEObject> T create(Class<T> clazz)
			throws IfcModelInterfaceException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void fixOids(OidProvider<Long> oidProvider) {
	}

	@Override
	public void setObjectOids() {
	}

	@Override
	public void indexGuids() {
	}

	@Override
	public long getHighestOid() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void resetOids() {
	}

	@Override
	public void resetOidsFlat() {
	}

	@Override
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void checkDoubleOidsPlusReferences() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void fixOidCounter() {
	}

	@Override
	public void setUseDoubleStrings(boolean useDoubleStrings) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isUseDoubleStrings() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void changeOid(IdEObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void fixOids() {
	}

	@Override
	public void generateMinimalExpressIds() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<IdEObject> getUnidentifiedValues() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int countWithSubtypes(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void resetExpressIds() {
		throw new UnsupportedOperationException();
	}

	@Override
	public IfcModelInterface branch(long poid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long commit(String comment) throws ServerException, UserException,
			PublicInterfaceNotFoundException {
		throw new UnsupportedOperationException();
	}

}
