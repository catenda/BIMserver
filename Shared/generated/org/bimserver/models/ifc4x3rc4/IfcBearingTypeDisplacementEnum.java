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
 * A representation of the literals of the enumeration '<em><b>Ifc Bearing Type Displacement Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcBearingTypeDisplacementEnum()
 * @model
 * @generated
 */
public enum IfcBearingTypeDisplacementEnum implements Enumerator {
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
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(1, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>FREE MOVEMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FREE_MOVEMENT_VALUE
     * @generated
     * @ordered
     */
    FREE_MOVEMENT(2, "FREE_MOVEMENT", "FREE_MOVEMENT"),

    /**
     * The '<em><b>GUIDED LONGITUDINAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GUIDED_LONGITUDINAL_VALUE
     * @generated
     * @ordered
     */
    GUIDED_LONGITUDINAL(3, "GUIDED_LONGITUDINAL", "GUIDED_LONGITUDINAL"),

    /**
     * The '<em><b>FIXED MOVEMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_MOVEMENT_VALUE
     * @generated
     * @ordered
     */
    FIXED_MOVEMENT(4, "FIXED_MOVEMENT", "FIXED_MOVEMENT"),

    /**
     * The '<em><b>GUIDED TRANSVERSAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GUIDED_TRANSVERSAL_VALUE
     * @generated
     * @ordered
     */
    GUIDED_TRANSVERSAL(5, "GUIDED_TRANSVERSAL", "GUIDED_TRANSVERSAL");

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
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 1;

    /**
     * The '<em><b>FREE MOVEMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FREE_MOVEMENT
     * @model
     * @generated
     * @ordered
     */
    public static final int FREE_MOVEMENT_VALUE = 2;

    /**
     * The '<em><b>GUIDED LONGITUDINAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GUIDED_LONGITUDINAL
     * @model
     * @generated
     * @ordered
     */
    public static final int GUIDED_LONGITUDINAL_VALUE = 3;

    /**
     * The '<em><b>FIXED MOVEMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_MOVEMENT
     * @model
     * @generated
     * @ordered
     */
    public static final int FIXED_MOVEMENT_VALUE = 4;

    /**
     * The '<em><b>GUIDED TRANSVERSAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GUIDED_TRANSVERSAL
     * @model
     * @generated
     * @ordered
     */
    public static final int GUIDED_TRANSVERSAL_VALUE = 5;

    /**
     * An array of all the '<em><b>Ifc Bearing Type Displacement Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcBearingTypeDisplacementEnum[] VALUES_ARRAY = new IfcBearingTypeDisplacementEnum[] { NULL,
            NOTDEFINED, FREE_MOVEMENT, GUIDED_LONGITUDINAL, FIXED_MOVEMENT, GUIDED_TRANSVERSAL, };

    /**
     * A public read-only list of all the '<em><b>Ifc Bearing Type Displacement Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcBearingTypeDisplacementEnum> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Bearing Type Displacement Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBearingTypeDisplacementEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcBearingTypeDisplacementEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Bearing Type Displacement Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBearingTypeDisplacementEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcBearingTypeDisplacementEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Bearing Type Displacement Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcBearingTypeDisplacementEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case FREE_MOVEMENT_VALUE:
            return FREE_MOVEMENT;
        case GUIDED_LONGITUDINAL_VALUE:
            return GUIDED_LONGITUDINAL;
        case FIXED_MOVEMENT_VALUE:
            return FIXED_MOVEMENT;
        case GUIDED_TRANSVERSAL_VALUE:
            return GUIDED_TRANSVERSAL;
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
    private IfcBearingTypeDisplacementEnum(int value, String name, String literal) {
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

} //IfcBearingTypeDisplacementEnum
