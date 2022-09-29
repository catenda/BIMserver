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
import org.bimserver.models.ifc2x3tc1.IfcPropertySourceEnum;
import org.bimserver.models.ifc2x3tc1.IfcSpaceThermalLoadProperties;
import org.bimserver.models.ifc2x3tc1.IfcThermalLoadSourceEnum;
import org.bimserver.models.ifc2x3tc1.IfcThermalLoadTypeEnum;
import org.bimserver.models.ifc2x3tc1.IfcTimeSeries;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatioAsString <em>Applicable Value Ratio As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValueAsString <em>Maximum Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValueAsString <em>Minimum Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSpaceThermalLoadPropertiesImpl extends IfcPropertySetDefinitionImpl
        implements IfcSpaceThermalLoadProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcSpaceThermalLoadPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getApplicableValueRatio() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableValueRatio(double newApplicableValueRatio) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(),
                newApplicableValueRatio);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApplicableValueRatio() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApplicableValueRatio() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApplicableValueRatioAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableValueRatioAsString(String newApplicableValueRatioAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString(),
                newApplicableValueRatioAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApplicableValueRatioAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApplicableValueRatioAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcThermalLoadSourceEnum getThermalLoadSource() {
        return (IfcThermalLoadSourceEnum) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalLoadSource(IfcThermalLoadSourceEnum newThermalLoadSource) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), newThermalLoadSource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcPropertySourceEnum getPropertySource() {
        return (IfcPropertySourceEnum) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), newPropertySource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceDescription() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceDescription(String newSourceDescription) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), newSourceDescription);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSourceDescription() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSourceDescription() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMaximumValue() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumValue(double newMaximumValue) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), newMaximumValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMaximumValueAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValueAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumValueAsString(String newMaximumValueAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValueAsString(),
                newMaximumValueAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMinimumValue() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumValue(double newMinimumValue) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), newMinimumValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumValue() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumValue() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMinimumValueAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValueAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumValueAsString(String newMinimumValueAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValueAsString(),
                newMinimumValueAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumValueAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValueAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumValueAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValueAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcTimeSeries getThermalLoadTimeSeriesValues() {
        return (IfcTimeSeries) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalLoadTimeSeriesValues(IfcTimeSeries newThermalLoadTimeSeriesValues) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(),
                newThermalLoadTimeSeriesValues);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalLoadTimeSeriesValues() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalLoadTimeSeriesValues() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserDefinedThermalLoadSource() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserDefinedThermalLoadSource(String newUserDefinedThermalLoadSource) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(),
                newUserDefinedThermalLoadSource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserDefinedThermalLoadSource() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserDefinedThermalLoadSource() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserDefinedPropertySource() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserDefinedPropertySource(String newUserDefinedPropertySource) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(),
                newUserDefinedPropertySource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserDefinedPropertySource() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserDefinedPropertySource() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcThermalLoadTypeEnum getThermalLoadType() {
        return (IfcThermalLoadTypeEnum) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalLoadType(IfcThermalLoadTypeEnum newThermalLoadType) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), newThermalLoadType);
    }

} //IfcSpaceThermalLoadPropertiesImpl
