/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcDocumentElectronicFormat;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDocumentElectronicFormatImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDocumentElectronicFormatImpl#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDocumentElectronicFormatImpl#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 * </p>
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
		return Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat();
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
	public String getFileExtension() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(String newFileExtension) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), newFileExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileExtension() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileExtension() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeContentType() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeContentType(String newMimeContentType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), newMimeContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeContentType() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeContentType() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeSubtype() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeSubtype(String newMimeSubtype) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), newMimeSubtype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeSubtype() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeSubtype() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
	}

} //IfcDocumentElectronicFormatImpl