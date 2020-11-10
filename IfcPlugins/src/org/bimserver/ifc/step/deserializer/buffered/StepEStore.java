package org.bimserver.ifc.step.deserializer.buffered;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.interfaces.objects.SIfcHeader;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.log.LogPackage;
import org.bimserver.models.store.StorePackage;
import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.ExplicitAttribute;
import org.bimserver.plugins.schema.InverseAttribute;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

class StepEStore implements EStore {
	private final StepExchange exchange;
	private final SchemaDefinition schema;
	private final EPackage ePackage;

	private class Inverse {
		public long oid;
		public String attributeName;
		public Inverse(long oid, String attributeName) {
			this.oid = oid;
			this.attributeName = attributeName;
		}
	}

	private final Map<Long, Integer> instances = Maps.newHashMap();
	private Map<EClass, List<Integer>> instancesPerClass;
	private Map<Long, List<Inverse>> instanceReferences;

	private final Set<EStructuralFeature> inverseCache = Sets.newHashSet();
	private final Map<EStructuralFeature, Integer> attributeIndexCache = Maps.newHashMap();

	private final Map<IdEObject, Integer> inlineInstances = Maps.newHashMap();
	private final Map<String, EClassifier> eClasses;
	private final Map<EClass, List<EClass>> eClassSubTypes;
	private final BiMap<EClass, Class<?>> eClassClassMap;

	private Object attributeIteratorContainer;
	private StepAttributeIterator attributeIterator;
	private int attributeIndex = -1;
	private StepAttribute attribute;

	private Object attributeListIteratorContainer;
	private StepAttributeIterator attributeListIterator;
	private int attributeListIndex = -1;
	private SIfcHeader ifcHeader;

	public StepEStore(StepExchange exchange, SchemaDefinition schema) throws StepParseException {
		this.exchange = exchange;
		this.schema = schema;
		String name = this.schema.getName();
		if ("IFC4".equals(name.toUpperCase())) {
			ePackage = Ifc4Package.eINSTANCE;
		} else {
			ePackage = Ifc2x3tc1Package.eINSTANCE;
		}
		this.eClasses = initEClasses();
		this.eClassSubTypes = initEClassSubTypes();
		this.eClassClassMap = initEClassClassMap();

		this.buildIfcHeader();
		this.buildIndex();
	}

	private void buildIfcHeader() {
		ifcHeader = StepHeaderParser.parseIfcHeader(exchange.getHeaderEntityIterator());
	}


	private void buildIndex() throws StepParseException {
		instancesPerClass = new HashMap<EClass, List<Integer>>();
		for (EClass eClass : eClassClassMap.keySet()) {
			instancesPerClass.put((EClass) eClass, new ArrayList<Integer>());
		}

		StepEntityInstanceIterator it = exchange.getDataEntityIterator();
		while (it.hasNext()) {
			StepEntityInstance instance = it.next();
			instances.put(instance.getInstanceName(), instance.getIndex());
			String identifier = instance.getIdentifier();
			EClass eClass = (EClass) eClasses.get(identifier);
			if (eClass == null) {
				throw new StepParseException("Unknown entity: " + identifier);
			}
			instancesPerClass.get(eClass).add(instance.getIndex());
		}
	}

	class Relation {
		public String sourceAttributeName;
		public int sourceAttributeIndex;
		public String targetAttributeName;
	}
	
