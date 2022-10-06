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
import org.bimserver.models.ifc4x3rc4.IfcBoundedCurve;
import org.bimserver.models.ifc4x3rc4.IfcGradientCurve;
import org.bimserver.models.ifc4x3rc4.IfcPlacement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Gradient Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcGradientCurveImpl#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcGradientCurveImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcGradientCurveImpl#getRelativeElevation <em>Relative Elevation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcGradientCurveImpl#getRelativeElevationAsString <em>Relative Elevation As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcGradientCurveImpl extends IfcCompositeCurveImpl implements IfcGradientCurve {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcGradientCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcBoundedCurve getBaseCurve() {
        return (IfcBoundedCurve) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_BaseCurve(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseCurve(IfcBoundedCurve newBaseCurve) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_BaseCurve(), newBaseCurve);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcPlacement getEndPoint() {
        return (IfcPlacement) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_EndPoint(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndPoint(IfcPlacement newEndPoint) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_EndPoint(), newEndPoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndPoint() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_EndPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndPoint() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_EndPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRelativeElevation() {
        return (Double) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelativeElevation(double newRelativeElevation) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevation(), newRelativeElevation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelativeElevation() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevation());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelativeElevation() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevation());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRelativeElevationAsString() {
        return (String) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevationAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelativeElevationAsString(String newRelativeElevationAsString) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevationAsString(), newRelativeElevationAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelativeElevationAsString() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelativeElevationAsString() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcGradientCurve_RelativeElevationAsString());
    }

} //IfcGradientCurveImpl
