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
import org.bimserver.models.ifc4x3rc4.IfcFacilityPart;
import org.bimserver.models.ifc4x3rc4.IfcFacilityPartTypeSelect;
import org.bimserver.models.ifc4x3rc4.IfcFacilityUsageEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Facility Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcFacilityPartImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcFacilityPartImpl#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcFacilityPartImpl extends IfcSpatialStructureElementImpl implements IfcFacilityPart {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcFacilityPartImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcFacilityPart();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcFacilityPartTypeSelect getPredefinedType() {
        return (IfcFacilityPartTypeSelect) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcFacilityPart_PredefinedType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredefinedType(IfcFacilityPartTypeSelect newPredefinedType) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcFacilityPart_PredefinedType(), newPredefinedType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcFacilityUsageEnum getUsageType() {
        return (IfcFacilityUsageEnum) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcFacilityPart_UsageType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsageType(IfcFacilityUsageEnum newUsageType) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcFacilityPart_UsageType(), newUsageType);
    }

} //IfcFacilityPartImpl
