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
import org.bimserver.models.ifc2x3tc1.IfcBoundaryEdgeCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthXAsString <em>Linear Stiffness By Length XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthYAsString <em>Linear Stiffness By Length YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZAsString <em>Linear Stiffness By Length ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthXAsString <em>Rotational Stiffness By Length XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthYAsString <em>Rotational Stiffness By Length YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZAsString <em>Rotational Stiffness By Length ZAs String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcBoundaryEdgeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryEdgeCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcBoundaryEdgeConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByLengthX() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthX(double newLinearStiffnessByLengthX) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(),
                newLinearStiffnessByLengthX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthX() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthX() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByLengthXAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthXAsString(String newLinearStiffnessByLengthXAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString(),
                newLinearStiffnessByLengthXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthXAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthXAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByLengthY() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthY(double newLinearStiffnessByLengthY) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(),
                newLinearStiffnessByLengthY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthY() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthY() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByLengthYAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthYAsString(String newLinearStiffnessByLengthYAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString(),
                newLinearStiffnessByLengthYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthYAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthYAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByLengthZ() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthZ(double newLinearStiffnessByLengthZ) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(),
                newLinearStiffnessByLengthZ);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthZ() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthZ() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByLengthZAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByLengthZAsString(String newLinearStiffnessByLengthZAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString(),
                newLinearStiffnessByLengthZAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByLengthZAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByLengthZAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessByLengthX() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthX(double newRotationalStiffnessByLengthX) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(),
                newRotationalStiffnessByLengthX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthX() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthX() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessByLengthXAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthXAsString(String newRotationalStiffnessByLengthXAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString(),
                newRotationalStiffnessByLengthXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthXAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthXAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessByLengthY() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthY(double newRotationalStiffnessByLengthY) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(),
                newRotationalStiffnessByLengthY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthY() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthY() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessByLengthYAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthYAsString(String newRotationalStiffnessByLengthYAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString(),
                newRotationalStiffnessByLengthYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthYAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthYAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRotationalStiffnessByLengthZ() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthZ(double newRotationalStiffnessByLengthZ) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(),
                newRotationalStiffnessByLengthZ);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthZ() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthZ() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRotationalStiffnessByLengthZAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotationalStiffnessByLengthZAsString(String newRotationalStiffnessByLengthZAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString(),
                newRotationalStiffnessByLengthZAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotationalStiffnessByLengthZAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotationalStiffnessByLengthZAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString());
    }

} //IfcBoundaryEdgeConditionImpl
