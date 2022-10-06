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
 * A representation of the literals of the enumeration '<em><b>Ifc Discrete Accessory Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcDiscreteAccessoryTypeEnum()
 * @model
 * @generated
 */
public enum IfcDiscreteAccessoryTypeEnum implements Enumerator {
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
     * The '<em><b>INSULATOR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSULATOR_VALUE
     * @generated
     * @ordered
     */
    INSULATOR(1, "INSULATOR", "INSULATOR"),

    /**
     * The '<em><b>SLIDINGCHAIR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDINGCHAIR_VALUE
     * @generated
     * @ordered
     */
    SLIDINGCHAIR(2, "SLIDINGCHAIR", "SLIDINGCHAIR"),

    /**
     * The '<em><b>LOCK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCK_VALUE
     * @generated
     * @ordered
     */
    LOCK(3, "LOCK", "LOCK"),

    /**
     * The '<em><b>POINTMACHINEMOUNTINGDEVICE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POINTMACHINEMOUNTINGDEVICE_VALUE
     * @generated
     * @ordered
     */
    POINTMACHINEMOUNTINGDEVICE(4, "POINTMACHINEMOUNTINGDEVICE", "POINTMACHINEMOUNTINGDEVICE"),

    /**
     * The '<em><b>USERDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED_VALUE
     * @generated
     * @ordered
     */
    USERDEFINED(5, "USERDEFINED", "USERDEFINED"),

    /**
     * The '<em><b>SHOE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHOE_VALUE
     * @generated
     * @ordered
     */
    SHOE(6, "SHOE", "SHOE"),

    /**
     * The '<em><b>EXPANSION JOINT DEVICE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXPANSION_JOINT_DEVICE_VALUE
     * @generated
     * @ordered
     */
    EXPANSION_JOINT_DEVICE(7, "EXPANSION_JOINT_DEVICE", "EXPANSION_JOINT_DEVICE"),

    /**
     * The '<em><b>CABLEARRANGER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CABLEARRANGER_VALUE
     * @generated
     * @ordered
     */
    CABLEARRANGER(8, "CABLEARRANGER", "CABLEARRANGER"),

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED_VALUE
     * @generated
     * @ordered
     */
    NOTDEFINED(9, "NOTDEFINED", "NOTDEFINED"),

    /**
     * The '<em><b>RAILPAD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAILPAD_VALUE
     * @generated
     * @ordered
     */
    RAILPAD(10, "RAILPAD", "RAILPAD"),

    /**
     * The '<em><b>BRACKET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BRACKET_VALUE
     * @generated
     * @ordered
     */
    BRACKET(11, "BRACKET", "BRACKET"),

    /**
     * The '<em><b>TENSIONINGEQUIPMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TENSIONINGEQUIPMENT_VALUE
     * @generated
     * @ordered
     */
    TENSIONINGEQUIPMENT(12, "TENSIONINGEQUIPMENT", "TENSIONINGEQUIPMENT"),

    /**
     * The '<em><b>POINT MACHINE LOCKING DEVICE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POINT_MACHINE_LOCKING_DEVICE_VALUE
     * @generated
     * @ordered
     */
    POINT_MACHINE_LOCKING_DEVICE(13, "POINT_MACHINE_LOCKING_DEVICE", "POINT_MACHINE_LOCKING_DEVICE"),

    /**
     * The '<em><b>ANCHORPLATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ANCHORPLATE_VALUE
     * @generated
     * @ordered
     */
    ANCHORPLATE(14, "ANCHORPLATE", "ANCHORPLATE"),

    /**
     * The '<em><b>RAIL LUBRICATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAIL_LUBRICATION_VALUE
     * @generated
     * @ordered
     */
    RAIL_LUBRICATION(15, "RAIL_LUBRICATION", "RAIL_LUBRICATION"),

    /**
     * The '<em><b>RAILBRACE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAILBRACE_VALUE
     * @generated
     * @ordered
     */
    RAILBRACE(16, "RAILBRACE", "RAILBRACE"),

    /**
     * The '<em><b>SOUNDABSORPTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOUNDABSORPTION_VALUE
     * @generated
     * @ordered
     */
    SOUNDABSORPTION(17, "SOUNDABSORPTION", "SOUNDABSORPTION"),

