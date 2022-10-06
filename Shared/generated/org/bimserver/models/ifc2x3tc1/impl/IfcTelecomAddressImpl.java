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
import org.bimserver.models.ifc2x3tc1.IfcTelecomAddress;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTelecomAddressImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTelecomAddressImpl#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTelecomAddressImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTelecomAddressImpl#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTelecomAddressImpl#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcTelecomAddressImpl extends IfcAddressImpl implements IfcTelecomAddress {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcTelecomAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getTelephoneNumbers() {
        return (EList<String>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTelephoneNumbers() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTelephoneNumbers() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getFacsimileNumbers() {
        return (EList<String>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFacsimileNumbers() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFacsimileNumbers() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPagerNumber() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPagerNumber(String newPagerNumber) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), newPagerNumber);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPagerNumber() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPagerNumber() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<String> getElectronicMailAddresses() {
        return (EList<String>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetElectronicMailAddresses() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicMailAddresses() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWWWHomePageURL() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWWWHomePageURL(String newWWWHomePageURL) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), newWWWHomePageURL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWWWHomePageURL() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWWWHomePageURL() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
    }

} //IfcTelecomAddressImpl
