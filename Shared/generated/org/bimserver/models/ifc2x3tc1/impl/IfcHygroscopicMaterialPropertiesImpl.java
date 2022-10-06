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
import org.bimserver.models.ifc2x3tc1.IfcHygroscopicMaterialProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcHygroscopicMaterialPropertiesImpl extends IfcMaterialPropertiesImpl
        implements IfcHygroscopicMaterialProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcHygroscopicMaterialPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getUpperVaporResistanceFactor() {
        return (Double) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpperVaporResistanceFactor(double newUpperVaporResistanceFactor) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(),
                newUpperVaporResistanceFactor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpperVaporResistanceFactor() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpperVaporResistanceFactor() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUpperVaporResistanceFactorAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpperVaporResistanceFactorAsString(String newUpperVaporResistanceFactorAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString(),
                newUpperVaporResistanceFactorAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpperVaporResistanceFactorAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpperVaporResistanceFactorAsString() {
        return eIsSet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLowerVaporResistanceFactor() {
        return (Double) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowerVaporResistanceFactor(double newLowerVaporResistanceFactor) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(),
                newLowerVaporResistanceFactor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowerVaporResistanceFactor() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowerVaporResistanceFactor() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLowerVaporResistanceFactorAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowerVaporResistanceFactorAsString(String newLowerVaporResistanceFactorAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString(),
                newLowerVaporResistanceFactorAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowerVaporResistanceFactorAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowerVaporResistanceFactorAsString() {
        return eIsSet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getIsothermalMoistureCapacity() {
        return (Double) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsothermalMoistureCapacity(double newIsothermalMoistureCapacity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(),
                newIsothermalMoistureCapacity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsothermalMoistureCapacity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsothermalMoistureCapacity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIsothermalMoistureCapacityAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsothermalMoistureCapacityAsString(String newIsothermalMoistureCapacityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString(),
                newIsothermalMoistureCapacityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsothermalMoistureCapacityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsothermalMoistureCapacityAsString() {
        return eIsSet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getVaporPermeability() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaporPermeability(double newVaporPermeability) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), newVaporPermeability);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaporPermeability() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaporPermeability() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVaporPermeabilityAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaporPermeabilityAsString(String newVaporPermeabilityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString(),
                newVaporPermeabilityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaporPermeabilityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaporPermeabilityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMoistureDiffusivity() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMoistureDiffusivity(double newMoistureDiffusivity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(),
                newMoistureDiffusivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMoistureDiffusivity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMoistureDiffusivity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMoistureDiffusivityAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMoistureDiffusivityAsString(String newMoistureDiffusivityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString(),
                newMoistureDiffusivityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMoistureDiffusivityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMoistureDiffusivityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString());
    }

} //IfcHygroscopicMaterialPropertiesImpl
