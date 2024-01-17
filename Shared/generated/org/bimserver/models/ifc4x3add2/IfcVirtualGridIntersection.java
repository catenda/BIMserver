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
package org.bimserver.models.ifc4x3add2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3add2.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.IfcVirtualGridIntersection#getOffsetDistances <em>Offset Distances</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.IfcVirtualGridIntersection#getOffsetDistancesAsString <em>Offset Distances As String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3add2.Ifc4x3add2Package#getIfcVirtualGridIntersection()
 * @model
 * @generated
 */
public interface IfcVirtualGridIntersection extends IfcGridPlacementDirectionSelect {
    /**
     * Returns the value of the '<em><b>Intersecting Axes</b></em>' reference list.
     * The list contents are of type {@link org.bimserver.models.ifc4x3add2.IfcGridAxis}.
     * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc4x3add2.IfcGridAxis#getHasIntersections <em>Has Intersections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intersecting Axes</em>' reference list.
     * @see org.bimserver.models.ifc4x3add2.Ifc4x3add2Package#getIfcVirtualGridIntersection_IntersectingAxes()
     * @see org.bimserver.models.ifc4x3add2.IfcGridAxis#getHasIntersections
     * @model opposite="HasIntersections"
     *        annotation="inverse"
     * @generated
     */
    EList<IfcGridAxis> getIntersectingAxes();

    /**
     * Returns the value of the '<em><b>Offset Distances</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Double}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Distances</em>' attribute list.
     * @see org.bimserver.models.ifc4x3add2.Ifc4x3add2Package#getIfcVirtualGridIntersection_OffsetDistances()
     * @model unique="false"
     * @generated
     */
    EList<Double> getOffsetDistances();

    /**
     * Returns the value of the '<em><b>Offset Distances As String</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Distances As String</em>' attribute list.
     * @see org.bimserver.models.ifc4x3add2.Ifc4x3add2Package#getIfcVirtualGridIntersection_OffsetDistancesAsString()
     * @model unique="false"
     *        annotation="asstring"
     *        annotation="hidden"
     * @generated
     */
    EList<String> getOffsetDistancesAsString();

} // IfcVirtualGridIntersection
