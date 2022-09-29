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
 * A representation of the literals of the enumeration '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcVibrationDamperTypeEnumEnum()
 * @model
 * @generated
 */
public enum IfcVibrationDamperTypeEnumEnum implements Enumerator {
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
     * The '<em><b>SHEAR YIELD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHEAR_YIELD_VALUE
     * @generated
     * @ordered
     */
    SHEAR_YIELD(1, "SHEAR_YIELD", "SHEAR_YIELD"),

    /**
     * The '<em><b>FRICTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRICTION_VALUE
     * @generated
     * @ordered
     */
    FRICTION(2, "FRICTION", "FRICTION"),

    /**
     * The '<em><b>VISCOUS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VISCOUS_VALUE
     * @generated
     * @ordered
     */
    VISCOUS(3, "VISCOUS", "VISCOUS"),

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(4, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>AXIAL YIELD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AXIAL_YIELD_VALUE
     * @generated
     * @ordered
     */
    AXIAL_YIELD(5, "AXIAL_YIELD", "AXIAL_YIELD"),

    /**
     * The '<em><b>RUBBER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUBBER_VALUE
     * @generated
     * @ordered
     */
    RUBBER(6, "RUBBER", "RUBBER"),

    /**
     * The '<em><b>USERDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED_VALUE
     * @generated
     * @ordered
     */
    USERDEFINED(7, "USERDEFINED", "USERDEFINED"),

    /**
     * The '<em><b>BENDING YIELD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BENDING_YIELD_VALUE
     * @generated
     * @ordered
     */
    BENDING_YIELD(8, "BENDING_YIELD", "BENDING_YIELD");

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
     * The '<em><b>SHEAR YIELD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHEAR_YIELD
     * @model
     * @generated
     * @ordered
     */
    public static final int SHEAR_YIELD_VALUE = 1;

    /**
     * The '<em><b>FRICTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRICTION
     * @model
     * @generated
     * @ordered
     */
    public static final int FRICTION_VALUE = 2;

    /**
     * The '<em><b>VISCOUS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VISCOUS
     * @model
     * @generated
     * @ordered
     */
    public static final int VISCOUS_VALUE = 3;

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 4;

    /**
     * The '<em><b>AXIAL YIELD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AXIAL_YIELD
     * @model
     * @generated
     * @ordered
     */
    public static final int AXIAL_YIELD_VALUE = 5;

    /**
     * The '<em><b>RUBBER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUBBER
     * @model
     * @generated
     * @ordered
     */
    public static final int RUBBER_VALUE = 6;

    /**
     * The '<em><b>USERDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int USERDEFINED_VALUE = 7;

    /**
     * The '<em><b>BENDING YIELD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BENDING_YIELD
     * @model
     * @generated
     * @ordered
     */
    public static final int BENDING_YIELD_VALUE = 8;

    /**
     * An array of all the '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcVibrationDamperTypeEnumEnum[] VALUES_ARRAY = new IfcVibrationDamperTypeEnumEnum[] { NULL,
            SHEAR_YIELD, FRICTION, VISCOUS, NOTDEFINED, AXIAL_YIELD, RUBBER, USERDEFINED, BENDING_YIELD, };

    /**
     * A public read-only list of all the '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcVibrationDamperTypeEnumEnum> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcVibrationDamperTypeEnumEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcVibrationDamperTypeEnumEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcVibrationDamperTypeEnumEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcVibrationDamperTypeEnumEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Vibration Damper Type Enum Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcVibrationDamperTypeEnumEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case SHEAR_YIELD_VALUE:
            return SHEAR_YIELD;
        case FRICTION_VALUE:
            return FRICTION;
        case VISCOUS_VALUE:
            return VISCOUS;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case AXIAL_YIELD_VALUE:
            return AXIAL_YIELD;
        case RUBBER_VALUE:
            return RUBBER;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case BENDING_YIELD_VALUE:
            return BENDING_YIELD;
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
    private IfcVibrationDamperTypeEnumEnum(int value, String name, String literal) {
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

} //IfcVibrationDamperTypeEnumEnum