    /**
     * The '<em><b>PANEL STRENGTHENING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PANEL_STRENGTHENING_VALUE
     * @generated
     * @ordered
     */
    PANEL_STRENGTHENING(18, "PANEL_STRENGTHENING", "PANEL_STRENGTHENING"),

    /**
     * The '<em><b>ELASTIC CUSHION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELASTIC_CUSHION_VALUE
     * @generated
     * @ordered
     */
    ELASTIC_CUSHION(19, "ELASTIC_CUSHION", "ELASTIC_CUSHION"),

    /**
     * The '<em><b>BIRDPROTECTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BIRDPROTECTION_VALUE
     * @generated
     * @ordered
     */
    BIRDPROTECTION(20, "BIRDPROTECTION", "BIRDPROTECTION"),

    /**
     * The '<em><b>RAIL MECHANICAL EQUIPMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAIL_MECHANICAL_EQUIPMENT_VALUE
     * @generated
     * @ordered
     */
    RAIL_MECHANICAL_EQUIPMENT(21, "RAIL_MECHANICAL_EQUIPMENT", "RAIL_MECHANICAL_EQUIPMENT");

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
     * The '<em><b>INSULATOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSULATOR
     * @model
     * @generated
     * @ordered
     */
    public static final int INSULATOR_VALUE = 1;

    /**
     * The '<em><b>SLIDINGCHAIR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLIDINGCHAIR
     * @model
     * @generated
     * @ordered
     */
    public static final int SLIDINGCHAIR_VALUE = 2;

    /**
     * The '<em><b>LOCK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCK
     * @model
     * @generated
     * @ordered
     */
    public static final int LOCK_VALUE = 3;

    /**
     * The '<em><b>POINTMACHINEMOUNTINGDEVICE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POINTMACHINEMOUNTINGDEVICE
     * @model
     * @generated
     * @ordered
     */
    public static final int POINTMACHINEMOUNTINGDEVICE_VALUE = 4;

    /**
     * The '<em><b>USERDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USERDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int USERDEFINED_VALUE = 5;

    /**
     * The '<em><b>SHOE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHOE
     * @model
     * @generated
     * @ordered
     */
    public static final int SHOE_VALUE = 6;

    /**
     * The '<em><b>EXPANSION JOINT DEVICE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXPANSION_JOINT_DEVICE
     * @model
     * @generated
     * @ordered
     */
    public static final int EXPANSION_JOINT_DEVICE_VALUE = 7;

    /**
     * The '<em><b>CABLEARRANGER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CABLEARRANGER
     * @model
     * @generated
     * @ordered
     */
    public static final int CABLEARRANGER_VALUE = 8;

    /**
     * The '<em><b>NOTDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTDEFINED_VALUE = 9;

    /**
     * The '<em><b>RAILPAD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAILPAD
     * @model
     * @generated
     * @ordered
     */
    public static final int RAILPAD_VALUE = 10;

    /**
     * The '<em><b>BRACKET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BRACKET
     * @model
     * @generated
     * @ordered
     */
    public static final int BRACKET_VALUE = 11;

    /**
     * The '<em><b>TENSIONINGEQUIPMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TENSIONINGEQUIPMENT
     * @model
     * @generated
     * @ordered
     */
    public static final int TENSIONINGEQUIPMENT_VALUE = 12;

    /**
     * The '<em><b>POINT MACHINE LOCKING DEVICE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POINT_MACHINE_LOCKING_DEVICE
     * @model
     * @generated
     * @ordered
     */
    public static final int POINT_MACHINE_LOCKING_DEVICE_VALUE = 13;

    /**
     * The '<em><b>ANCHORPLATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ANCHORPLATE
     * @model
     * @generated
     * @ordered
     */
    public static final int ANCHORPLATE_VALUE = 14;

    /**
     * The '<em><b>RAIL LUBRICATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAIL_LUBRICATION
     * @model
     * @generated
     * @ordered
     */
    public static final int RAIL_LUBRICATION_VALUE = 15;

    /**
     * The '<em><b>RAILBRACE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAILBRACE
     * @model
     * @generated
     * @ordered
     */
    public static final int RAILBRACE_VALUE = 16;

