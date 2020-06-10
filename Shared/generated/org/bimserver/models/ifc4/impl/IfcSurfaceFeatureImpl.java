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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcSurfaceFeature;
import org.bimserver.models.ifc4.IfcSurfaceFeatureTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcSurfaceFeatureImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSurfaceFeatureImpl extends IfcFeatureElementImpl implements IfcSurfaceFeature {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcSurfaceFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4Package.Literals.IFC_SURFACE_FEATURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcSurfaceFeatureTypeEnum getPredefinedType() {
        return (IfcSurfaceFeatureTypeEnum) eGet(Ifc4Package.Literals.IFC_SURFACE_FEATURE__PREDEFINED_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredefinedType(IfcSurfaceFeatureTypeEnum newPredefinedType) {
        eSet(Ifc4Package.Literals.IFC_SURFACE_FEATURE__PREDEFINED_TYPE, newPredefinedType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredefinedType() {
        eUnset(Ifc4Package.Literals.IFC_SURFACE_FEATURE__PREDEFINED_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredefinedType() {
        return eIsSet(Ifc4Package.Literals.IFC_SURFACE_FEATURE__PREDEFINED_TYPE);
    }

} //IfcSurfaceFeatureImpl
