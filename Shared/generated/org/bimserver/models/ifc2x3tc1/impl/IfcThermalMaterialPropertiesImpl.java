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
import org.bimserver.models.ifc2x3tc1.IfcThermalMaterialProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacityAsString <em>Specific Heat Capacity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getBoilingPointAsString <em>Boiling Point As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getFreezingPointAsString <em>Freezing Point As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivityAsString <em>Thermal Conductivity As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcThermalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl
        implements IfcThermalMaterialProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcThermalMaterialPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSpecificHeatCapacity() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecificHeatCapacity(double newSpecificHeatCapacity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(),
                newSpecificHeatCapacity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecificHeatCapacity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecificHeatCapacity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpecificHeatCapacityAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacityAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecificHeatCapacityAsString(String newSpecificHeatCapacityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacityAsString(),
                newSpecificHeatCapacityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecificHeatCapacityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecificHeatCapacityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBoilingPoint() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoilingPoint(double newBoilingPoint) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), newBoilingPoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoilingPoint() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoilingPoint() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBoilingPointAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPointAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoilingPointAsString(String newBoilingPointAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPointAsString(),
                newBoilingPointAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoilingPointAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPointAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoilingPointAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPointAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getFreezingPoint() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFreezingPoint(double newFreezingPoint) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), newFreezingPoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFreezingPoint() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFreezingPoint() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFreezingPointAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPointAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFreezingPointAsString(String newFreezingPointAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPointAsString(),
                newFreezingPointAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFreezingPointAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPointAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFreezingPointAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPointAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getThermalConductivity() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalConductivity(double newThermalConductivity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), newThermalConductivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalConductivity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalConductivity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getThermalConductivityAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivityAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalConductivityAsString(String newThermalConductivityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivityAsString(),
                newThermalConductivityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalConductivityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalConductivityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivityAsString());
    }

} //IfcThermalMaterialPropertiesImpl
