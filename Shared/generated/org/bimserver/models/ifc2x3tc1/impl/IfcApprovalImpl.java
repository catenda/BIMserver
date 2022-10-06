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
import org.bimserver.models.ifc2x3tc1.IfcApproval;
import org.bimserver.models.ifc2x3tc1.IfcApprovalActorRelationship;
import org.bimserver.models.ifc2x3tc1.IfcApprovalRelationship;
import org.bimserver.models.ifc2x3tc1.IfcDateTimeSelect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcApprovalImpl extends IdEObjectImpl implements IfcApproval {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcApprovalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcApproval();
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
    public String getDescription() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Description(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription(String newDescription) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Description(), newDescription);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Description());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Description());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateTimeSelect getApprovalDateTime() {
        return (IfcDateTimeSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalDateTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApprovalDateTime(IfcDateTimeSelect newApprovalDateTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalDateTime(), newApprovalDateTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApprovalStatus() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalStatus(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApprovalStatus(String newApprovalStatus) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalStatus(), newApprovalStatus);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApprovalStatus() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalStatus());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApprovalStatus() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalStatus());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApprovalLevel() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalLevel(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApprovalLevel(String newApprovalLevel) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalLevel(), newApprovalLevel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApprovalLevel() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalLevel());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApprovalLevel() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalLevel());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApprovalQualifier() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalQualifier(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApprovalQualifier(String newApprovalQualifier) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalQualifier(), newApprovalQualifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApprovalQualifier() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalQualifier());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApprovalQualifier() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_ApprovalQualifier());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Name(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Name(), newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIdentifier() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Identifier(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdentifier(String newIdentifier) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Identifier(), newIdentifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcApprovalActorRelationship> getActors() {
        return (EList<IfcApprovalActorRelationship>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Actors(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActors() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Actors());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActors() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Actors());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcApprovalRelationship> getIsRelatedWith() {
        return (EList<IfcApprovalRelationship>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_IsRelatedWith(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsRelatedWith() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_IsRelatedWith());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsRelatedWith() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_IsRelatedWith());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcApprovalRelationship> getRelates() {
        return (EList<IfcApprovalRelationship>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Relates(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelates() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Relates());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelates() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcApproval_Relates());
    }

} //IfcApprovalImpl
