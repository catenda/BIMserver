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

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcActorRole;
import org.bimserver.models.ifc2x3tc1.IfcActorSelect;
import org.bimserver.models.ifc2x3tc1.IfcApproval;
import org.bimserver.models.ifc2x3tc1.IfcApprovalActorRelationship;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getApproval <em>Approval</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcApprovalActorRelationshipImpl extends IdEObjectImpl implements IfcApprovalActorRelationship {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcApprovalActorRelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcActorSelect getActor() {
        return (IfcActorSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Actor(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActor(IfcActorSelect newActor) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Actor(), newActor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcApproval getApproval() {
        return (IfcApproval) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Approval(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApproval(IfcApproval newApproval) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Approval(), newApproval);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcActorRole getRole() {
        return (IfcActorRole) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Role(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRole(IfcActorRole newRole) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship_Role(), newRole);
    }

} //IfcApprovalActorRelationshipImpl
