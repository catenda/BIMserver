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
import org.bimserver.models.ifc4x3rc4.IfcSine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getSineTerm <em>Sine Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getSineTermAsString <em>Sine Term As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getLinearTerm <em>Linear Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getLinearTermAsString <em>Linear Term As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getConstantTerm <em>Constant Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcSineImpl#getConstantTermAsString <em>Constant Term As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSineImpl extends IfcSpiralImpl implements IfcSine {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcSineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcSine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSineTerm() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_SineTerm(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSineTerm(double newSineTerm) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_SineTerm(), newSineTerm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSineTermAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_SineTermAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSineTermAsString(String newSineTermAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_SineTermAsString(), newSineTermAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLinearTerm() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTerm(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearTerm(double newLinearTerm) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTerm(), newLinearTerm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearTerm() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearTerm() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLinearTermAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTermAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLinearTermAsString(String newLinearTermAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTermAsString(), newLinearTermAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLinearTermAsString() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTermAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLinearTermAsString() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_LinearTermAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getConstantTerm() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTerm(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstantTerm(double newConstantTerm) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTerm(), newConstantTerm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConstantTerm() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstantTerm() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTerm());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConstantTermAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTermAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstantTermAsString(String newConstantTermAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTermAsString(), newConstantTermAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConstantTermAsString() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTermAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstantTermAsString() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcSine_ConstantTermAsString());
    }

} //IfcSineImpl
