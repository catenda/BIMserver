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
import org.bimserver.models.ifc4x3rc4.IfcOpenCrossProfileDef;
import org.bimserver.models.ifc4x3rc4.Tristate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Open Cross Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getHorizontalWidths <em>Horizontal Widths</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getWidths <em>Widths</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getWidthsAsString <em>Widths As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getSlopes <em>Slopes</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getSlopesAsString <em>Slopes As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.impl.IfcOpenCrossProfileDefImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcOpenCrossProfileDefImpl extends IfcProfileDefImpl implements IfcOpenCrossProfileDef {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcOpenCrossProfileDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getHorizontalWidths() {
        return (Tristate) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_HorizontalWidths(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHorizontalWidths(Tristate newHorizontalWidths) {
        eSet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_HorizontalWidths(), newHorizontalWidths);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Double> getWidths() {
        return (EList<Double>) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_Widths(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getWidthsAsString() {
        return (EList<String>) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_WidthsAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Double> getSlopes() {
        return (EList<Double>) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_Slopes(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getSlopesAsString() {
        return (EList<String>) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_SlopesAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getTags() {
        return (EList<String>) eGet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_Tags(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTags() {
        eUnset(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_Tags());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTags() {
        return eIsSet(Ifc4x3rc4Package.eINSTANCE.getIfcOpenCrossProfileDef_Tags());
    }

} //IfcOpenCrossProfileDefImpl
