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
import org.bimserver.models.ifc2x3tc1.IfcLShapeProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc LShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getWidthAsString <em>Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getEdgeRadiusAsString <em>Edge Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getLegSlope <em>Leg Slope</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getLegSlopeAsString <em>Leg Slope As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcLShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcLShapeProfileDef {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcLShapeProfileDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getDepth() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Depth(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDepth(double newDepth) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Depth(), newDepth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDepthAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_DepthAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDepthAsString(String newDepthAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_DepthAsString(), newDepthAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getWidth() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Width(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWidth(double newWidth) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Width(), newWidth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWidth() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Width());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWidth() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Width());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWidthAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_WidthAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWidthAsString(String newWidthAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_WidthAsString(), newWidthAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWidthAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_WidthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWidthAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_WidthAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getThickness() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Thickness(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThickness(double newThickness) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Thickness(), newThickness);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getThicknessAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_ThicknessAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThicknessAsString(String newThicknessAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_ThicknessAsString(), newThicknessAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getFilletRadius() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadius(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFilletRadius(double newFilletRadius) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadius(), newFilletRadius);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFilletRadius() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFilletRadius() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFilletRadiusAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadiusAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFilletRadiusAsString(String newFilletRadiusAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadiusAsString(), newFilletRadiusAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFilletRadiusAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFilletRadiusAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getEdgeRadius() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadius(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEdgeRadius(double newEdgeRadius) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadius(), newEdgeRadius);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEdgeRadius() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEdgeRadius() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadius());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEdgeRadiusAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadiusAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEdgeRadiusAsString(String newEdgeRadiusAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadiusAsString(), newEdgeRadiusAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEdgeRadiusAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEdgeRadiusAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadiusAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getLegSlope() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlope(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLegSlope(double newLegSlope) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlope(), newLegSlope);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLegSlope() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlope());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLegSlope() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlope());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLegSlopeAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlopeAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLegSlopeAsString(String newLegSlopeAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlopeAsString(), newLegSlopeAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLegSlopeAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlopeAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLegSlopeAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlopeAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCentreOfGravityInX() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInX(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInX(double newCentreOfGravityInX) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInX(), newCentreOfGravityInX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInX() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInX() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInX());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCentreOfGravityInXAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInXAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInXAsString(String newCentreOfGravityInXAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInXAsString(),
                newCentreOfGravityInXAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInXAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInXAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInXAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCentreOfGravityInY() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInY(double newCentreOfGravityInY) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInY() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInY() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInY());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCentreOfGravityInYAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInYAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInYAsString(),
                newCentreOfGravityInYAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCentreOfGravityInYAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInYAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCentreOfGravityInYAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInYAsString());
    }

} //IfcLShapeProfileDefImpl
