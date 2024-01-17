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
package org.bimserver.models.ifc4x3add2.impl;

import org.bimserver.models.ifc4x3add2.Ifc4x3add2Package;
import org.bimserver.models.ifc4x3add2.IfcObjectDefinition;
import org.bimserver.models.ifc4x3add2.IfcRelAssigns;
import org.bimserver.models.ifc4x3add2.Tristate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelAssignsImpl#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelAssignsImpl#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcRelAssignsImpl extends IfcRelationshipImpl implements IfcRelAssigns {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcRelAssignsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcObjectDefinition> getRelatedObjects() {
        return (EList<IfcObjectDefinition>) eGet(Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns_RelatedObjects(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getRelatedObjectsType() {
        return (Tristate) eGet(Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelatedObjectsType(Tristate newRelatedObjectsType) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType(), newRelatedObjectsType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelatedObjectsType() {
        eUnset(Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelatedObjectsType() {
        return eIsSet(Ifc4x3add2Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType());
    }

} //IfcRelAssignsImpl
