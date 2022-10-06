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
import org.bimserver.models.ifc2x3tc1.IfcShapeAspect;
import org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceMemberVarying;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThicknessAsString <em>Subsequent Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThickness <em>Varying Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessAsString <em>Varying Thickness As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcStructuralSurfaceMemberVaryingImpl extends IfcStructuralSurfaceMemberImpl
        implements IfcStructuralSurfaceMemberVarying {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcStructuralSurfaceMemberVaryingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Double> getSubsequentThickness() {
        return (EList<Double>) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_SubsequentThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getSubsequentThicknessAsString() {
        return (EList<String>) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcShapeAspect getVaryingThicknessLocation() {
        return (IfcShapeAspect) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaryingThicknessLocation(IfcShapeAspect newVaryingThicknessLocation) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation(),
                newVaryingThicknessLocation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getVaryingThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaryingThickness(double newVaryingThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThickness(), newVaryingThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaryingThickness() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaryingThickness() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVaryingThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaryingThicknessAsString(String newVaryingThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString(),
                newVaryingThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaryingThicknessAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaryingThicknessAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString());
    }

} //IfcStructuralSurfaceMemberVaryingImpl
