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
import org.bimserver.models.ifc2x3tc1.IfcActorSelect;
import org.bimserver.models.ifc2x3tc1.IfcCalendarDate;
import org.bimserver.models.ifc2x3tc1.IfcDateAndTime;
import org.bimserver.models.ifc2x3tc1.IfcDocumentConfidentialityEnum;
import org.bimserver.models.ifc2x3tc1.IfcDocumentElectronicFormat;
import org.bimserver.models.ifc2x3tc1.IfcDocumentInformation;
import org.bimserver.models.ifc2x3tc1.IfcDocumentInformationRelationship;
import org.bimserver.models.ifc2x3tc1.IfcDocumentReference;
import org.bimserver.models.ifc2x3tc1.IfcDocumentStatusEnum;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getIsPointedTo <em>Is Pointed To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentInformationImpl#getIsPointer <em>Is Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcDocumentInformationImpl extends IdEObjectImpl implements IfcDocumentInformation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcDocumentInformationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation();
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
    public String getDocumentId() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentId(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDocumentId(String newDocumentId) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentId(), newDocumentId);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Name(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Name(), newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Description(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription(String newDescription) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Description(), newDescription);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Description());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Description());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcDocumentReference> getDocumentReferences() {
        return (EList<IfcDocumentReference>) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentReferences(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDocumentReferences() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentReferences());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDocumentReferences() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentReferences());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPurpose() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Purpose(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurpose(String newPurpose) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Purpose(), newPurpose);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurpose() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Purpose());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurpose() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Purpose());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIntendedUse() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IntendedUse(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntendedUse(String newIntendedUse) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IntendedUse(), newIntendedUse);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntendedUse() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IntendedUse());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntendedUse() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IntendedUse());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getScope() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Scope(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScope(String newScope) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Scope(), newScope);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScope() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Scope());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScope() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Scope());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevision() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Revision(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision(String newRevision) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Revision(), newRevision);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Revision());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Revision());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcActorSelect getDocumentOwner() {
        return (IfcActorSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDocumentOwner(IfcActorSelect newDocumentOwner) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner(), newDocumentOwner);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDocumentOwner() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDocumentOwner() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcActorSelect> getEditors() {
        return (EList<IfcActorSelect>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Editors(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEditors() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Editors());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEditors() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Editors());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateAndTime getCreationTime() {
        return (IfcDateAndTime) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_CreationTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreationTime(IfcDateAndTime newCreationTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_CreationTime(), newCreationTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCreationTime() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_CreationTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCreationTime() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_CreationTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateAndTime getLastRevisionTime() {
        return (IfcDateAndTime) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLastRevisionTime(IfcDateAndTime newLastRevisionTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime(), newLastRevisionTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLastRevisionTime() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastRevisionTime() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDocumentElectronicFormat getElectronicFormat() {
        return (IfcDocumentElectronicFormat) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElectronicFormat(IfcDocumentElectronicFormat newElectronicFormat) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat(), newElectronicFormat);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetElectronicFormat() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicFormat() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcCalendarDate getValidFrom() {
        return (IfcCalendarDate) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidFrom(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValidFrom(IfcCalendarDate newValidFrom) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidFrom(), newValidFrom);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValidFrom() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidFrom());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValidFrom() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidFrom());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcCalendarDate getValidUntil() {
        return (IfcCalendarDate) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidUntil(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValidUntil(IfcCalendarDate newValidUntil) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidUntil(), newValidUntil);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValidUntil() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidUntil());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValidUntil() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidUntil());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDocumentConfidentialityEnum getConfidentiality() {
        return (IfcDocumentConfidentialityEnum) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Confidentiality(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfidentiality(IfcDocumentConfidentialityEnum newConfidentiality) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Confidentiality(), newConfidentiality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfidentiality() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Confidentiality());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfidentiality() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Confidentiality());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDocumentStatusEnum getStatus() {
        return (IfcDocumentStatusEnum) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Status(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatus(IfcDocumentStatusEnum newStatus) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Status(), newStatus);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatus() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Status());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Status());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcDocumentInformationRelationship> getIsPointedTo() {
        return (EList<IfcDocumentInformationRelationship>) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointedTo(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPointedTo() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointedTo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPointedTo() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointedTo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcDocumentInformationRelationship> getIsPointer() {
        return (EList<IfcDocumentInformationRelationship>) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointer(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPointer() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointer());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPointer() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointer());
    }

} //IfcDocumentInformationImpl
