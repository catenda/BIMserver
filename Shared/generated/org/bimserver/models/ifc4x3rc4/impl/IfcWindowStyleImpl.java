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
package org.bimserver.models.ifc4x3rc4.impl;

import org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package;
import org.bimserver.models.ifc4x3rc4.IfcWindowStyle;
import org.bimserver.models.ifc4x3rc4.IfcWindowStyleConstructionEnum;
import org.bimserver.models.ifc4x3rc4.IfcWindowStyleOperationEnum;
import org.bimserver.models.ifc4x3rc4.Tristate;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcWindowStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcWindowStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcWindowStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcWindowStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcWindowStyleImpl extends IfcTypeProductImpl implements IfcWindowStyle {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcWindowStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcWindowStyleConstructionEnum getConstructionType() {
        return (IfcWindowStyleConstructionEnum) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_ConstructionType(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstructionType(IfcWindowStyleConstructionEnum newConstructionType) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_ConstructionType(), newConstructionType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcWindowStyleOperationEnum getOperationType() {
        return (IfcWindowStyleOperationEnum) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_OperationType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationType(IfcWindowStyleOperationEnum newOperationType) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_OperationType(), newOperationType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getParameterTakesPrecedence() {
        return (Tristate) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameterTakesPrecedence(Tristate newParameterTakesPrecedence) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence(), newParameterTakesPrecedence);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getSizeable() {
        return (Tristate) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_Sizeable(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSizeable(Tristate newSizeable) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcWindowStyle_Sizeable(), newSizeable);
    }

} //IfcWindowStyleImpl
