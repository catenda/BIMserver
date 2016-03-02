package org.bimserver.ifc.step.deserializer.readonly;

import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.Deserializer;
import org.bimserver.plugins.deserializers.DeserializerPlugin;
import org.bimserver.plugins.schema.SchemaException;

public class IfcStepReadOnlyDeserializerPlugin implements DeserializerPlugin {

	boolean initialized = false;

	@Override
	public Deserializer createDeserializer(
			PluginConfiguration pluginConfiguration) {
		return new IfcStepReadOnlyDeserializer();
	}

	@Override
	public String getDescription() {
		return "IfcStepReadOnlyDeserializer";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void init(PluginManager pluginManager) throws SchemaException,
			PluginException {
		pluginManager.requireSchemaDefinition();
		initialized = true;
	}

	@Override
	public boolean canHandleExtension(String extension) {
		return extension.equalsIgnoreCase("ifc")
				|| extension.equalsIgnoreCase("ifczip");
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public String getDefaultName() {
		return "IfcStepReadOnlyDeserializer";
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return null;
	}
}