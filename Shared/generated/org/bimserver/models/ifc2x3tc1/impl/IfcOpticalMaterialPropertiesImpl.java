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
import org.bimserver.models.ifc2x3tc1.IfcOpticalMaterialProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittanceAsString <em>Visible Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittanceAsString <em>Solar Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittanceAsString <em>Thermal Ir Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBackAsString <em>Thermal Ir Emissivity Back As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFrontAsString <em>Thermal Ir Emissivity Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBackAsString <em>Visible Reflectance Back As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFrontAsString <em>Visible Reflectance Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFrontAsString <em>Solar Reflectance Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBackAsString <em>Solar Reflectance Back As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcOpticalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl
        implements IfcOpticalMaterialProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcOpticalMaterialPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getVisibleTransmittance() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleTransmittance(double newVisibleTransmittance) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance(),
                newVisibleTransmittance);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleTransmittance() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleTransmittance() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVisibleTransmittanceAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittanceAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleTransmittanceAsString(String newVisibleTransmittanceAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittanceAsString(),
                newVisibleTransmittanceAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleTransmittanceAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleTransmittanceAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSolarTransmittance() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarTransmittance(double newSolarTransmittance) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance(), newSolarTransmittance);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarTransmittance() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarTransmittance() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSolarTransmittanceAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittanceAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarTransmittanceAsString(String newSolarTransmittanceAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittanceAsString(),
                newSolarTransmittanceAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarTransmittanceAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarTransmittanceAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getThermalIrTransmittance() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrTransmittance(double newThermalIrTransmittance) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance(),
                newThermalIrTransmittance);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrTransmittance() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrTransmittance() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getThermalIrTransmittanceAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrTransmittanceAsString(String newThermalIrTransmittanceAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString(),
                newThermalIrTransmittanceAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrTransmittanceAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrTransmittanceAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getThermalIrEmissivityBack() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrEmissivityBack(double newThermalIrEmissivityBack) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack(),
                newThermalIrEmissivityBack);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrEmissivityBack() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrEmissivityBack() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getThermalIrEmissivityBackAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrEmissivityBackAsString(String newThermalIrEmissivityBackAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString(),
                newThermalIrEmissivityBackAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrEmissivityBackAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrEmissivityBackAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getThermalIrEmissivityFront() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrEmissivityFront(double newThermalIrEmissivityFront) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront(),
                newThermalIrEmissivityFront);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrEmissivityFront() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrEmissivityFront() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getThermalIrEmissivityFrontAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThermalIrEmissivityFrontAsString(String newThermalIrEmissivityFrontAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString(),
                newThermalIrEmissivityFrontAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalIrEmissivityFrontAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalIrEmissivityFrontAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getVisibleReflectanceBack() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleReflectanceBack(double newVisibleReflectanceBack) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack(),
                newVisibleReflectanceBack);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleReflectanceBack() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleReflectanceBack() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVisibleReflectanceBackAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleReflectanceBackAsString(String newVisibleReflectanceBackAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString(),
                newVisibleReflectanceBackAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleReflectanceBackAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleReflectanceBackAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getVisibleReflectanceFront() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleReflectanceFront(double newVisibleReflectanceFront) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront(),
                newVisibleReflectanceFront);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleReflectanceFront() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleReflectanceFront() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVisibleReflectanceFrontAsString() {
        return (String) eGet(
                Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisibleReflectanceFrontAsString(String newVisibleReflectanceFrontAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString(),
                newVisibleReflectanceFrontAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleReflectanceFrontAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleReflectanceFrontAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSolarReflectanceFront() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarReflectanceFront(double newSolarReflectanceFront) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront(),
                newSolarReflectanceFront);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarReflectanceFront() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarReflectanceFront() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSolarReflectanceFrontAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarReflectanceFrontAsString(String newSolarReflectanceFrontAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString(),
                newSolarReflectanceFrontAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarReflectanceFrontAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarReflectanceFrontAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSolarReflectanceBack() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarReflectanceBack(double newSolarReflectanceBack) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack(),
                newSolarReflectanceBack);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarReflectanceBack() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarReflectanceBack() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSolarReflectanceBackAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBackAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarReflectanceBackAsString(String newSolarReflectanceBackAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBackAsString(),
                newSolarReflectanceBackAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarReflectanceBackAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBackAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarReflectanceBackAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBackAsString());
    }

} //IfcOpticalMaterialPropertiesImpl
