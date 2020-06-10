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
import org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessXAsString <em>Linear Stiffness XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessYAsString <em>Linear Stiffness YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZAsString <em>Linear Stiffness ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessXAsString <em>Rotational Stiffness XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessYAsString <em>Rotational Stiffness YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZAsString <em>Rotational Stiffness ZAs String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryNodeCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcBoundaryNodeConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessX() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessX(double newLinearStiffnessX) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X, newLinearStiffnessX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessX() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessX() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessXAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessXAsString(String newLinearStiffnessXAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING,
                newLinearStiffnessXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessXAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessXAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessY() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessY(double newLinearStiffnessY) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y, newLinearStiffnessY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessY() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessY() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessYAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessYAsString(String newLinearStiffnessYAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING,
                newLinearStiffnessYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessYAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessYAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessZ() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessZ(double newLinearStiffnessZ) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z, newLinearStiffnessZ);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessZ() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessZ() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessZAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessZAsString(String newLinearStiffnessZAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING,
                newLinearStiffnessZAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessZAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessZAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessX() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessX(double newRotationalStiffnessX) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X, newRotationalStiffnessX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessX() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessX() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessXAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessXAsString(String newRotationalStiffnessXAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING,
                newRotationalStiffnessXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessXAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessXAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessY() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessY(double newRotationalStiffnessY) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y, newRotationalStiffnessY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessY() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessY() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessYAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessYAsString(String newRotationalStiffnessYAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING,
                newRotationalStiffnessYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessYAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessYAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessZ() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessZ(double newRotationalStiffnessZ) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z, newRotationalStiffnessZ);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessZ() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessZ() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessZAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessZAsString(String newRotationalStiffnessZAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING,
                newRotationalStiffnessZAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessZAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessZAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING);
    }

} //IfcBoundaryNodeConditionImpl
