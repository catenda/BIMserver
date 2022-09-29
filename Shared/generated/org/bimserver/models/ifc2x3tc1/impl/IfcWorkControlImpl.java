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
import org.bimserver.models.ifc2x3tc1.IfcDateTimeSelect;
import org.bimserver.models.ifc2x3tc1.IfcPerson;
import org.bimserver.models.ifc2x3tc1.IfcWorkControl;
import org.bimserver.models.ifc2x3tc1.IfcWorkControlTypeEnum;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getDurationAsString <em>Duration As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getTotalFloatAsString <em>Total Float As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWorkControlImpl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcWorkControlImpl extends IfcControlImpl implements IfcWorkControl {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcWorkControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIdentifier() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Identifier(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdentifier(String newIdentifier) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Identifier(), newIdentifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateTimeSelect getCreationDate() {
        return (IfcDateTimeSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_CreationDate(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreationDate(IfcDateTimeSelect newCreationDate) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_CreationDate(), newCreationDate);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<IfcPerson> getCreators() {
        return (EList<IfcPerson>) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Creators(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCreators() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Creators());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCreators() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Creators());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPurpose() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Purpose(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurpose(String newPurpose) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Purpose(), newPurpose);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurpose() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Purpose());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurpose() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Purpose());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getDuration() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Duration(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDuration(double newDuration) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Duration(), newDuration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDuration() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Duration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDuration() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Duration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDurationAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_DurationAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDurationAsString(String newDurationAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_DurationAsString(), newDurationAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDurationAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_DurationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDurationAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_DurationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getTotalFloat() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloat(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalFloat(double newTotalFloat) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloat(), newTotalFloat);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTotalFloat() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloat());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTotalFloat() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloat());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTotalFloatAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloatAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalFloatAsString(String newTotalFloatAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloatAsString(), newTotalFloatAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTotalFloatAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloatAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTotalFloatAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloatAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateTimeSelect getStartTime() {
        return (IfcDateTimeSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_StartTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartTime(IfcDateTimeSelect newStartTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_StartTime(), newStartTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcDateTimeSelect getFinishTime() {
        return (IfcDateTimeSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_FinishTime(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinishTime(IfcDateTimeSelect newFinishTime) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_FinishTime(), newFinishTime);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinishTime() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_FinishTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinishTime() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_FinishTime());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcWorkControlTypeEnum getWorkControlType() {
        return (IfcWorkControlTypeEnum) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_WorkControlType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWorkControlType(IfcWorkControlTypeEnum newWorkControlType) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_WorkControlType(), newWorkControlType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkControlType() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_WorkControlType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkControlType() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_WorkControlType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserDefinedControlType() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserDefinedControlType(String newUserDefinedControlType) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType(), newUserDefinedControlType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserDefinedControlType() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserDefinedControlType() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType());
    }

} //IfcWorkControlImpl