    /**
     * The '<em><b>SOUNDABSORPTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOUNDABSORPTION
     * @model
     * @generated
     * @ordered
     */
    public static final int SOUNDABSORPTION_VALUE = 17;

    /**
     * The '<em><b>PANEL STRENGTHENING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PANEL_STRENGTHENING
     * @model
     * @generated
     * @ordered
     */
    public static final int PANEL_STRENGTHENING_VALUE = 18;

    /**
     * The '<em><b>ELASTIC CUSHION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELASTIC_CUSHION
     * @model
     * @generated
     * @ordered
     */
    public static final int ELASTIC_CUSHION_VALUE = 19;

    /**
     * The '<em><b>BIRDPROTECTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BIRDPROTECTION
     * @model
     * @generated
     * @ordered
     */
    public static final int BIRDPROTECTION_VALUE = 20;

    /**
     * The '<em><b>RAIL MECHANICAL EQUIPMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAIL_MECHANICAL_EQUIPMENT
     * @model
     * @generated
     * @ordered
     */
    public static final int RAIL_MECHANICAL_EQUIPMENT_VALUE = 21;

    /**
     * An array of all the '<em><b>Ifc Discrete Accessory Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcDiscreteAccessoryTypeEnum[] VALUES_ARRAY = new IfcDiscreteAccessoryTypeEnum[] { NULL,
            INSULATOR, SLIDINGCHAIR, LOCK, POINTMACHINEMOUNTINGDEVICE, USERDEFINED, SHOE, EXPANSION_JOINT_DEVICE,
            CABLEARRANGER, NOTDEFINED, RAILPAD, BRACKET, TENSIONINGEQUIPMENT, POINT_MACHINE_LOCKING_DEVICE, ANCHORPLATE,
            RAIL_LUBRICATION, RAILBRACE, SOUNDABSORPTION, PANEL_STRENGTHENING, ELASTIC_CUSHION, BIRDPROTECTION,
            RAIL_MECHANICAL_EQUIPMENT, };

    /**
     * A public read-only list of all the '<em><b>Ifc Discrete Accessory Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcDiscreteAccessoryTypeEnum> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Discrete Accessory Type Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDiscreteAccessoryTypeEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcDiscreteAccessoryTypeEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Discrete Accessory Type Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDiscreteAccessoryTypeEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcDiscreteAccessoryTypeEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Discrete Accessory Type Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcDiscreteAccessoryTypeEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case INSULATOR_VALUE:
            return INSULATOR;
        case SLIDINGCHAIR_VALUE:
            return SLIDINGCHAIR;
        case LOCK_VALUE:
            return LOCK;
        case POINTMACHINEMOUNTINGDEVICE_VALUE:
            return POINTMACHINEMOUNTINGDEVICE;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case SHOE_VALUE:
            return SHOE;
        case EXPANSION_JOINT_DEVICE_VALUE:
            return EXPANSION_JOINT_DEVICE;
        case CABLEARRANGER_VALUE:
            return CABLEARRANGER;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case RAILPAD_VALUE:
            return RAILPAD;
        case BRACKET_VALUE:
            return BRACKET;
        case TENSIONINGEQUIPMENT_VALUE:
            return TENSIONINGEQUIPMENT;
        case POINT_MACHINE_LOCKING_DEVICE_VALUE:
            return POINT_MACHINE_LOCKING_DEVICE;
        case ANCHORPLATE_VALUE:
            return ANCHORPLATE;
        case RAIL_LUBRICATION_VALUE:
            return RAIL_LUBRICATION;
        case RAILBRACE_VALUE:
            return RAILBRACE;
        case SOUNDABSORPTION_VALUE:
            return SOUNDABSORPTION;
        case PANEL_STRENGTHENING_VALUE:
            return PANEL_STRENGTHENING;
        case ELASTIC_CUSHION_VALUE:
            return ELASTIC_CUSHION;
        case BIRDPROTECTION_VALUE:
            return BIRDPROTECTION;
        case RAIL_MECHANICAL_EQUIPMENT_VALUE:
            return RAIL_MECHANICAL_EQUIPMENT;
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
    private IfcDiscreteAccessoryTypeEnum(int value, String name, String literal) {
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

} //IfcDiscreteAccessoryTypeEnum