	private void buildReferences() {
		instanceReferences = Maps.newHashMap();

		Map<String, List<Relation>> relations = Maps.newHashMap();

		{
			Iterator<EntityDefinition> entityIterator = schema.getEntities().iterator();
			while (entityIterator.hasNext()) {
				EntityDefinition entity = (EntityDefinition) entityIterator.next();
				relations.put(entity.getName().toUpperCase(), Lists.<Relation>newArrayList());
			}
		}

		{
			Iterator<EntityDefinition> entityIterator = schema.getEntities().iterator();
			while (entityIterator.hasNext()) {
				EntityDefinition entity = (EntityDefinition) entityIterator.next();
				Iterator<Attribute> attributeIterator = entity.getAttributes(true).iterator();
				while (attributeIterator.hasNext()) {
					Attribute attribute = (Attribute) attributeIterator.next();
					if (attribute instanceof InverseAttribute) {
						InverseAttribute inverseAttribute = (InverseAttribute) attribute;
						String sourceEntityName = (inverseAttribute).getDomain().getName();
						String sourceAttributeName = inverseAttribute.getInverted_attr().getName();
						Relation relation = new Relation();
						relation.sourceAttributeName = sourceAttributeName;
						relation.targetAttributeName = attribute.getName();
						relations.get(sourceEntityName.toUpperCase()).add(relation);
					}
				}
			}
		}

		for (Entry<String, List<Relation>> entry : relations.entrySet()) {
			EntityDefinition entity = schema.getEntityBN(entry.getKey());
			if (!entry.getValue().isEmpty()) {
				int i = 0;
				Iterator<Attribute> attributeIterator = entity.getAttributes(true).iterator();
				while (attributeIterator.hasNext()) {
					Attribute attribute = (Attribute) attributeIterator.next();
					if (attribute instanceof ExplicitAttribute) {
						for (Relation relation : entry.getValue()) {
							if (relation.sourceAttributeName.equals(attribute.getName())) {
								relation.sourceAttributeIndex = i;
							}
						}
						i++;
					}
				}
			}
		}
		for (Entry<String, List<Relation>> entry : relations.entrySet()) {
			EClass classifier = (EClass) eClasses.get(entry.getKey());
			addSuperRelations(entry.getValue(), relations, classifier);
		}

		for (Entry<String, List<Relation>> entry : relations.entrySet()) {
			Collections.sort(entry.getValue(), new Comparator<Relation>() {
				@Override
				public int compare(Relation left, Relation right) {
					return left.sourceAttributeIndex < right.sourceAttributeIndex ? -1
							: left.sourceAttributeIndex == right.sourceAttributeIndex ? 0
									: 1;
				}
			});
		}

		for (Entry<String, List<Relation>> entry : relations.entrySet()) {
			List<Relation> list = entry.getValue();
			if (list.isEmpty()) continue;
			int index = list.get(0).sourceAttributeIndex;
			for (int i = 1; i < list.size();) {
				if (list.get(i).sourceAttributeIndex == index) {
					list.remove(i);
				} else {
					index = list.get(i).sourceAttributeIndex;
					i++;
				}
			}
		}

		StepEntityInstanceIterator it = exchange.getDataEntityIterator();
		while (it.hasNext()) {
			StepEntityInstance instance = it.next();
			String identifier = instance.getIdentifier();

			Iterator<StepAttribute> attributeIterator = instance.getAttributeIterator();
			Iterator<Relation> relationIterator = relations.get(identifier).iterator();

			int i = 0;
			while (relationIterator.hasNext()) {
				Relation relation = relationIterator.next();
				while (attributeIterator.hasNext()) {
					StepAttribute attribute = attributeIterator.next();
					if (relation.sourceAttributeIndex == i) {
						if (attribute.isInstanceName()) {
							addReference(instance.getInstanceName(), attribute, relation.targetAttributeName);
						} else if (attribute.isList()) {
							addReferences(instance.getInstanceName(), (StepAttributeList) attribute, relation.targetAttributeName);
						}
						i++;
						break;
					} else {
						i++;
					}
				}
			}
		}
	}

	private void addSuperRelations(List<Relation> result, Map<String, List<Relation>> relations, EClass classifier) {
		for (EClass superClassifier : classifier.getESuperTypes()) {
			if (relations.containsKey(superClassifier.getName().toUpperCase())) {
				result.addAll(relations.get(superClassifier.getName().toUpperCase()));
			}
			addSuperRelations(result, relations, superClassifier);
		}
	}

	private void addReferences(long instanceName, StepAttributeList attributes, String attributeName) {
		StepAttributeIterator iterator = attributes.getAttributeIterator();
		while (iterator.hasNext()) {
			StepAttribute attribute = iterator.next();
			if (attribute.isInstanceName()) {
				addReference(instanceName, attribute, attributeName);
			} else if (attribute.isList()) {
				addReferences(instanceName, (StepAttributeList) attribute, attributeName);
			}
		}
	}

