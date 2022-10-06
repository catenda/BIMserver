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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcCompositeCurve;
import org.bimserver.models.ifc4.IfcCompositeCurveSegment;
import org.bimserver.models.ifc4.IfcCurve;
import org.bimserver.models.ifc4.IfcTransitionCode;
import org.bimserver.models.ifc4.Tristate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCompositeCurveSegmentImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCompositeCurveSegmentImpl#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCompositeCurveSegmentImpl#getParentCurve <em>Parent Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCompositeCurveSegmentImpl#getUsingCurves <em>Using Curves</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCompositeCurveSegmentImpl#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcCompositeCurveSegmentImpl extends IfcGeometricRepresentationItemImpl
        implements IfcCompositeCurveSegment {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcCompositeCurveSegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcTransitionCode getTransition() {
        return (IfcTransitionCode) eGet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Transition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransition(IfcTransitionCode newTransition) {
        eSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Transition(), newTransition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getSameSense() {
        return (Tristate) eGet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSameSense(Tristate newSameSense) {
        eSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense(), newSameSense);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcCurve getParentCurve() {
        return (IfcCurve) eGet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_ParentCurve(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCurve(IfcCurve newParentCurve) {
        eSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_ParentCurve(), newParentCurve);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcCompositeCurve> getUsingCurves() {
        return (EList<IfcCompositeCurve>) eGet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_UsingCurves(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsingCurves() {
        eUnset(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_UsingCurves());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsingCurves() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_UsingCurves());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getDim() {
        return (Long) eGet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Dim(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDim(long newDim) {
        eSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Dim(), newDim);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDim() {
        eUnset(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Dim());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDim() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcCompositeCurveSegment_Dim());
    }

} //IfcCompositeCurveSegmentImpl
