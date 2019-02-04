package org.bimserver.database.migrations.steps;

import org.bimserver.database.migrations.Migration;
import org.bimserver.database.migrations.Schema;

public class Step0005 extends Migration {

    @Override
    public void migrate(Schema schema) {
    }

    @Override
    public String getDescription() {
        return "Represent STEP INTEGER as Long";
    }
}
