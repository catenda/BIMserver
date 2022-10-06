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
 * A representation of the literals of the enumeration '<em><b>Ifc Annotation Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcAnnotationTypeEnum()
 * @model
 * @generated
 */
public enum IfcAnnotationTypeEnum implements Enumerator {
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
     * The '<em><b>SUPERELEVATIONEVENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUPERELEVATIONEVENT_VALUE
     * @generated
     * @ordered
     */
    SUPERELEVATIONEVENT(1, "SUPERELEVATIONEVENT", "SUPERELEVATIONEVENT"),

    /**
     * The '<em><b>WIDTHEVENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIDTHEVENT_VALUE
     * @generated
     * @ordered
     */
    WIDTHEVENT(2, "WIDTHEVENT", "WIDTHEVENT"),

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
     * The '<em><b>ASBUILTLINE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTLINE_VALUE
     * @generated
     * @ordered
     */
    ASBUILTLINE(4, "ASBUILTLINE", "ASBUILTLINE"),

    /**
     * The '<em><b>NON PHYSICAL SIGNAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NON_PHYSICAL_SIGNAL_VALUE
     * @generated
     * @ordered
     */
    NON_PHYSICAL_SIGNAL(5, "NON_PHYSICAL_SIGNAL", "NON_PHYSICAL_SIGNAL"),

    /**
     * The '<em><b>ASSUMEDAREA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDAREA_VALUE
     * @generated
     * @ordered
     */
    ASSUMEDAREA(6, "ASSUMEDAREA", "ASSUMEDAREA"),

    /**
     * The '<em><b>ASBUILTAREA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTAREA_VALUE
     * @generated
     * @ordered
     */
    ASBUILTAREA(7, "ASBUILTAREA", "ASBUILTAREA"),

    /**
     * The '<em><b>ASSUMEDLINE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDLINE_VALUE
     * @generated
     * @ordered
     */
    ASSUMEDLINE(8, "ASSUMEDLINE", "ASSUMEDLINE"),

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
     * The '<em><b>ASBUILTPOINT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTPOINT_VALUE
     * @generated
     * @ordered
     */
    ASBUILTPOINT(10, "ASBUILTPOINT", "ASBUILTPOINT"),

    /**
     * The '<em><b>ASSUMEDPOINT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDPOINT_VALUE
     * @generated
     * @ordered
     */
    ASSUMEDPOINT(11, "ASSUMEDPOINT", "ASSUMEDPOINT");

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
     * The '<em><b>SUPERELEVATIONEVENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUPERELEVATIONEVENT
     * @model
     * @generated
     * @ordered
     */
    public static final int SUPERELEVATIONEVENT_VALUE = 1;

    /**
     * The '<em><b>WIDTHEVENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIDTHEVENT
     * @model
     * @generated
     * @ordered
     */
    public static final int WIDTHEVENT_VALUE = 2;

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
     * The '<em><b>ASBUILTLINE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTLINE
     * @model
     * @generated
     * @ordered
     */
    public static final int ASBUILTLINE_VALUE = 4;

    /**
     * The '<em><b>NON PHYSICAL SIGNAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NON_PHYSICAL_SIGNAL
     * @model
     * @generated
     * @ordered
     */
    public static final int NON_PHYSICAL_SIGNAL_VALUE = 5;

    /**
     * The '<em><b>ASSUMEDAREA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDAREA
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSUMEDAREA_VALUE = 6;

    /**
     * The '<em><b>ASBUILTAREA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTAREA
     * @model
     * @generated
     * @ordered
     */
    public static final int ASBUILTAREA_VALUE = 7;

    /**
     * The '<em><b>ASSUMEDLINE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDLINE
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSUMEDLINE_VALUE = 8;

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
     * The '<em><b>ASBUILTPOINT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBUILTPOINT
     * @model
     * @generated
     * @ordered
     */
    public static final int ASBUILTPOINT_VALUE = 10;

    /**
     * The '<em><b>ASSUMEDPOINT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSUMEDPOINT
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSUMEDPOINT_VALUE = 11;

    /**
     * An array of all the '<em><b>Ifc Annotation Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfcAnnotationTypeEnum[] VALUES_ARRAY = new IfcAnnotationTypeEnum[] { NULL, SUPERELEVATIONEVENT,
            WIDTHEVENT, NOTDEFINED, ASBUILTLINE, NON_PHYSICAL_SIGNAL, ASSUMEDAREA, ASBUILTAREA, ASSUMEDLINE,
            USERDEFINED, ASBUILTPOINT, ASSUMEDPOINT, };

    /**
     * A public read-only list of all the '<em><b>Ifc Annotation Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IfcAnnotationTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ifc Annotation Type Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcAnnotationTypeEnum get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcAnnotationTypeEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Annotation Type Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcAnnotationTypeEnum getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IfcAnnotationTypeEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifc Annotation Type Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfcAnnotationTypeEnum get(int value) {
        switch (value) {
        case NULL_VALUE:
            return NULL;
        case SUPERELEVATIONEVENT_VALUE:
            return SUPERELEVATIONEVENT;
        case WIDTHEVENT_VALUE:
            return WIDTHEVENT;
        case NOTDEFINED_VALUE:
            return NOTDEFINED;
        case ASBUILTLINE_VALUE:
            return ASBUILTLINE;
        case NON_PHYSICAL_SIGNAL_VALUE:
            return NON_PHYSICAL_SIGNAL;
        case ASSUMEDAREA_VALUE:
            return ASSUMEDAREA;
        case ASBUILTAREA_VALUE:
            return ASBUILTAREA;
        case ASSUMEDLINE_VALUE:
            return ASSUMEDLINE;
        case USERDEFINED_VALUE:
            return USERDEFINED;
        case ASBUILTPOINT_VALUE:
            return ASBUILTPOINT;
        case ASSUMEDPOINT_VALUE:
            return ASSUMEDPOINT;
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
    private IfcAnnotationTypeEnum(int value, String name, String literal) {
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

} //IfcAnnotationTypeEnum
