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
import org.bimserver.models.ifc2x3tc1.IfcShapeAspect;
import org.bimserver.models.ifc2x3tc1.IfcWindowLiningProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningDepthAsString <em>Lining Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningThicknessAsString <em>Lining Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getTransomThicknessAsString <em>Transom Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getMullionThicknessAsString <em>Mullion Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcWindowLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowLiningProperties {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcWindowLiningPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLiningDepth() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLiningDepth(double newLiningDepth) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth(), newLiningDepth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLiningDepth() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLiningDepth() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiningDepthAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepthAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLiningDepthAsString(String newLiningDepthAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepthAsString(), newLiningDepthAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLiningDepthAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLiningDepthAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLiningThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLiningThickness(double newLiningThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness(), newLiningThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLiningThickness() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLiningThickness() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiningThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLiningThicknessAsString(String newLiningThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThicknessAsString(),
                newLiningThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLiningThicknessAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLiningThicknessAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getTransomThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransomThickness(double newTransomThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness(), newTransomThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransomThickness() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransomThickness() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTransomThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransomThicknessAsString(String newTransomThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThicknessAsString(),
                newTransomThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransomThicknessAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransomThicknessAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMullionThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMullionThickness(double newMullionThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness(), newMullionThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMullionThickness() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMullionThickness() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMullionThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMullionThicknessAsString(String newMullionThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThicknessAsString(),
                newMullionThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMullionThicknessAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMullionThicknessAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThicknessAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getFirstTransomOffset() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstTransomOffset(double newFirstTransomOffset) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset(), newFirstTransomOffset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstTransomOffset() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstTransomOffset() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirstTransomOffsetAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffsetAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstTransomOffsetAsString(String newFirstTransomOffsetAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffsetAsString(),
                newFirstTransomOffsetAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstTransomOffsetAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstTransomOffsetAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSecondTransomOffset() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondTransomOffset(double newSecondTransomOffset) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset(), newSecondTransomOffset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondTransomOffset() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondTransomOffset() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSecondTransomOffsetAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffsetAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondTransomOffsetAsString(String newSecondTransomOffsetAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffsetAsString(),
                newSecondTransomOffsetAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondTransomOffsetAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondTransomOffsetAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getFirstMullionOffset() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstMullionOffset(double newFirstMullionOffset) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset(), newFirstMullionOffset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstMullionOffset() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstMullionOffset() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirstMullionOffsetAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffsetAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstMullionOffsetAsString(String newFirstMullionOffsetAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffsetAsString(),
                newFirstMullionOffsetAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstMullionOffsetAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstMullionOffsetAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSecondMullionOffset() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondMullionOffset(double newSecondMullionOffset) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset(), newSecondMullionOffset);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondMullionOffset() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondMullionOffset() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSecondMullionOffsetAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffsetAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecondMullionOffsetAsString(String newSecondMullionOffsetAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffsetAsString(),
                newSecondMullionOffsetAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecondMullionOffsetAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondMullionOffsetAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffsetAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcShapeAspect getShapeAspectStyle() {
        return (IfcShapeAspect) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle(), newShapeAspectStyle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShapeAspectStyle() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShapeAspectStyle() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle());
    }

} //IfcWindowLiningPropertiesImpl
