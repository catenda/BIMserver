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
 * A representation of the literals of the enumeration '<em><b>Ifc Door Type Operation Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcDoorTypeOperationEnum()
 * @model
 * @generated
 */
public enum IfcDoorTypeOperationEnum implements Enumerator {
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
     * The '<em><b>LIFTING HORIZONTAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_HORIZONTAL_VALUE
     * @generated
     * @ordered
     */
    LIFTING_HORIZONTAL(1, "LIFTING_HORIZONTAL", "LIFTING_HORIZONTAL"),

    /**
     * The '<em><b>LIFTING VERTICAL RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_VERTICAL_RIGHT_VALUE
     * @generated
     * @ordered
     */
    LIFTING_VERTICAL_RIGHT(2, "LIFTING_VERTICAL_RIGHT", "LIFTING_VERTICAL_RIGHT"),

    /**
     * The '<em><b>DOUBLE PANEL DOUBLE SWING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_DOUBLE_SWING_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_DOUBLE_SWING(3, "DOUBLE_PANEL_DOUBLE_SWING", "DOUBLE_PANEL_DOUBLE_SWING"),

    /**
     * The '<em><b>USERDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED_VALUE
     * @generated
     * @ordered
     */
    USERDEFINED(4, "USERDEFINED", "USERDEFINED"),

    /**
     * The '<em><b>SWING FIXED LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWING_FIXED_LEFT_VALUE
     * @generated
     * @ordered
     */
    SWING_FIXED_LEFT(5, "SWING_FIXED_LEFT", "SWING_FIXED_LEFT"),

    /**
     * The '<em><b>LIFTING VERTICAL LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_VERTICAL_LEFT_VALUE
     * @generated
     * @ordered
     */
    LIFTING_VERTICAL_LEFT(6, "LIFTING_VERTICAL_LEFT", "LIFTING_VERTICAL_LEFT"),

    /**
     * The '<em><b>FOLDING TO LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOLDING_TO_LEFT_VALUE
     * @generated
     * @ordered
     */
    FOLDING_TO_LEFT(7, "FOLDING_TO_LEFT", "FOLDING_TO_LEFT"),

    /**
     * The '<em><b>DOUBLE PANEL LIFTING VERTICAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_LIFTING_VERTICAL_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_LIFTING_VERTICAL(8, "DOUBLE_PANEL_LIFTING_VERTICAL", "DOUBLE_PANEL_LIFTING_VERTICAL"),

    /**
     * The '<em><b>SLIDING TO RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDING_TO_RIGHT_VALUE
     * @generated
     * @ordered
     */
    SLIDING_TO_RIGHT(9, "SLIDING_TO_RIGHT", "SLIDING_TO_RIGHT"),

