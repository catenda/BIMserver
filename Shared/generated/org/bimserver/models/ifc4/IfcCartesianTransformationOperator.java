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
package org.bimserver.models.ifc4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScale <em>Scale</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getDim <em>Dim</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScl <em>Scl</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getSclAsString <em>Scl As String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator()
 * @model
 * @generated
 */
public interface IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
    /**
     * Returns the value of the '<em><b>Axis1</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Axis1</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Axis1</em>' reference.
     * @see #isSetAxis1()
     * @see #unsetAxis1()
     * @see #setAxis1(IfcDirection)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_Axis1()
     * @model unsettable="true"
     * @generated
     */
    IfcDirection getAxis1();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Axis1</em>' reference.
     * @see #isSetAxis1()
     * @see #unsetAxis1()
     * @see #getAxis1()
     * @generated
     */
    void setAxis1(IfcDirection value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAxis1()
     * @see #getAxis1()
     * @see #setAxis1(IfcDirection)
     * @generated
     */
    void unsetAxis1();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Axis1</em>' reference is set.
     * @see #unsetAxis1()
     * @see #getAxis1()
     * @see #setAxis1(IfcDirection)
     * @generated
     */
    boolean isSetAxis1();

    /**
     * Returns the value of the '<em><b>Axis2</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Axis2</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Axis2</em>' reference.
     * @see #isSetAxis2()
     * @see #unsetAxis2()
     * @see #setAxis2(IfcDirection)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_Axis2()
     * @model unsettable="true"
     * @generated
     */
    IfcDirection getAxis2();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Axis2</em>' reference.
     * @see #isSetAxis2()
     * @see #unsetAxis2()
     * @see #getAxis2()
     * @generated
     */
    void setAxis2(IfcDirection value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAxis2()
     * @see #getAxis2()
     * @see #setAxis2(IfcDirection)
     * @generated
     */
    void unsetAxis2();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Axis2</em>' reference is set.
     * @see #unsetAxis2()
     * @see #getAxis2()
     * @see #setAxis2(IfcDirection)
     * @generated
     */
    boolean isSetAxis2();

    /**
     * Returns the value of the '<em><b>Local Origin</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Origin</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Origin</em>' reference.
     * @see #setLocalOrigin(IfcCartesianPoint)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_LocalOrigin()
     * @model
     * @generated
     */
    IfcCartesianPoint getLocalOrigin();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Origin</em>' reference.
     * @see #getLocalOrigin()
     * @generated
     */
    void setLocalOrigin(IfcCartesianPoint value);

    /**
     * Returns the value of the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scale</em>' attribute.
     * @see #isSetScale()
     * @see #unsetScale()
     * @see #setScale(double)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_Scale()
     * @model unsettable="true"
     * @generated
     */
    double getScale();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scale</em>' attribute.
     * @see #isSetScale()
     * @see #unsetScale()
     * @see #getScale()
     * @generated
     */
    void setScale(double value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScale()
     * @see #getScale()
     * @see #setScale(double)
     * @generated
     */
    void unsetScale();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scale</em>' attribute is set.
     * @see #unsetScale()
     * @see #getScale()
     * @see #setScale(double)
     * @generated
     */
    boolean isSetScale();

    /**
     * Returns the value of the '<em><b>Scale As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scale As String</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scale As String</em>' attribute.
     * @see #isSetScaleAsString()
     * @see #unsetScaleAsString()
     * @see #setScaleAsString(String)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_ScaleAsString()
     * @model unsettable="true"
     * @generated
     */
    String getScaleAsString();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scale As String</em>' attribute.
     * @see #isSetScaleAsString()
     * @see #unsetScaleAsString()
     * @see #getScaleAsString()
     * @generated
     */
    void setScaleAsString(String value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScaleAsString()
     * @see #getScaleAsString()
     * @see #setScaleAsString(String)
     * @generated
     */
    void unsetScaleAsString();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scale As String</em>' attribute is set.
     * @see #unsetScaleAsString()
     * @see #getScaleAsString()
     * @see #setScaleAsString(String)
     * @generated
     */
    boolean isSetScaleAsString();

    /**
     * Returns the value of the '<em><b>Dim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dim</em>' attribute.
     * @see #isSetDim()
     * @see #unsetDim()
     * @see #setDim(long)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_Dim()
     * @model unsettable="true" derived="true"
     * @generated
     */
    long getDim();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getDim <em>Dim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dim</em>' attribute.
     * @see #isSetDim()
     * @see #unsetDim()
     * @see #getDim()
     * @generated
     */
    void setDim(long value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getDim <em>Dim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDim()
     * @see #getDim()
     * @see #setDim(long)
     * @generated
     */
    void unsetDim();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getDim <em>Dim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dim</em>' attribute is set.
     * @see #unsetDim()
     * @see #getDim()
     * @see #setDim(long)
     * @generated
     */
    boolean isSetDim();

    /**
     * Returns the value of the '<em><b>Scl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl</em>' attribute.
     * @see #isSetScl()
     * @see #unsetScl()
     * @see #setScl(double)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_Scl()
     * @model unsettable="true" derived="true"
     * @generated
     */
    double getScl();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScl <em>Scl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scl</em>' attribute.
     * @see #isSetScl()
     * @see #unsetScl()
     * @see #getScl()
     * @generated
     */
    void setScl(double value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScl <em>Scl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScl()
     * @see #getScl()
     * @see #setScl(double)
     * @generated
     */
    void unsetScl();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getScl <em>Scl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl</em>' attribute is set.
     * @see #unsetScl()
     * @see #getScl()
     * @see #setScl(double)
     * @generated
     */
    boolean isSetScl();

    /**
     * Returns the value of the '<em><b>Scl As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scl As String</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl As String</em>' attribute.
     * @see #isSetSclAsString()
     * @see #unsetSclAsString()
     * @see #setSclAsString(String)
     * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCartesianTransformationOperator_SclAsString()
     * @model unsettable="true"
     * @generated
     */
    String getSclAsString();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getSclAsString <em>Scl As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scl As String</em>' attribute.
     * @see #isSetSclAsString()
     * @see #unsetSclAsString()
     * @see #getSclAsString()
     * @generated
     */
    void setSclAsString(String value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getSclAsString <em>Scl As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSclAsString()
     * @see #getSclAsString()
     * @see #setSclAsString(String)
     * @generated
     */
    void unsetSclAsString();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcCartesianTransformationOperator#getSclAsString <em>Scl As String</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl As String</em>' attribute is set.
     * @see #unsetSclAsString()
     * @see #getSclAsString()
     * @see #setSclAsString(String)
     * @generated
     */
    boolean isSetSclAsString();

} // IfcCartesianTransformationOperator
