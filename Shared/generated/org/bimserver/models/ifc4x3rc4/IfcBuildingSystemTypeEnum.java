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
package org.bimserver.models.ifc4x3rc4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Building System Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcBuildingSystemTypeEnum()
 * @model
 * @generated
 */
public enum IfcBuildingSystemTypeEnum implements Enumerator {
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
     * The '<em><b>OUTERSHELL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTERSHELL_VALUE
     * @generated
     * @ordered
     */
    OUTERSHELL(1, "OUTERSHELL", "OUTERSHELL"),

    /**
     * The '<em><b>EROSIONPREVENTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EROSIONPREVENTION_VALUE
     * @generated
     * @ordered
     */
    EROSIONPREVENTION(2, "EROSIONPREVENTION", "EROSIONPREVENTION"),

    /**
     * The '<em><b>FOUNDATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOUNDATION_VALUE
     * @generated
     * @ordered
     */
    FOUNDATION(3, "FOUNDATION", "FOUNDATION"),

    /**
     * The '<em><b>TRANSPORT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSPORT_VALUE
     * @generated
     * @ordered
     */
    TRANSPORT(4, "TRANSPORT", "TRANSPORT"),

    /**
     * The '<em><b>REINFORCING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REINFORCING_VALUE
     * @generated
     * @ordered
     */
    REINFORCING(5, "REINFORCING", "REINFORCING"),

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(6, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>PRESTRESSING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESTRESSING_VALUE
     * @generated
     * @ordered
     */
    PRESTRESSING(7, "PRESTRESSING", "PRESTRESSING"),

    /**
     * The '<em><b>FENESTRATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FENESTRATION_VALUE
     * @generated
     * @ordered
     */
    FENESTRATION(8, "FENESTRATION", "FENESTRATION"),

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
     * The '<em><b>LOADBEARING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOADBEARING_VALUE
     * @generated
     * @ordered
     */
    LOADBEARING(10, "LOADBEARING", "LOADBEARING"),

    /**
     * The '<em><b>SHADING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHADING_VALUE
     * @generated
     * @ordered
     */
    SHADING(11, "SHADING", "SHADING");

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
     * The '<em><b>OUTERSHELL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTERSHELL
     * @model
     * @generated
     * @ordered
     */
    public static final int OUTERSHELL_VALUE = 1;

    /**
     * The '<em><b>EROSIONPREVENTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EROSIONPREVENTION
     * @model
     * @generated
     * @ordered
     */
    public static final int EROSIONPREVENTION_VALUE = 2;

    /**
     * The '<em><b>FOUNDATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOUNDATION
     * @model
     * @generated
     * @ordered
     */
    public static final int FOUNDATION_VALUE = 3;

    /**
     * The '<em><b>TRANSPORT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSPORT
     * @model
     * @generated
     * @ordered
     */
    public static final int TRANSPORT_VALUE = 4;

    /**
     * The '<em><b>REINFORCING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REINFORCING
     * @model
     * @generated
     * @ordered
     */
    public static final int REINFORCING_VALUE = 5;

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 6;

    /**
     * The '<em><b>PRESTRESSING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESTRESSING
     * @model
     * @generated
     * @ordered
     */
    public static final int PRESTRESSING_VALUE = 7;

    /**
     * The '<em><b>FENESTRATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FENESTRATION
     * @model
     * @generated
     * @ordered
     */
    public static final int FENESTRATION_VALUE = 8;

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
     * The '<em><b>LOADBEARING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOADBEARING
     * @model
     * @generated
     * @ordered
     */
    public static final int LOADBEARING_VALUE = 10;

    /**
     * The '<em><b>SHADING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHADING
     * @model
     * @generated
     * @ordered
     */
    public static final int SHADING_VALUE = 11;

    /**
     * An array of all the '<em><b>Ifc Building System Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcBuildingSystemTypeEnum[] VALUES_ARRAY = new IfcBuildingSystemTypeEnum[] { NULL, OUTERSHELL,
            EROSIONPREVENTION, FOUNDATION, TRANSPORT, REINFORCING, NOTDEFINED, PRESTRESSING, FENESTRATION, USERDEFINED,
            LOADBEARING, SHADING, };

    /**
     * A public read-only list of all the '<em><b>Ifc Building System Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcBuildingSystemTypeEnum> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Building System Type Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBuildingSystemTypeEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcBuildingSystemTypeEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Building System Type Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBuildingSystemTypeEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcBuildingSystemTypeEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Building System Type Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBuildingSystemTypeEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case OUTERSHELL_VALUE:
            return OUTERSHELL;
        case EROSIONPREVENTION_VALUE:
            return EROSIONPREVENTION;
        case FOUNDATION_VALUE:
            return FOUNDATION;
        case TRANSPORT_VALUE:
            return TRANSPORT;
        case REINFORCING_VALUE:
            return REINFORCING;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case PRESTRESSING_VALUE:
            return PRESTRESSING;
        case FENESTRATION_VALUE:
            return FENESTRATION;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case LOADBEARING_VALUE:
            return LOADBEARING;
        case SHADING_VALUE:
            return SHADING;
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
    private IfcBuildingSystemTypeEnum(int value, String name, String literal) {
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

} //IfcBuildingSystemTypeEnum
