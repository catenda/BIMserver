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

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package;
import org.bimserver.models.ifc4x3rc4.IfcTransportElementNonFixedTypeEnum;
import org.bimserver.models.ifc4x3rc4.IfcTransportElementNonFixedTypeEnumEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element Non Fixed Type Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcTransportElementNonFixedTypeEnumImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcTransportElementNonFixedTypeEnumImpl extends IdEObjectImpl
        implements IfcTransportElementNonFixedTypeEnum {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcTransportElementNonFixedTypeEnumImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcTransportElementNonFixedTypeEnum();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcTransportElementNonFixedTypeEnumEnum getWrappedValue() {
        return (IfcTransportElementNonFixedTypeEnumEnum) eGet(
                Ifc4x3rc4Package.eINSTANCE.getIfcTransportElementNonFixedTypeEnum_WrappedValue(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWrappedValue(IfcTransportElementNonFixedTypeEnumEnum newWrappedValue) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcTransportElementNonFixedTypeEnum_WrappedValue(), newWrappedValue);
    }

} //IfcTransportElementNonFixedTypeEnumImpl
