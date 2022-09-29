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
import org.bimserver.models.ifc2x3tc1.IfcCraneRailAShapeProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Crane Rail AShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getOverallHeightAsString <em>Overall Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth2 <em>Base Width2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth2AsString <em>Base Width2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadWidthAsString <em>Head Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth2AsString <em>Head Depth2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth3AsString <em>Head Depth3 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth4 <em>Base Width4</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth4AsString <em>Base Width4 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth1AsString <em>Base Depth1 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth2AsString <em>Base Depth2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth3 <em>Base Depth3</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth3AsString <em>Base Depth3 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailAShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcCraneRailAShapeProfileDefImpl extends IfcParameterizedProfileDefImpl
        implements IfcCraneRailAShapeProfileDef {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcCraneRailAShapeProfileDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getOverallHeight() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverallHeight(double newOverallHeight) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), newOverallHeight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOverallHeightAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeightAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverallHeightAsString(String newOverallHeightAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeightAsString(),
                newOverallHeightAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBaseWidth2() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseWidth2(double newBaseWidth2) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), newBaseWidth2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaseWidth2AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseWidth2AsString(String newBaseWidth2AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2AsString(), newBaseWidth2AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getRadius() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRadius(double newRadius) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), newRadius);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRadius() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRadius() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRadiusAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_RadiusAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRadiusAsString(String newRadiusAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_RadiusAsString(), newRadiusAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRadiusAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_RadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRadiusAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_RadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getHeadWidth() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadWidth(double newHeadWidth) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), newHeadWidth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHeadWidthAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidthAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadWidthAsString(String newHeadWidthAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidthAsString(), newHeadWidthAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getHeadDepth2() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadDepth2(double newHeadDepth2) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), newHeadDepth2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHeadDepth2AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadDepth2AsString(String newHeadDepth2AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2AsString(), newHeadDepth2AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getHeadDepth3() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadDepth3(double newHeadDepth3) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), newHeadDepth3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHeadDepth3AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeadDepth3AsString(String newHeadDepth3AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3AsString(), newHeadDepth3AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getWebThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWebThickness(double newWebThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), newWebThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWebThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWebThicknessAsString(String newWebThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThicknessAsString(),
                newWebThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBaseWidth4() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseWidth4(double newBaseWidth4) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), newBaseWidth4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaseWidth4AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseWidth4AsString(String newBaseWidth4AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4AsString(), newBaseWidth4AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBaseDepth1() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth1(double newBaseDepth1) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), newBaseDepth1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaseDepth1AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth1AsString(String newBaseDepth1AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1AsString(), newBaseDepth1AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBaseDepth2() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth2(double newBaseDepth2) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), newBaseDepth2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaseDepth2AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth2AsString(String newBaseDepth2AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2AsString(), newBaseDepth2AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getBaseDepth3() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth3(double newBaseDepth3) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), newBaseDepth3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaseDepth3AsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3AsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseDepth3AsString(String newBaseDepth3AsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3AsString(), newBaseDepth3AsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCentreOfGravityInY() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInY(double newCentreOfGravityInY) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInY() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInY() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCentreOfGravityInYAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString(),
                newCentreOfGravityInYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInYAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInYAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString());
    }

} //IfcCraneRailAShapeProfileDefImpl
