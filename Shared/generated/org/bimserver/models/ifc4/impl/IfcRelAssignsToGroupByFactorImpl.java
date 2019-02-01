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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcRelAssignsToGroupByFactor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Group By Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsToGroupByFactorImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsToGroupByFactorImpl#getFactorAsString <em>Factor As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcRelAssignsToGroupByFactorImpl extends IfcRelAssignsToGroupImpl implements IfcRelAssignsToGroupByFactor {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcRelAssignsToGroupByFactorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_GROUP_BY_FACTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getFactor() {
        return (Double) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_GROUP_BY_FACTOR__FACTOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFactor(double newFactor) {
        eSet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_GROUP_BY_FACTOR__FACTOR, newFactor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFactorAsString() {
        return (String) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_GROUP_BY_FACTOR__FACTOR_AS_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFactorAsString(String newFactorAsString) {
        eSet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_GROUP_BY_FACTOR__FACTOR_AS_STRING, newFactorAsString);
    }

} //IfcRelAssignsToGroupByFactorImpl
