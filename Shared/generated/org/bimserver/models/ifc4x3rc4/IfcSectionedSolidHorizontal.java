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
 * A representation of the model object '<em><b>Ifc Sectioned Solid Horizontal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSolidHorizontal#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSolidHorizontal#getFixedAxisVertical <em>Fixed Axis Vertical</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSolidHorizontal()
 * @model
 * @generated
 */
public interface IfcSectionedSolidHorizontal extends IfcSectionedSolid {
    /**
     * Returns the value of the '<em><b>Cross Section Positions</b></em>' reference list.
     * The list contents are of type {@link org.bimserver.models.ifc4x3rc4.IfcAxis2PlacementLinear}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cross Section Positions</em>' reference list.
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSolidHorizontal_CrossSectionPositions()
     * @model
     * @generated
     */
    EList<IfcAxis2PlacementLinear> getCrossSectionPositions();

    /**
     * Returns the value of the '<em><b>Fixed Axis Vertical</b></em>' attribute.
     * The literals are from the enumeration {@link org.bimserver.models.ifc4x3rc4.Tristate}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Axis Vertical</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.Tristate
     * @see #setFixedAxisVertical(Tristate)
     * @see org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package#getIfcSectionedSolidHorizontal_FixedAxisVertical()
     * @model
     * @generated
     */
    Tristate getFixedAxisVertical();

    /**
     * Sets the value of the '{@link org.bimserver.models.ifc4x3rc4.IfcSectionedSolidHorizontal#getFixedAxisVertical <em>Fixed Axis Vertical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Axis Vertical</em>' attribute.
     * @see org.bimserver.models.ifc4x3rc4.Tristate
     * @see #getFixedAxisVertical()
     * @generated
     */
    void setFixedAxisVertical(Tristate value);

} // IfcSectionedSolidHorizontal
