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
import org.bimserver.models.ifc2x3tc1.IfcGeneralMaterialProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeightAsString <em>Molecular Weight As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getPorosityAsString <em>Porosity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMassDensity <em>Mass Density</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMassDensityAsString <em>Mass Density As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcGeneralMaterialPropertiesImpl extends IfcMaterialPropertiesImpl
        implements IfcGeneralMaterialProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcGeneralMaterialPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMolecularWeight() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMolecularWeight(double newMolecularWeight) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), newMolecularWeight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMolecularWeight() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMolecularWeight() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMolecularWeightAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeightAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMolecularWeightAsString(String newMolecularWeightAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeightAsString(),
                newMolecularWeightAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMolecularWeightAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMolecularWeightAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getPorosity() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPorosity(double newPorosity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), newPorosity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPorosity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPorosity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPorosityAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_PorosityAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPorosityAsString(String newPorosityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_PorosityAsString(), newPorosityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPorosityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_PorosityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPorosityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_PorosityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMassDensity() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMassDensity(double newMassDensity) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), newMassDensity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMassDensity() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMassDensity() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMassDensityAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensityAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMassDensityAsString(String newMassDensityAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensityAsString(), newMassDensityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMassDensityAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMassDensityAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensityAsString());
    }

} //IfcGeneralMaterialPropertiesImpl
