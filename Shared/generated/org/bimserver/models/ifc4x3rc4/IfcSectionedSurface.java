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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sectioned Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getFixedAxisVertical <em>Fixed Axis Vertical</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSurface()
 * @model
 * @generated
 */
public interface IfcSectionedSurface extends IfcSurface {
    /**
     * Returns the value of the '<em><b>Directrix</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Directrix</em>' reference.
     * @see #setDirectrix(IfcCurve)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSurface_Directrix()
     * @model
     * @generated
     */
    IfcCurve getDirectrix();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getDirectrix <em>Directrix</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Directrix</em>' reference.
     * @see #getDirectrix()
     * @generated
     */
    void setDirectrix(IfcCurve value);

    /**
     * Returns the value of the '<em><b>Cross Section Positions</b></em>' reference list.
     * The list contents are of type {@link org.bimserver.models.ifc4x3rc4.IfcPointByDistanceExpression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cross Section Positions</em>' reference list.
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSurface_CrossSectionPositions()
     * @model
     * @generated
     */
    EList<IfcPointByDistanceExpression> getCrossSectionPositions();

    /**
     * Returns the value of the '<em><b>Cross Sections</b></em>' reference list.
     * The list contents are of type {@link org.bimserver.models.ifc4x3rc4.IfcProfileDef}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cross Sections</em>' reference list.
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSurface_CrossSections()
     * @model
     * @generated
     */
    EList<IfcProfileDef> getCrossSections();

    /**
     * Returns the value of the '<em><b>Fixed Axis Vertical</b></em>' attribute.
     * The literals are from the enumeration {@link org.bimserver.models.ifc4x3rc4.Tristate}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Axis Vertical</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.Tristate
     * @see #setFixedAxisVertical(Tristate)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSurface_FixedAxisVertical()
     * @model
     * @generated
     */
    Tristate getFixedAxisVertical();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSurface#getFixedAxisVertical <em>Fixed Axis Vertical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Axis Vertical</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.Tristate
     * @see #getFixedAxisVertical()
     * @generated
     */
    void setFixedAxisVertical(Tristate value);

} // IfcSectionedSurface
