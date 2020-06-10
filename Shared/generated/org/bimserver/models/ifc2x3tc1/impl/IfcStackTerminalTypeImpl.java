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
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStackTerminalType;
import org.bimserver.models.ifc2x3tc1.IfcStackTerminalTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Stack Terminal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStackTerminalTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcStackTerminalTypeImpl extends IfcFlowTerminalTypeImpl implements IfcStackTerminalType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcStackTerminalTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.Literals.IFC_STACK_TERMINAL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcStackTerminalTypeEnum getPredefinedType() {
        return (IfcStackTerminalTypeEnum) eGet(Ifc2x3tc1Package.Literals.IFC_STACK_TERMINAL_TYPE__PREDEFINED_TYPE,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredefinedType(IfcStackTerminalTypeEnum newPredefinedType) {
        eSet(Ifc2x3tc1Package.Literals.IFC_STACK_TERMINAL_TYPE__PREDEFINED_TYPE, newPredefinedType);
    }

} //IfcStackTerminalTypeImpl
