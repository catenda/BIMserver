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
import org.bimserver.models.ifc2x3tc1.IfcBoundaryFaceCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaXAsString <em>Linear Stiffness By Area XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaYAsString <em>Linear Stiffness By Area YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZAsString <em>Linear Stiffness By Area ZAs String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcBoundaryFaceConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryFaceCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcBoundaryFaceConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByAreaX() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaX(double newLinearStiffnessByAreaX) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(),
                newLinearStiffnessByAreaX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaX() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaX() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByAreaXAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaXAsString(String newLinearStiffnessByAreaXAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString(),
                newLinearStiffnessByAreaXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaXAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaXAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByAreaY() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaY(double newLinearStiffnessByAreaY) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(),
                newLinearStiffnessByAreaY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaY() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaY() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByAreaYAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaYAsString(String newLinearStiffnessByAreaYAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString(),
                newLinearStiffnessByAreaYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaYAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaYAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearStiffnessByAreaZ() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaZ(double newLinearStiffnessByAreaZ) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(),
                newLinearStiffnessByAreaZ);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaZ() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaZ() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearStiffnessByAreaZAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearStiffnessByAreaZAsString(String newLinearStiffnessByAreaZAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString(),
                newLinearStiffnessByAreaZAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearStiffnessByAreaZAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearStiffnessByAreaZAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString());
    }

} //IfcBoundaryFaceConditionImpl
