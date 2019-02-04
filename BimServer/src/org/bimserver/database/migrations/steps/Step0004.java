package org.bimserver.database.migrations.steps;

import org.bimserver.database.migrations.Migration;
import org.bimserver.database.migrations.Schema;
import org.eclipse.emf.ecore.EClass;

public class Step0004 extends Migration {

    @Override
    public void migrate(Schema schema) {
        schema.loadEcore(getClass().getResourceAsStream("IFC4.ecore"));
        EClass ifcRoot = schema.getEClass("ifc2x3tc1", "IfcRoot");
        ifcRoot.getEStructuralFeature("GlobalId").getEAnnotations().add(createIndexAnnotation());
        ifcRoot.getEStructuralFeature("Name").getEAnnotations().add(createIndexAnnotation());
    }

    @Override
    public String getDescription() {
        return "Add IFC4 schema";
    }
}