    /**
     * The '<em><b>SINGLE SWING RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_SWING_RIGHT_VALUE
     * @generated
     * @ordered
     */
    SINGLE_SWING_RIGHT(10, "SINGLE_SWING_RIGHT", "SINGLE_SWING_RIGHT"),

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(11, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING OPPOSITE LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT(12, "DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT",
            "DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT"),

    /**
     * The '<em><b>REVOLVING HORIZONTAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVOLVING_HORIZONTAL_VALUE
     * @generated
     * @ordered
     */
    REVOLVING_HORIZONTAL(13, "REVOLVING_HORIZONTAL", "REVOLVING_HORIZONTAL"),

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING OPPOSITE RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT(14, "DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT",
            "DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT"),

    /**
     * The '<em><b>SWING FIXED RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWING_FIXED_RIGHT_VALUE
     * @generated
     * @ordered
     */
    SWING_FIXED_RIGHT(15, "SWING_FIXED_RIGHT", "SWING_FIXED_RIGHT"),

    /**
     * The '<em><b>ROLLINGUP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLINGUP_VALUE
     * @generated
     * @ordered
     */
    ROLLINGUP(16, "ROLLINGUP", "ROLLINGUP"),

    /**
     * The '<em><b>REVOLVING VERTICAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVOLVING_VERTICAL_VALUE
     * @generated
     * @ordered
     */
    REVOLVING_VERTICAL(17, "REVOLVING_VERTICAL", "REVOLVING_VERTICAL"),

    /**
     * The '<em><b>DOUBLE PANEL FOLDING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_FOLDING_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_FOLDING(18, "DOUBLE_PANEL_FOLDING", "DOUBLE_PANEL_FOLDING"),

    /**
     * The '<em><b>FOLDING TO RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOLDING_TO_RIGHT_VALUE
     * @generated
     * @ordered
     */
    FOLDING_TO_RIGHT(19, "FOLDING_TO_RIGHT", "FOLDING_TO_RIGHT"),

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_SINGLE_SWING(20, "DOUBLE_PANEL_SINGLE_SWING", "DOUBLE_PANEL_SINGLE_SWING"),

    /**
     * The '<em><b>DOUBLE PANEL SLIDING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SLIDING_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_PANEL_SLIDING(21, "DOUBLE_PANEL_SLIDING", "DOUBLE_PANEL_SLIDING"),

    /**
     * The '<em><b>DOUBLE SWING LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_SWING_LEFT_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_SWING_LEFT(22, "DOUBLE_SWING_LEFT", "DOUBLE_SWING_LEFT"),

    /**
     * The '<em><b>SLIDING TO LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDING_TO_LEFT_VALUE
     * @generated
     * @ordered
     */
    SLIDING_TO_LEFT(23, "SLIDING_TO_LEFT", "SLIDING_TO_LEFT"),

    /**
     * The '<em><b>DOUBLE SWING RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_SWING_RIGHT_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_SWING_RIGHT(24, "DOUBLE_SWING_RIGHT", "DOUBLE_SWING_RIGHT"),

    /**
     * The '<em><b>SINGLE SWING LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_SWING_LEFT_VALUE
     * @generated
     * @ordered
     */
    SINGLE_SWING_LEFT(25, "SINGLE_SWING_LEFT", "SINGLE_SWING_LEFT");

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
     * The '<em><b>LIFTING HORIZONTAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_HORIZONTAL
     * @model
     * @generated
     * @ordered
     */
    public static final int LIFTING_HORIZONTAL_VALUE = 1;

    /**
     * The '<em><b>LIFTING VERTICAL RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_VERTICAL_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int LIFTING_VERTICAL_RIGHT_VALUE = 2;

    /**
     * The '<em><b>DOUBLE PANEL DOUBLE SWING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_DOUBLE_SWING
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_DOUBLE_SWING_VALUE = 3;

    /**
     * The '<em><b>USERDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int USERDEFINED_VALUE = 4;

    /**
     * The '<em><b>SWING FIXED LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWING_FIXED_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int SWING_FIXED_LEFT_VALUE = 5;

    /**
     * The '<em><b>LIFTING VERTICAL LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIFTING_VERTICAL_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int LIFTING_VERTICAL_LEFT_VALUE = 6;

    /**
     * The '<em><b>FOLDING TO LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOLDING_TO_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int FOLDING_TO_LEFT_VALUE = 7;

    /**
     * The '<em><b>DOUBLE PANEL LIFTING VERTICAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_LIFTING_VERTICAL
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_LIFTING_VERTICAL_VALUE = 8;

    /**
     * The '<em><b>SLIDING TO RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDING_TO_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int SLIDING_TO_RIGHT_VALUE = 9;

    /**
     * The '<em><b>SINGLE SWING RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_SWING_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int SINGLE_SWING_RIGHT_VALUE = 10;

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 11;

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING OPPOSITE LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT_VALUE = 12;

    /**
     * The '<em><b>REVOLVING HORIZONTAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVOLVING_HORIZONTAL
     * @model
     * @generated
     * @ordered
     */
    public static final int REVOLVING_HORIZONTAL_VALUE = 13;

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING OPPOSITE RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT_VALUE = 14;

    /**
     * The '<em><b>SWING FIXED RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWING_FIXED_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int SWING_FIXED_RIGHT_VALUE = 15;

    /**
     * The '<em><b>ROLLINGUP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLINGUP
     * @model
     * @generated
     * @ordered
     */
    public static final int ROLLINGUP_VALUE = 16;

    /**
     * The '<em><b>REVOLVING VERTICAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVOLVING_VERTICAL
     * @model
     * @generated
     * @ordered
     */
    public static final int REVOLVING_VERTICAL_VALUE = 17;

    /**
     * The '<em><b>DOUBLE PANEL FOLDING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_FOLDING
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_FOLDING_VALUE = 18;

    /**
     * The '<em><b>FOLDING TO RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOLDING_TO_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int FOLDING_TO_RIGHT_VALUE = 19;

    /**
     * The '<em><b>DOUBLE PANEL SINGLE SWING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SINGLE_SWING
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_SINGLE_SWING_VALUE = 20;

    /**
     * The '<em><b>DOUBLE PANEL SLIDING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_PANEL_SLIDING
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_PANEL_SLIDING_VALUE = 21;

    /**
     * The '<em><b>DOUBLE SWING LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_SWING_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_SWING_LEFT_VALUE = 22;

    /**
     * The '<em><b>SLIDING TO LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDING_TO_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int SLIDING_TO_LEFT_VALUE = 23;

    /**
     * The '<em><b>DOUBLE SWING RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_SWING_RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_SWING_RIGHT_VALUE = 24;

    /**
     * The '<em><b>SINGLE SWING LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_SWING_LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int SINGLE_SWING_LEFT_VALUE = 25;

    /**
     * An array of all the '<em><b>Ifc Door Type Operation Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcDoorTypeOperationEnum[] VALUES_ARRAY = new IfcDoorTypeOperationEnum[] { NULL,
            LIFTING_HORIZONTAL, LIFTING_VERTICAL_RIGHT, DOUBLE_PANEL_DOUBLE_SWING, USERDEFINED, SWING_FIXED_LEFT,
            LIFTING_VERTICAL_LEFT, FOLDING_TO_LEFT, DOUBLE_PANEL_LIFTING_VERTICAL, SLIDING_TO_RIGHT, SINGLE_SWING_RIGHT,
            NOTDEFINED, DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT, REVOLVING_HORIZONTAL,
            DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT, SWING_FIXED_RIGHT, ROLLINGUP, REVOLVING_VERTICAL,
            DOUBLE_PANEL_FOLDING, FOLDING_TO_RIGHT, DOUBLE_PANEL_SINGLE_SWING, DOUBLE_PANEL_SLIDING, DOUBLE_SWING_LEFT,
            SLIDING_TO_LEFT, DOUBLE_SWING_RIGHT, SINGLE_SWING_LEFT, };

    /**
     * A public read-only list of all the '<em><b>Ifc Door Type Operation Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcDoorTypeOperationEnum> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Door Type Operation Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDoorTypeOperationEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcDoorTypeOperationEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Door Type Operation Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDoorTypeOperationEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcDoorTypeOperationEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Door Type Operation Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDoorTypeOperationEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case LIFTING_HORIZONTAL_VALUE:
            return LIFTING_HORIZONTAL;
        case LIFTING_VERTICAL_RIGHT_VALUE:
            return LIFTING_VERTICAL_RIGHT;
        case DOUBLE_PANEL_DOUBLE_SWING_VALUE:
            return DOUBLE_PANEL_DOUBLE_SWING;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case SWING_FIXED_LEFT_VALUE:
            return SWING_FIXED_LEFT;
        case LIFTING_VERTICAL_LEFT_VALUE:
            return LIFTING_VERTICAL_LEFT;
        case FOLDING_TO_LEFT_VALUE:
            return FOLDING_TO_LEFT;
        case DOUBLE_PANEL_LIFTING_VERTICAL_VALUE:
            return DOUBLE_PANEL_LIFTING_VERTICAL;
        case SLIDING_TO_RIGHT_VALUE:
            return SLIDING_TO_RIGHT;
        case SINGLE_SWING_RIGHT_VALUE:
            return SINGLE_SWING_RIGHT;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT_VALUE:
            return DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_LEFT;
        case REVOLVING_HORIZONTAL_VALUE:
            return REVOLVING_HORIZONTAL;
        case DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT_VALUE:
            return DOUBLE_PANEL_SINGLE_SWING_OPPOSITE_RIGHT;
        case SWING_FIXED_RIGHT_VALUE:
            return SWING_FIXED_RIGHT;
        case ROLLINGUP_VALUE:
            return ROLLINGUP;
        case REVOLVING_VERTICAL_VALUE:
            return REVOLVING_VERTICAL;
        case DOUBLE_PANEL_FOLDING_VALUE:
            return DOUBLE_PANEL_FOLDING;
        case FOLDING_TO_RIGHT_VALUE:
            return FOLDING_TO_RIGHT;
        case DOUBLE_PANEL_SINGLE_SWING_VALUE:
            return DOUBLE_PANEL_SINGLE_SWING;
        case DOUBLE_PANEL_SLIDING_VALUE:
            return DOUBLE_PANEL_SLIDING;
        case DOUBLE_SWING_LEFT_VALUE:
            return DOUBLE_SWING_LEFT;
        case SLIDING_TO_LEFT_VALUE:
            return SLIDING_TO_LEFT;
        case DOUBLE_SWING_RIGHT_VALUE:
            return DOUBLE_SWING_RIGHT;
        case SINGLE_SWING_LEFT_VALUE:
            return SINGLE_SWING_LEFT;
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
    private IfcDoorTypeOperationEnum(int value, String name, String literal) {
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

} //IfcDoorTypeOperationEnum
