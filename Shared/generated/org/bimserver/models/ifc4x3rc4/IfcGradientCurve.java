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
 * A representation of the model object '<em><b>Ifc Gradient Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevation <em>Relative Elevation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevationAsString <em>Relative Elevation As String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcGradientCurve()
 * @model
 * @generated
 */
public interface IfcGradientCurve extends IfcCompositeCurve {
    /**
     * Returns the value of the '<em><b>Base Curve</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Curve</em>' reference.
     * @see #setBaseCurve(IfcBoundedCurve)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcGradientCurve_BaseCurve()
     * @model
     * @generated
     */
    IfcBoundedCurve getBaseCurve();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getBaseCurve <em>Base Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Curve</em>' reference.
     * @see #getBaseCurve()
     * @generated
     */
    void setBaseCurve(IfcBoundedCurve value);

    /**
     * Returns the value of the '<em><b>End Point</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Point</em>' reference.
     * @see #isSetEndPoint()
     * @see #unsetEndPoint()
     * @see #setEndPoint(IfcPlacement)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcGradientCurve_EndPoint()
     * @model unsettable="true"
     * @generated
     */
    IfcPlacement getEndPoint();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getEndPoint <em>End Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Point</em>' reference.
     * @see #isSetEndPoint()
     * @see #unsetEndPoint()
     * @see #getEndPoint()
     * @generated
     */
    void setEndPoint(IfcPlacement value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getEndPoint <em>End Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndPoint()
     * @see #getEndPoint()
     * @see #setEndPoint(IfcPlacement)
     * @generated
     */
    void unsetEndPoint();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getEndPoint <em>End Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Point</em>' reference is set.
     * @see #unsetEndPoint()
     * @see #getEndPoint()
     * @see #setEndPoint(IfcPlacement)
     * @generated
     */
    boolean isSetEndPoint();

    /**
     * Returns the value of the '<em><b>Relative Elevation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relative Elevation</em>' attribute.
     * @see #isSetRelativeElevation()
     * @see #unsetRelativeElevation()
     * @see #setRelativeElevation(double)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcGradientCurve_RelativeElevation()
     * @model unsettable="true" derived="true"
     *        annotation="derived"
     * @generated
     */
    double getRelativeElevation();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevation <em>Relative Elevation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relative Elevation</em>' attribute.
     * @see #isSetRelativeElevation()
     * @see #unsetRelativeElevation()
     * @see #getRelativeElevation()
     * @generated
     */
    void setRelativeElevation(double value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevation <em>Relative Elevation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelativeElevation()
     * @see #getRelativeElevation()
     * @see #setRelativeElevation(double)
     * @generated
     */
    void unsetRelativeElevation();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevation <em>Relative Elevation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Relative Elevation</em>' attribute is set.
     * @see #unsetRelativeElevation()
     * @see #getRelativeElevation()
     * @see #setRelativeElevation(double)
     * @generated
     */
    boolean isSetRelativeElevation();

    /**
     * Returns the value of the '<em><b>Relative Elevation As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relative Elevation As String</em>' attribute.
     * @see #isSetRelativeElevationAsString()
     * @see #unsetRelativeElevationAsString()
     * @see #setRelativeElevationAsString(String)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcGradientCurve_RelativeElevationAsString()
     * @model unsettable="true"
     *        annotation="asstring"
     *        annotation="hidden"
     * @generated
     */
    String getRelativeElevationAsString();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevationAsString <em>Relative Elevation As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relative Elevation As String</em>' attribute.
     * @see #isSetRelativeElevationAsString()
     * @see #unsetRelativeElevationAsString()
     * @see #getRelativeElevationAsString()
     * @generated
     */
    void setRelativeElevationAsString(String value);

    /**
     * Unsets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevationAsString <em>Relative Elevation As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelativeElevationAsString()
     * @see #getRelativeElevationAsString()
     * @see #setRelativeElevationAsString(String)
     * @generated
     */
    void unsetRelativeElevationAsString();

    /**
     * Returns whether the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcGradientCurve#getRelativeElevationAsString <em>Relative Elevation As String</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Relative Elevation As String</em>' attribute is set.
     * @see #unsetRelativeElevationAsString()
     * @see #getRelativeElevationAsString()
     * @see #setRelativeElevationAsString(String)
     * @generated
     */
    boolean isSetRelativeElevationAsString();

} // IfcGradientCurve
