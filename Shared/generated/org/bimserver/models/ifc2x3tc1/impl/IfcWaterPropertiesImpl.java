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
import org.bimserver.models.ifc2x3tc1.IfcWaterProperties;
import org.bimserver.models.ifc2x3tc1.Tristate;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getHardnessAsString <em>Hardness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getImpuritiesContentAsString <em>Impurities Content As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getPHLevelAsString <em>PH Level As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcWaterPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcWaterProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcWaterPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tristate getIsPotable() {
        return (Tristate) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_IsPotable(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPotable(Tristate newIsPotable) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_IsPotable(), newIsPotable);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPotable() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_IsPotable());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPotable() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_IsPotable());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getHardness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_Hardness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHardness(double newHardness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_Hardness(), newHardness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHardness() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_Hardness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHardness() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_Hardness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHardnessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_HardnessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHardnessAsString(String newHardnessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_HardnessAsString(), newHardnessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHardnessAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_HardnessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHardnessAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_HardnessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getAlkalinityConcentration() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlkalinityConcentration(double newAlkalinityConcentration) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), newAlkalinityConcentration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlkalinityConcentration() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlkalinityConcentration() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAlkalinityConcentrationAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentrationAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlkalinityConcentrationAsString(String newAlkalinityConcentrationAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentrationAsString(),
                newAlkalinityConcentrationAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlkalinityConcentrationAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentrationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlkalinityConcentrationAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentrationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getAcidityConcentration() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAcidityConcentration(double newAcidityConcentration) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), newAcidityConcentration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAcidityConcentration() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAcidityConcentration() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAcidityConcentrationAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentrationAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAcidityConcentrationAsString(String newAcidityConcentrationAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentrationAsString(),
                newAcidityConcentrationAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAcidityConcentrationAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentrationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAcidityConcentrationAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentrationAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getImpuritiesContent() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImpuritiesContent(double newImpuritiesContent) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), newImpuritiesContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImpuritiesContent() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImpuritiesContent() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getImpuritiesContentAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContentAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImpuritiesContentAsString(String newImpuritiesContentAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContentAsString(),
                newImpuritiesContentAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImpuritiesContentAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContentAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImpuritiesContentAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContentAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getPHLevel() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevel(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPHLevel(double newPHLevel) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevel(), newPHLevel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPHLevel() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevel());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPHLevel() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevel());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPHLevelAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevelAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPHLevelAsString(String newPHLevelAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevelAsString(), newPHLevelAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPHLevelAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevelAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPHLevelAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevelAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getDissolvedSolidsContent() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDissolvedSolidsContent(double newDissolvedSolidsContent) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), newDissolvedSolidsContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDissolvedSolidsContent() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDissolvedSolidsContent() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDissolvedSolidsContentAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContentAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDissolvedSolidsContentAsString(String newDissolvedSolidsContentAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContentAsString(),
                newDissolvedSolidsContentAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDissolvedSolidsContentAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContentAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDissolvedSolidsContentAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContentAsString());
    }

} //IfcWaterPropertiesImpl
