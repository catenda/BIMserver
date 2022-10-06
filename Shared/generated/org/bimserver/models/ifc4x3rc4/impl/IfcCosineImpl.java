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
import org.bimserver.models.ifc4x3rc4.IfcCosine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cosine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcCosineImpl#getCosineTerm <em>Cosine Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcCosineImpl#getCosineTermAsString <em>Cosine Term As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcCosineImpl#getConstantTerm <em>Constant Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcCosineImpl#getConstantTermAsString <em>Constant Term As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcCosineImpl extends IfcSpiralImpl implements IfcCosine {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcCosineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcCosine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCosineTerm() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_CosineTerm(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCosineTerm(double newCosineTerm) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_CosineTerm(), newCosineTerm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCosineTermAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_CosineTermAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCosineTermAsString(String newCosineTermAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_CosineTermAsString(), newCosineTermAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getConstantTerm() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTerm(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstantTerm(double newConstantTerm) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTerm(), newConstantTerm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConstantTerm() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstantTerm() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConstantTermAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTermAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstantTermAsString(String newConstantTermAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTermAsString(), newConstantTermAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConstantTermAsString() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTermAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstantTermAsString() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcCosine_ConstantTermAsString());
    }

} //IfcCosineImpl
