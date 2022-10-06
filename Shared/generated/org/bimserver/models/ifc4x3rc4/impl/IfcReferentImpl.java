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
import org.bimserver.models.ifc4x3rc4.IfcReferent;
import org.bimserver.models.ifc4x3rc4.IfcReferentTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Referent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcReferentImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcReferentImpl#getRestartDistance <em>Restart Distance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcReferentImpl#getRestartDistanceAsString <em>Restart Distance As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcReferentImpl extends IfcPositioningElementImpl implements IfcReferent {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcReferentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcReferent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcReferentTypeEnum getPredefinedType() {
        return (IfcReferentTypeEnum) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_PredefinedType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredefinedType(IfcReferentTypeEnum newPredefinedType) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_PredefinedType(), newPredefinedType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredefinedType() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_PredefinedType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredefinedType() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_PredefinedType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRestartDistance() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistance(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRestartDistance(double newRestartDistance) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistance(), newRestartDistance);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRestartDistance() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRestartDistance() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRestartDistanceAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistanceAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRestartDistanceAsString(String newRestartDistanceAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistanceAsString(), newRestartDistanceAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRestartDistanceAsString() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRestartDistanceAsString() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcReferent_RestartDistanceAsString());
    }

} //IfcReferentImpl
