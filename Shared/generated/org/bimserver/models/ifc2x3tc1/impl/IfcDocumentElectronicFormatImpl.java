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
import org.bimserver.models.ifc2x3tc1.IfcDocumentElectronicFormat;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcDocumentElectronicFormatImpl extends IdEObjectImpl implements IfcDocumentElectronicFormat {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcDocumentElectronicFormatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat();
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
    public String getFileExtension() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFileExtension(String newFileExtension) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), newFileExtension);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFileExtension() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFileExtension() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMimeContentType() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMimeContentType(String newMimeContentType) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), newMimeContentType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMimeContentType() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMimeContentType() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMimeSubtype() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMimeSubtype(String newMimeSubtype) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), newMimeSubtype);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMimeSubtype() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMimeSubtype() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
    }

} //IfcDocumentElectronicFormatImpl
