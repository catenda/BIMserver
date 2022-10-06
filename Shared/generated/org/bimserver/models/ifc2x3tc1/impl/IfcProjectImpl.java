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
import org.bimserver.models.ifc2x3tc1.IfcProject;
import org.bimserver.models.ifc2x3tc1.IfcRepresentationContext;
import org.bimserver.models.ifc2x3tc1.IfcUnitAssignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProjectImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProjectImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProjectImpl#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProjectImpl#getUnitsInContext <em>Units In Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcProjectImpl extends IfcObjectImpl implements IfcProject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcProjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcProject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLongName() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_LongName(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLongName(String newLongName) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_LongName(), newLongName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLongName() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcProject_LongName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLongName() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_LongName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPhase() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_Phase(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase(String newPhase) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_Phase(), newPhase);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcProject_Phase());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_Phase());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcRepresentationContext> getRepresentationContexts() {
        return (EList<IfcRepresentationContext>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_RepresentationContexts(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcUnitAssignment getUnitsInContext() {
        return (IfcUnitAssignment) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_UnitsInContext(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitsInContext(IfcUnitAssignment newUnitsInContext) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcProject_UnitsInContext(), newUnitsInContext);
    }

} //IfcProjectImpl
