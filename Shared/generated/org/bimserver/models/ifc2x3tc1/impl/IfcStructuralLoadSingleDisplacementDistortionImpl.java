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
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacementDistortion;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement Distortion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementDistortionImpl#getDistortion <em>Distortion</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementDistortionImpl#getDistortionAsString <em>Distortion As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementDistortionImpl extends IfcStructuralLoadSingleDisplacementImpl
        implements IfcStructuralLoadSingleDisplacementDistortion {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcStructuralLoadSingleDisplacementDistortionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getDistortion() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistortion(double newDistortion) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion(), newDistortion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistortion() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistortion() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDistortionAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_DistortionAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistortionAsString(String newDistortionAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_DistortionAsString(),
                newDistortionAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistortionAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_DistortionAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistortionAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_DistortionAsString());
    }

} //IfcStructuralLoadSingleDisplacementDistortionImpl
