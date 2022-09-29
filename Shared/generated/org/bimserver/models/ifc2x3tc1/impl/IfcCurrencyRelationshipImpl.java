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
import org.bimserver.models.ifc2x3tc1.IfcCurrencyRelationship;
import org.bimserver.models.ifc2x3tc1.IfcDateAndTime;
import org.bimserver.models.ifc2x3tc1.IfcLibraryInformation;
import org.bimserver.models.ifc2x3tc1.IfcMonetaryUnit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getExchangeRateAsString <em>Exchange Rate As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcCurrencyRelationshipImpl extends IdEObjectImpl implements IfcCurrencyRelationship {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcCurrencyRelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship();
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
    public IfcMonetaryUnit getRelatingMonetaryUnit() {
        return (IfcMonetaryUnit) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelatingMonetaryUnit(IfcMonetaryUnit newRelatingMonetaryUnit) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(), newRelatingMonetaryUnit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcMonetaryUnit getRelatedMonetaryUnit() {
        return (IfcMonetaryUnit) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelatedMonetaryUnit(IfcMonetaryUnit newRelatedMonetaryUnit) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(), newRelatedMonetaryUnit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getExchangeRate() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExchangeRate(double newExchangeRate) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), newExchangeRate);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExchangeRateAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRateAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExchangeRateAsString(String newExchangeRateAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRateAsString(), newExchangeRateAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateAndTime getRateDateTime() {
        return (IfcDateAndTime) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRateDateTime(IfcDateAndTime newRateDateTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), newRateDateTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcLibraryInformation getRateSource() {
        return (IfcLibraryInformation) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRateSource(IfcLibraryInformation newRateSource) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), newRateSource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRateSource() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateSource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRateSource() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship_RateSource());
    }

} //IfcCurrencyRelationshipImpl
