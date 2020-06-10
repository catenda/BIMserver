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
import org.bimserver.models.ifc2x3tc1.IfcPostalAddress;
import org.bimserver.models.ifc2x3tc1.IfcSite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getRefElevationAsString <em>Ref Elevation As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSiteImpl#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSiteImpl extends IfcSpatialStructureElementImpl implements IfcSite {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcSiteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.Literals.IFC_SITE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Long> getRefLatitude() {
        return (EList<Long>) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LATITUDE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefLatitude() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LATITUDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefLatitude() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LATITUDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Long> getRefLongitude() {
        return (EList<Long>) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LONGITUDE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefLongitude() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LONGITUDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefLongitude() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_LONGITUDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRefElevation() {
        return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefElevation(double newRefElevation) {
        eSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION, newRefElevation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefElevation() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefElevation() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRefElevationAsString() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION_AS_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefElevationAsString(String newRefElevationAsString) {
        eSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION_AS_STRING, newRefElevationAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefElevationAsString() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION_AS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefElevationAsString() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__REF_ELEVATION_AS_STRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLandTitleNumber() {
        return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__LAND_TITLE_NUMBER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLandTitleNumber(String newLandTitleNumber) {
        eSet(Ifc2x3tc1Package.Literals.IFC_SITE__LAND_TITLE_NUMBER, newLandTitleNumber);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLandTitleNumber() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__LAND_TITLE_NUMBER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLandTitleNumber() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__LAND_TITLE_NUMBER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcPostalAddress getSiteAddress() {
        return (IfcPostalAddress) eGet(Ifc2x3tc1Package.Literals.IFC_SITE__SITE_ADDRESS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSiteAddress(IfcPostalAddress newSiteAddress) {
        eSet(Ifc2x3tc1Package.Literals.IFC_SITE__SITE_ADDRESS, newSiteAddress);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSiteAddress() {
        eUnset(Ifc2x3tc1Package.Literals.IFC_SITE__SITE_ADDRESS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSiteAddress() {
        return eIsSet(Ifc2x3tc1Package.Literals.IFC_SITE__SITE_ADDRESS);
    }

} //IfcSiteImpl
