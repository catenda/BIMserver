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
import org.bimserver.models.ifc2x3tc1.IfcCoordinatedUniversalTimeOffset;
import org.bimserver.models.ifc2x3tc1.IfcLocalTime;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getSecondComponentAsString <em>Second Component As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLocalTimeImpl#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcLocalTimeImpl extends IdEObjectImpl implements IfcLocalTime {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcLocalTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime();
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
    public long getHourComponent() {
        return (Long) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_HourComponent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHourComponent(long newHourComponent) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_HourComponent(), newHourComponent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getMinuteComponent() {
        return (Long) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_MinuteComponent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinuteComponent(long newMinuteComponent) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_MinuteComponent(), newMinuteComponent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinuteComponent() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_MinuteComponent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinuteComponent() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_MinuteComponent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSecondComponent() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondComponent(double newSecondComponent) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponent(), newSecondComponent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondComponent() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondComponent() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSecondComponentAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponentAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondComponentAsString(String newSecondComponentAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponentAsString(), newSecondComponentAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondComponentAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponentAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondComponentAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_SecondComponentAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcCoordinatedUniversalTimeOffset getZone() {
        return (IfcCoordinatedUniversalTimeOffset) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_Zone(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZone(IfcCoordinatedUniversalTimeOffset newZone) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_Zone(), newZone);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZone() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_Zone());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZone() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_Zone());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getDaylightSavingOffset() {
        return (Long) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDaylightSavingOffset(long newDaylightSavingOffset) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset(), newDaylightSavingOffset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDaylightSavingOffset() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDaylightSavingOffset() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset());
    }

} //IfcLocalTimeImpl
