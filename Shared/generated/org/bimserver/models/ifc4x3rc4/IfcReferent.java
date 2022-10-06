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
package org.bimserver.models.ifc4x3rc4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Referent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistance <em>Restart Distance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistanceAsString <em>Restart Distance As String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcReferent()
 * @model
 * @generated
 */
public interface IfcReferent extends IfcPositioningElement {
    /**
     * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.bimserver.models.ifc4x3rc4.IfcReferentTypeEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Predefined Type</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.IfcReferentTypeEnum
     * @see #isSetPredefinedType()
     * @see #unsetPredefinedType()
     * @see #setPredefinedType(IfcReferentTypeEnum)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcReferent_PredefinedType()
     * @model unsettable="true"
     * @generated
     */
    IfcReferentTypeEnum getPredefinedType();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getPredefinedType <em>Predefined Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Predefined Type</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.IfcReferentTypeEnum
     * @see #isSetPredefinedType()
     * @see #unsetPredefinedType()
     * @see #getPredefinedType()
     * @generated
     */
    void setPredefinedType(IfcReferentTypeEnum value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getPredefinedType <em>Predefined Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPredefinedType()
     * @see #getPredefinedType()
     * @see #setPredefinedType(IfcReferentTypeEnum)
     * @generated
     */
    void unsetPredefinedType();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getPredefinedType <em>Predefined Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
     * @see #unsetPredefinedType()
     * @see #getPredefinedType()
     * @see #setPredefinedType(IfcReferentTypeEnum)
     * @generated
     */
    boolean isSetPredefinedType();

    /**
     * Returns the value of the '<em><b>Restart Distance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restart Distance</em>' attribute.
     * @see #isSetRestartDistance()
     * @see #unsetRestartDistance()
     * @see #setRestartDistance(double)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcReferent_RestartDistance()
     * @model unsettable="true"
     * @generated
     */
    double getRestartDistance();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistance <em>Restart Distance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Restart Distance</em>' attribute.
     * @see #isSetRestartDistance()
     * @see #unsetRestartDistance()
     * @see #getRestartDistance()
     * @generated
     */
    void setRestartDistance(double value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistance <em>Restart Distance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRestartDistance()
     * @see #getRestartDistance()
     * @see #setRestartDistance(double)
     * @generated
     */
    void unsetRestartDistance();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistance <em>Restart Distance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Restart Distance</em>' attribute is set.
     * @see #unsetRestartDistance()
     * @see #getRestartDistance()
     * @see #setRestartDistance(double)
     * @generated
     */
    boolean isSetRestartDistance();

    /**
     * Returns the value of the '<em><b>Restart Distance As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restart Distance As String</em>' attribute.
     * @see #isSetRestartDistanceAsString()
     * @see #unsetRestartDistanceAsString()
     * @see #setRestartDistanceAsString(String)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcReferent_RestartDistanceAsString()
     * @model unsettable="true"
     *        annotation="asstring"
     *        annotation="hidden"
     * @generated
     */
    String getRestartDistanceAsString();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistanceAsString <em>Restart Distance As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Restart Distance As String</em>' attribute.
     * @see #isSetRestartDistanceAsString()
     * @see #unsetRestartDistanceAsString()
     * @see #getRestartDistanceAsString()
     * @generated
     */
    void setRestartDistanceAsString(String value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistanceAsString <em>Restart Distance As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRestartDistanceAsString()
     * @see #getRestartDistanceAsString()
     * @see #setRestartDistanceAsString(String)
     * @generated
     */
    void unsetRestartDistanceAsString();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcReferent#getRestartDistanceAsString <em>Restart Distance As String</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Restart Distance As String</em>' attribute is set.
     * @see #unsetRestartDistanceAsString()
     * @see #getRestartDistanceAsString()
     * @see #setRestartDistanceAsString(String)
     * @generated
     */
    boolean isSetRestartDistanceAsString();

} // IfcReferent
