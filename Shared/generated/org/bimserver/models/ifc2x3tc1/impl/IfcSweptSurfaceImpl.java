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
import org.bimserver.models.ifc2x3tc1.IfcAxis2Placement3D;
import org.bimserver.models.ifc2x3tc1.IfcProfileDef;
import org.bimserver.models.ifc2x3tc1.IfcSweptSurface;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSweptSurfaceImpl#getSweptCurve <em>Swept Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSweptSurfaceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSweptSurfaceImpl#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSweptSurfaceImpl extends IfcSurfaceImpl implements IfcSweptSurface {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcSweptSurfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcProfileDef getSweptCurve() {
        return (IfcProfileDef) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_SweptCurve(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSweptCurve(IfcProfileDef newSweptCurve) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_SweptCurve(), newSweptCurve);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcAxis2Placement3D getPosition() {
        return (IfcAxis2Placement3D) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Position(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosition(IfcAxis2Placement3D newPosition) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Position(), newPosition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getDim() {
        return (Long) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Dim(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDim(long newDim) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Dim(), newDim);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDim() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Dim());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDim() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSweptSurface_Dim());
    }

} //IfcSweptSurfaceImpl
