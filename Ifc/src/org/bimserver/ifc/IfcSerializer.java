package org.bimserver.ifc;

import java.util.Collection;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.HashMap;
import java.util.Map;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.interfaces.objects.SIfcHeader;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4x3.Ifc4x3Package;
import org.bimserver.models.ifc4x3add2.Ifc4x3add2Package;
import org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEnginePlugin;
import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.InverseAttribute;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.schema.SchemaPlugin;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class IfcSerializer extends EmfSerializer {

	protected SchemaDefinition schema;
	protected EPackage ePackage;
	protected Map<EClassifier, String> upperCases;
	private Map<EStructuralFeature, Boolean> inverseCache = new HashMap<EStructuralFeature, Boolean>();

	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, PluginManager pluginManager, RenderEnginePlugin renderEnginePlugin, boolean normalizeOids) throws SerializerException {
		super.init(model, projectInfo, pluginManager, renderEnginePlugin, normalizeOids);
		schema = initSchema(pluginManager);
		ePackage = initPackage();
		upperCases = initUpperCases();
	}

	private EPackage initPackage() throws SerializerException {
		if ("IFC2X3".equals(schema.getName().toUpperCase())) {
			return Ifc2x3tc1Package.eINSTANCE;
		} else if ("IFC4".equals(schema.getName().toUpperCase())) {
			return Ifc4Package.eINSTANCE;
		} else if ("IFC4X3".equals(schema.getName().toUpperCase())) {
			return Ifc4x3Package.eINSTANCE;
		} else if ("IFC4X3_ADD2".equals(schema.getName().toUpperCase())) {
			return Ifc4x3add2Package.eINSTANCE;
		} else if (schema.getName().toUpperCase().startsWith("IFC4X3_RC")) {
			return Ifc4x3rc4Package.eINSTANCE;
		} else {
			throw new SerializerException("Unknown package " + ePackage.getName());
		}
	}

	private SchemaDefinition initSchema(PluginManager pluginManager) throws SerializerException {
		SIfcHeader header = model.getModelMetaData().getIfcHeader();
		if (header == null) {
			try {
				return pluginManager.requireSchemaDefinition();
			} catch (PluginException e) {
				throw new SerializerException(e);
			}
		}

		String schemaName = header.getIfcSchemaVersion();
		Collection<SchemaPlugin> schemaPlugins = pluginManager.getAllSchemaPlugins(false);
		SchemaDefinition schemaDefinition = null;
		for (SchemaPlugin schemaPlugin : schemaPlugins) {
			if (!schemaPlugin.isInitialized()) {
				try {
					schemaPlugin.init(pluginManager);
				} catch (PluginException e) {
					throw new SerializerException(e);
				}
			}
			schemaDefinition = schemaPlugin.getSchemaDefinition(new PluginConfiguration());
			if (schemaName.equals(schemaDefinition.getName())) {
				break;
			}
		}
		if (schemaDefinition == null) {
			throw new SerializerException("Unsupported schema " + schemaName);
		}
		return schemaDefinition;
	}

	private Map<EClassifier, String> initUpperCases() {
		Map<EClassifier, String> upperCases = new HashMap<EClassifier, String>();
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			upperCases.put(classifier, classifier.getName().toUpperCase());
		}
		return upperCases;
	}

	protected boolean isInverse(EStructuralFeature feature) throws SerializerException {
		if (inverseCache.containsKey(feature)) {
			return inverseCache.get(feature);
		}
		EntityDefinition entityBN = schema.getEntityBNNoCaseConvert(upperCases.get(feature.getEContainingClass()));
		if (entityBN == null) {
			return false;
		}
		Attribute attributeBNWithSuper = entityBN.getAttributeBNWithSuper(feature.getName());
		boolean isInverse = entityBN != null && attributeBNWithSuper instanceof InverseAttribute;
		inverseCache.put(feature, isInverse);
		return isInverse;
	}
}