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
import org.bimserver.models.ifc2x3tc1.IfcSizeSelect;
import org.bimserver.models.ifc2x3tc1.IfcTextStyleWithBoxCharacteristics;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeightAsString <em>Box Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidthAsString <em>Box Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngleAsString <em>Box Slant Angle As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngleAsString <em>Box Rotate Angle As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcTextStyleWithBoxCharacteristicsImpl extends IdEObjectImpl
        implements IfcTextStyleWithBoxCharacteristics {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcTextStyleWithBoxCharacteristicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics();
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
    public double getBoxHeight() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxHeight(double newBoxHeight) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight(), newBoxHeight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxHeight() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxHeight() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBoxHeightAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxHeightAsString(String newBoxHeightAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString(),
                newBoxHeightAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxHeightAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxHeightAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBoxWidth() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxWidth(double newBoxWidth) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth(), newBoxWidth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxWidth() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxWidth() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBoxWidthAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxWidthAsString(String newBoxWidthAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString(), newBoxWidthAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxWidthAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxWidthAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBoxSlantAngle() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxSlantAngle(double newBoxSlantAngle) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle(), newBoxSlantAngle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxSlantAngle() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxSlantAngle() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBoxSlantAngleAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxSlantAngleAsString(String newBoxSlantAngleAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString(),
                newBoxSlantAngleAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxSlantAngleAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxSlantAngleAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBoxRotateAngle() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxRotateAngle(double newBoxRotateAngle) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle(), newBoxRotateAngle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxRotateAngle() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxRotateAngle() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBoxRotateAngleAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoxRotateAngleAsString(String newBoxRotateAngleAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString(),
                newBoxRotateAngleAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoxRotateAngleAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoxRotateAngleAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcSizeSelect getCharacterSpacing() {
        return (IfcSizeSelect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCharacterSpacing(IfcSizeSelect newCharacterSpacing) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing(), newCharacterSpacing);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCharacterSpacing() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCharacterSpacing() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing());
    }

} //IfcTextStyleWithBoxCharacteristicsImpl
