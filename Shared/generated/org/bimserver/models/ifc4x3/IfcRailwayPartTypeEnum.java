/**
 * Copyright (C) 2009-2013 BIMserver.org
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
 */
package org.bimserver.models.ifc4x3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Railway Part Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcRailwayPartTypeEnum()
 * @model
 * @generated
 */
public enum IfcRailwayPartTypeEnum implements Enumerator {
    /**
     * The '<em><b>NULL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NULL_VALUE
     * @generated
     * @ordered
     */
    NULL(0, "NULL", "NULL"),

    /**
     * The '<em><b>LINESIDESTRUCTUREPART</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINESIDESTRUCTUREPART_VALUE
     * @generated
     * @ordered
     */
    LINESIDESTRUCTUREPART(1, "LINESIDESTRUCTUREPART", "LINESIDESTRUCTUREPART"),

    /**
     * The '<em><b>TURNOUTSUPERSTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TURNOUTSUPERSTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    TURNOUTSUPERSTRUCTURE(2, "TURNOUTSUPERSTRUCTURE", "TURNOUTSUPERSTRUCTURE"),

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(3, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>LINESIDESTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINESIDESTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    LINESIDESTRUCTURE(4, "LINESIDESTRUCTURE", "LINESIDESTRUCTURE"),

    /**
     * The '<em><b>PLAINTRACKSUPERSTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLAINTRACKSUPERSTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    PLAINTRACKSUPERSTRUCTURE(5, "PLAINTRACKSUPERSTRUCTURE", "PLAINTRACKSUPERSTRUCTURE"),

    /**
     * The '<em><b>SUPERSTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUPERSTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    SUPERSTRUCTURE(6, "SUPERSTRUCTURE", "SUPERSTRUCTURE"),

    /**
     * The '<em><b>TRACKSTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRACKSTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    TRACKSTRUCTURE(7, "TRACKSTRUCTURE", "TRACKSTRUCTURE"),

    /**
     * The '<em><b>TRACKSTRUCTUREPART</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRACKSTRUCTUREPART_VALUE
     * @generated
     * @ordered
     */
    TRACKSTRUCTUREPART(8, "TRACKSTRUCTUREPART", "TRACKSTRUCTUREPART"),

    /**
     * The '<em><b>USERDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED_VALUE
     * @generated
     * @ordered
     */
    USERDEFINED(9, "USERDEFINED", "USERDEFINED"),

    /**
     * The '<em><b>DILATATIONSUPERSTRUCTURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DILATATIONSUPERSTRUCTURE_VALUE
     * @generated
     * @ordered
     */
    DILATATIONSUPERSTRUCTURE(10, "DILATATIONSUPERSTRUCTURE", "DILATATIONSUPERSTRUCTURE");

    /**
     * The '<em><b>NULL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NULL
     * @model
     * @generated
     * @ordered
     */
    public static final int NULL_VALUE = 0;

    /**
     * The '<em><b>LINESIDESTRUCTUREPART</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINESIDESTRUCTUREPART
     * @model
     * @generated
     * @ordered
     */
    public static final int LINESIDESTRUCTUREPART_VALUE = 1;

    /**
     * The '<em><b>TURNOUTSUPERSTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TURNOUTSUPERSTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int TURNOUTSUPERSTRUCTURE_VALUE = 2;

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 3;

    /**
     * The '<em><b>LINESIDESTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINESIDESTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int LINESIDESTRUCTURE_VALUE = 4;

    /**
     * The '<em><b>PLAINTRACKSUPERSTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLAINTRACKSUPERSTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int PLAINTRACKSUPERSTRUCTURE_VALUE = 5;

    /**
     * The '<em><b>SUPERSTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUPERSTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int SUPERSTRUCTURE_VALUE = 6;

    /**
     * The '<em><b>TRACKSTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRACKSTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int TRACKSTRUCTURE_VALUE = 7;

    /**
     * The '<em><b>TRACKSTRUCTUREPART</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRACKSTRUCTUREPART
     * @model
     * @generated
     * @ordered
     */
    public static final int TRACKSTRUCTUREPART_VALUE = 8;

    /**
     * The '<em><b>USERDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int USERDEFINED_VALUE = 9;

    /**
     * The '<em><b>DILATATIONSUPERSTRUCTURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DILATATIONSUPERSTRUCTURE
     * @model
     * @generated
     * @ordered
     */
    public static final int DILATATIONSUPERSTRUCTURE_VALUE = 10;

    /**
     * An array of all the '<em><b>Ifc Railway Part Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcRailwayPartTypeEnum[] VALUES_ARRAY = new IfcRailwayPartTypeEnum[] { NULL,
            LINESIDESTRUCTUREPART, TURNOUTSUPERSTRUCTURE, NOTDEFINED, LINESIDESTRUCTURE, PLAINTRACKSUPERSTRUCTURE,
            SUPERSTRUCTURE, TRACKSTRUCTURE, TRACKSTRUCTUREPART, USERDEFINED, DILATATIONSUPERSTRUCTURE, };

    /**
     * A public read-only list of all the '<em><b>Ifc Railway Part Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcRailwayPartTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Railway Part Type Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcRailwayPartTypeEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcRailwayPartTypeEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Railway Part Type Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcRailwayPartTypeEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcRailwayPartTypeEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Railway Part Type Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcRailwayPartTypeEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case LINESIDESTRUCTUREPART_VALUE:
            return LINESIDESTRUCTUREPART;
        case TURNOUTSUPERSTRUCTURE_VALUE:
            return TURNOUTSUPERSTRUCTURE;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case LINESIDESTRUCTURE_VALUE:
            return LINESIDESTRUCTURE;
        case PLAINTRACKSUPERSTRUCTURE_VALUE:
            return PLAINTRACKSUPERSTRUCTURE;
        case SUPERSTRUCTURE_VALUE:
            return SUPERSTRUCTURE;
        case TRACKSTRUCTURE_VALUE:
            return TRACKSTRUCTURE;
        case TRACKSTRUCTUREPART_VALUE:
            return TRACKSTRUCTUREPART;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case DILATATIONSUPERSTRUCTURE_VALUE:
            return DILATATIONSUPERSTRUCTURE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private IfcRailwayPartTypeEnum(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //IfcRailwayPartTypeEnum
