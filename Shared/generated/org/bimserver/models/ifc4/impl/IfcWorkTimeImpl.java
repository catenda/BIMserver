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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcRecurrencePattern;
import org.bimserver.models.ifc4.IfcWorkTime;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Work Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcWorkTimeImpl#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcWorkTimeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcWorkTimeImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcWorkTimeImpl extends IfcSchedulingTimeImpl implements IfcWorkTime {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcWorkTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4Package.eINSTANCE.getIfcWorkTime();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcRecurrencePattern getRecurrencePattern() {
        return (IfcRecurrencePattern) eGet(Ifc4Package.eINSTANCE.getIfcWorkTime_RecurrencePattern(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecurrencePattern(IfcRecurrencePattern newRecurrencePattern) {
        eSet(Ifc4Package.eINSTANCE.getIfcWorkTime_RecurrencePattern(), newRecurrencePattern);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecurrencePattern() {
        eUnset(Ifc4Package.eINSTANCE.getIfcWorkTime_RecurrencePattern());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecurrencePattern() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcWorkTime_RecurrencePattern());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStart() {
        return (String) eGet(Ifc4Package.eINSTANCE.getIfcWorkTime_Start(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStart(String newStart) {
        eSet(Ifc4Package.eINSTANCE.getIfcWorkTime_Start(), newStart);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStart() {
        eUnset(Ifc4Package.eINSTANCE.getIfcWorkTime_Start());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStart() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcWorkTime_Start());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFinish() {
        return (String) eGet(Ifc4Package.eINSTANCE.getIfcWorkTime_Finish(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinish(String newFinish) {
        eSet(Ifc4Package.eINSTANCE.getIfcWorkTime_Finish(), newFinish);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinish() {
        eUnset(Ifc4Package.eINSTANCE.getIfcWorkTime_Finish());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinish() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcWorkTime_Finish());
    }

} //IfcWorkTimeImpl