	private void addReference(long instanceName, StepAttribute attribute, String attributeName) {
		Long referencedName = (Long) attribute.getValue();
		if (!instanceReferences.containsKey(referencedName)) {
			instanceReferences.put(referencedName, Lists.<Inverse>newArrayList());
		}
		instanceReferences.get(referencedName).add(new Inverse(instanceName, attributeName));
	}

	private Map<String, EClassifier> initEClasses() {
		HashMap<String, EClassifier> result = new HashMap<String, EClassifier>(ePackage.getEClassifiers().size());
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			result.put(classifier.getName().toUpperCase(), classifier);
		}
		return result;
	}

	private Map<EClass, List<EClass>> initEClassSubTypes() {
		HashMap<EClass, List<EClass>> result = new HashMap<EClass, List<EClass>>(ePackage.getEClassifiers().size());
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				result.put((EClass) classifier, Lists.<EClass>newArrayList());
			}
		}
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				for (EClass superType : ((EClass) classifier).getESuperTypes()) {
					result.get(superType).add((EClass) classifier);
				}
			}
		}
		return result;
	}

	private BiMap<EClass, Class<?>> initEClassClassMap() {
		BiMap<EClass, Class<?>> eClassClassMap = HashBiMap.create();
		for (EPackage ePackage : new EPackage[] { ePackage, StorePackage.eINSTANCE, LogPackage.eINSTANCE }) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					eClassClassMap.put(eClass, eClass.getInstanceClass());
				}
			}
		}
		return eClassClassMap;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object get(InternalEObject object, EStructuralFeature feature,
			int index) {
		StepAttribute attribute = getAttribute(object, feature);
		if (attribute == null) {
			if (isInverse(feature)) {
				long oid = ((IdEObjectImpl) object).getOid();
				if (instanceReferences == null) {
					this.buildReferences();
				}
				if (instanceReferences.containsKey(oid)) {
					int i = 0;
					for (Inverse inverse : instanceReferences.get(oid)) {
						if (inverse.attributeName.equals(feature.getName())) {
							if (index == InternalEObject.EStore.NO_INDEX || i == index) {
								return create(getInstanceIndex(inverse.oid));
							}
							i++;
						}
					}
				}
			}
			return null;
		}
		if (attribute.isList()) {
			if (index == InternalEObject.EStore.NO_INDEX) {
				throw new RuntimeException();
			}

			if (!attribute.equals(attributeListIteratorContainer)) {
				attributeListIteratorContainer = attribute;
				attributeListIterator = ((StepAttributeList) attribute).getAttributeIterator();
				attributeListIndex = -1;
			}
			EClassifier eType = feature.getEType();
			if (index != this.attributeListIndex + 1) {
				attributeListIndex = -1;
				attributeListIterator = ((StepAttributeList) attribute)
						.getAttributeIterator();
			}
			for (; attributeListIndex < index && attributeListIterator.hasNext();) {
				attribute = attributeListIterator.next();
				if (eType instanceof EClass && attribute.isUnset()) {
					attribute = null;
					continue;
				} else {
					attributeListIndex++;
				}
			}
		}

		if (attribute == null) {
			return null;
		}

		if (attribute.isInstanceName()) {
			Long instanceName = (Long) attribute.getValue();
			return create(getInstanceIndex(instanceName));
		} else if (attribute.isEnum()) {
			return getEnum(feature, attribute.getValue());
		} else if (attribute.isInline()) {
			return create((StepEntityInstance) attribute.getValue());
		} else if (attribute.isUnset()) {
			return null;
		} else if (attribute.isRedeclared()) {
			return null;
		} else if (attribute.isList()) {
			List<Object> value = (List<Object>) attribute.getValue();
			String name = feature.getEType().getName();
			EClass eClass = (EClass) eClasses.get(name);
			if (eClass != null) {
				IdEObject newObject = (IdEObject) create(eClass);
				feature = (EStructuralFeature) newObject.eClass().getEStructuralFeature("List");
				AbstractEList<Object> list = (AbstractEList<Object>) newObject.eGet(feature);
				for (Object item : value) {
					EClassifier classifier = feature.getEType();
					if (classifier instanceof EClassImpl && null != ((EClassImpl) classifier).getEStructuralFeature("wrappedValue")) {
						IdEObject create = (IdEObject) ePackage.getEFactoryInstance().create((EClass) classifier);
						create.eSet(create.eClass().getEStructuralFeature("wrappedValue"), item);
						list.addUnique(create);
					} else {
						list.addUnique(item);
					}
				}
				return newObject;
			}
			return null;
		} else {
			Object value = attribute.getValue();
			EClassifier eType = feature.getEType();
			if (eType == EcorePackage.eINSTANCE.getEDouble()) {
				if (value instanceof Integer) {
					return new Double((Integer) value);
				} else if (value instanceof Long) {
					return new Double((Long) value);
				}
			}
			return value;
		}
	}

	private StepAttribute getAttribute(InternalEObject object,
			EStructuralFeature feature) {
		int attributeIndex = getAttributeIndex(object, feature);
		if (attributeIndex == -1) {
			return null;
		}

		if (attributeIteratorContainer == object) {
			if (attributeIndex == this.attributeIndex) {
				return attribute;
			}
			if (attributeIndex == this.attributeIndex + 1) {
				if (attributeIterator.hasNext()) {
					this.attributeIndex++;
					attribute = attributeIterator.next();
					return attribute;
				} else {
					return null;
				}
			}
		}

		long oid = ((IdEObjectImpl) object).getOid();
		Integer instanceIndex = instances.get(oid);
		if (instanceIndex == null) {
			instanceIndex = inlineInstances.get(object);
		}
		if (instanceIndex == null) {
			return null;
		}

		StepEntityInstance instance = exchange.getDataEntity(instanceIndex);
		attributeIterator = instance.getAttributeIterator();
		attributeIteratorContainer = object;
		for (this.attributeIndex = 0; this.attributeIndex < attributeIndex && attributeIterator.hasNext(); this.attributeIndex++, attributeIterator.next());
		attribute = attributeIterator.next();
		return attribute;
	}

	private int getAttributeIndex(InternalEObject object,
			EStructuralFeature feature) {
		if (attributeIndexCache.containsKey(feature)) {
			return attributeIndexCache.get(feature);
		}
		int index = 0;
		for (EStructuralFeature current : object.eClass().getEAllStructuralFeatures()) {
			if (current.isDerived() || current.getEAnnotation("hidden") != null || isInverse(current)) {
				continue;
			}
			if (feature.equals(current)) {
				attributeIndexCache.put(feature, index);
				return index;
			}
			index++;
		}
		attributeIndexCache.put(feature, -1);
		return -1;
	}

	private boolean isInverse(EStructuralFeature feature) {
		if (inverseCache.contains(feature)) {
			return true;
		}
		EntityDefinition entityBN = schema.getEntityBN(feature.getEContainingClass().getName());
		if (entityBN == null) {
			return false;
		}
		Attribute attributeBNWithSuper = entityBN.getAttributeBNWithSuper(feature.getName());
		boolean isInverse = attributeBNWithSuper instanceof InverseAttribute;
		if (isInverse) {
			inverseCache.add(feature);
		}
		return isInverse;
	}

	private Object getEnum(EStructuralFeature feature,
			Object value) {
		Object result = null;
		if (value.equals("T")) {
			if (feature.getEType().getName().equals("Tristate")) {
				result = createEnumerator("Tristate", "TRUE");
			} else if (feature.getEType().getName().equals("IfcBoolean")) {
				EClass eClass = (EClass) eClasses.get("IfcBoolean");
				EObject bool = create(eClass);
				bool.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "TRUE"));
				result = bool;
			} else if (feature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				result = true;
			} else {
				EClass eClass = (EClass) eClasses.get("IfcLogical");
				EObject locical = create(eClass);
				locical.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "TRUE"));
				result = locical;
			}
		} else if (value.equals("F")) {
			if (feature.getEType().getName().equals("Tristate")) {
				result = createEnumerator("Tristate", "FALSE");
			} else if (feature.getEType().getName().equals("IfcBoolean")) {
				EClass eClass = (EClass) eClasses.get("IfcBoolean");
				EObject bool = create(eClass);
				bool.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "FALSE"));
				result = bool;
			} else if (feature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				result = false;
			} else {
				EClass eClass = (EClass) eClasses.get("IfcLogical");
				EObject locical = create(eClass);
				locical.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "FALSE"));
				result = locical;
			}
		} else if (value.equals("U")) {
			if (feature.getEType().getName().equals("Tristate")) {
				result = createEnumerator("Tristate", "UNDEFINED");
			} else if (feature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				result = null;
			} else {
				EClass eClass = (EClass) eClasses.get("IfcLogical");
				EObject locical = create(eClass);
				locical.eSet(eClass.getEStructuralFeature("WrappedValue"), createEnumerator("Tristate", "UNDEFINED"));
				result = locical;
			}
		} else {
			EEnumLiteral enumLiteral = (((EEnumImpl) feature.getEType()).getEEnumLiteral((String) value));
			if (enumLiteral == null) {
				if ("NOTDEFINED".equals(value)) {
					result = null;
				} else {
					throw new RuntimeException();
				}
			} else {
				result = enumLiteral.getInstance();
			}
		}
		return result;
	}

	@Override
	public Object set(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		StepAttribute attribute = getAttribute(object, feature);
		if (attribute == null) {
			if (isInverse(feature)) {
				long oid = ((IdEObjectImpl) object).getOid();
				if (instanceReferences == null) {
					this.buildReferences();
				}
				if (instanceReferences.containsKey(oid)) {
					for (Inverse inverse : instanceReferences.get(oid)) {
						if (inverse.attributeName.equals(feature.getName())) {
							return true;
						}
					}
				}
				return false;
			}
		}
		return !(attribute.isRedeclared() || attribute.isUnset());
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		StepAttribute attribute = getAttribute(object, feature);
		if (attribute == null) {
			return true;
		}
		if (attribute.isList()) {
			return ((StepAttributeList) attribute).length() == 0;
		}
		return false;
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		StepAttribute attribute = getAttribute(object, feature);
		if (attribute == null) {
			if (isInverse(feature)) {
				int size = 0;
				long oid = ((IdEObjectImpl) object).getOid();
				if (instanceReferences == null) {
					this.buildReferences();
				}
				if (instanceReferences.containsKey(oid)) {
					for (Inverse inverse : instanceReferences.get(oid)) {
						if (inverse.attributeName.equals(feature.getName())) {
							size++;
						}
					}
				}
				return size;
			}
			return 0;
		}
		if (attribute.isList()) {
			EClassifier eType = feature.getEType();
			if (eType instanceof EClass) {
				StepAttributeListImpl list = ((StepAttributeListImpl) attribute);
				int size = list.rawLength();
				if ((size & 1) == 1) {
					return size >> 1;
				}
				size = 0;
				StepAttributeIterator it = list.getAttributeIterator();
				while (it.hasNext()) {
					if (!skipListItem(it.next())) size++;
				}
				list.setRawLength((size << 1) | 1);
				return size;
			}
			return ((StepAttributeList) attribute).length();
		}
		return 0;
	}

	private boolean skipListItem(StepAttribute attribute) {
		if (attribute.isUnset()) {
			return true;
		} else if (attribute.isInstanceName()) {
			Long instanceName = (Long) attribute.getValue();
			if (!instances.containsKey(instanceName)) {
				((StepAttributeImpl) attribute).markAsUnset();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature,
			Object value) {
		StepAttribute attribute = getAttribute(object, feature);
		if (attribute == null) {
			if (isInverse(feature)) {
				long oid = ((IdEObjectImpl) object).getOid();
				if (instanceReferences == null) {
					this.buildReferences();
				}
				if (instanceReferences.containsKey(oid)) {
					for (Inverse inverse : instanceReferences.get(oid)) {
						if (inverse.attributeName.equals(feature.getName())) {
							if (inverse.oid == ((IdEObjectImpl) value).getOid()) {
								return true;
							}
						}
					}
				}
			}
			return false;
		}
		return contains(attribute, value);
	}

	private boolean contains(StepAttribute attribute, Object value) {
		if (attribute.isList()) {
			return contains((StepAttributeList) attribute, value);
		} else if (attribute.isInstanceName()) {
			return attribute.getValue().equals(((IdEObjectImpl) value).getOid());
		} else {
			return attribute.getValue().equals(value);
		}
	}

	private boolean contains(StepAttributeList attributeList, Object value) {
		StepAttributeIterator iterator = attributeList.getAttributeIterator();
		while (iterator.hasNext()) {
			StepAttribute attribute = iterator.next();
			return contains(attribute, value);
		}
		return false;
	}

	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature,
			int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object move(InternalEObject object, EStructuralFeature feature,
			int targetIndex, int sourceIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature,
			T[] array) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject create(EClass eClass) {
		IdEObject object = (IdEObject) ePackage.getEFactoryInstance().create(eClass);
		((IdEObjectImpl) object).eSetStore(this);
		return object;
	}

	private IdEObject create(int instanceIndex) {
		return create(exchange.getDataEntity(instanceIndex));
	}

	private IdEObject create(StepEntityInstance instance) {
		String identifier = instance.getIdentifier();
		EClass eClass = (EClass) eClasses.get(identifier);
		if (eClass == null) {
			throw new RuntimeException();
		}
		IdEObject object = (IdEObject) create(eClass);
		long instanceName = instance.getInstanceName();
		((IdEObjectImpl) object).setExpressId(instanceName);
		((IdEObjectImpl) object).setOid(instanceName);
		if (instanceName > 0) {
			instances.put(instanceName, instance.getIndex());
		} else {
			inlineInstances.put(object, instance.getIndex());
		}
		return object;
	}

	public Iterator<IdEObject> iterator() {
		return new Iterator<IdEObject>() {
			private final StepEntityInstanceIterator it = exchange.getDataEntityIterator();

			@Override
			public void remove() {
			}

			@Override
			public IdEObject next() {
				return create(it.next());
			}

			@Override
			public boolean hasNext() {
				return it.hasNext();
			}
		};
	}

	public <T extends IdEObject> List<T> getAll(Class<T> clazz) {
		return getAll(eClassClassMap.inverse().get(clazz));
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> List<T> getAll(EClass eClass) {
		List<Integer> list = instancesPerClass.get(eClass);
		if (list == null) {
			return Collections.emptyList();
		}
		List<T> result = Lists.newArrayList();
		for (int instanceIndex : list) {
			result.add((T) create(instanceIndex));
		}
		return result;
	}

	public <T extends IdEObject> List<T> getAllWithSubTypes(Class<T> clazz) {
		return getAllWithSubTypes(eClassClassMap.inverse().get(clazz));
	}

	@SuppressWarnings("unchecked")
	public <T extends IdEObject> List<T> getAllWithSubTypes(EClass eClass) {
		List<T> result = Lists.newArrayList();
		if (eClass == null) {
			return result;
		}
		result.addAll((List<T>) getAll(eClass));
		List<EClass> subTypes = eClassSubTypes.get(eClass);
		if (subTypes == null) {
			return result;
		}
		for (EClass subtype : subTypes) {
			result.addAll((List<T>) getAllWithSubTypes(subtype));
		}
		return result;
	}

	public boolean contains(IdEObject referencedObject) {
		return instances.containsKey(((IdEObjectImpl) referencedObject).getOid());
	}

	public IdEObject get(long oid) {
		return create(getInstanceIndex(oid));
	}

	private int getInstanceIndex(long instanceName) {
		Integer instanceIndex = instances.get(instanceName);
		if (instanceIndex == null) {
			throw new RuntimeException(String.format("Instance #%d missing from exchange", instanceName));
		}
		return instanceIndex;
	}

	public SIfcHeader getIfcHeader() {
		return ifcHeader;
	}

	private Object createEnumerator(String enumName, String literalName) {
		EClassifier eClassifier = ePackage.getEClassifier(enumName);
		if (eClassifier == null) {
			throw new RuntimeException("Classifier " + enumName + " not found in package " + ePackage.getName());
		}
		if (eClassifier instanceof EEnum) {
			EEnum eEnum = (EEnum)eClassifier;
			Object enumerator = ePackage.getEFactoryInstance().createFromString(eEnum, literalName);
			if (enumerator == null) {
				throw new RuntimeException("No enum literal " + literalName + " found on " + ePackage.getName() + "." + enumName);
			}
			return enumerator;
		} else {
			throw new RuntimeException("Classifier " + enumName + " is not of type enum");
		}
	}

}

