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
package org.bimserver.models.ifc4x3add2.impl;

import org.bimserver.models.ifc4x3add2.Ifc4x3add2Package;
import org.bimserver.models.ifc4x3add2.IfcConnectionGeometry;
import org.bimserver.models.ifc4x3add2.IfcElement;
import org.bimserver.models.ifc4x3add2.IfcInternalOrExternalEnum;
import org.bimserver.models.ifc4x3add2.IfcPhysicalOrVirtualEnum;
import org.bimserver.models.ifc4x3add2.IfcRelSpaceBoundary;
import org.bimserver.models.ifc4x3add2.IfcSpaceBoundarySelect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Space Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelSpaceBoundaryImpl#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelSpaceBoundaryImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelSpaceBoundaryImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelSpaceBoundaryImpl#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3add2.impl.IfcRelSpaceBoundaryImpl#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcRelSpaceBoundaryImpl extends IfcRelConnectsImpl implements IfcRelSpaceBoundary {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcRelSpaceBoundaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcSpaceBoundarySelect getRelatingSpace() {
        return (IfcSpaceBoundarySelect) eGet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_RelatingSpace(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelatingSpace(IfcSpaceBoundarySelect newRelatingSpace) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_RelatingSpace(), newRelatingSpace);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcElement getRelatedBuildingElement() {
        return (IfcElement) eGet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_RelatedBuildingElement(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_RelatedBuildingElement(), newRelatedBuildingElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcConnectionGeometry getConnectionGeometry() {
        return (IfcConnectionGeometry) eGet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry(), newConnectionGeometry);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectionGeometry() {
        eUnset(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectionGeometry() {
        return eIsSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
        return (IfcPhysicalOrVirtualEnum) eGet(
                Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum newPhysicalOrVirtualBoundary) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary(),
                newPhysicalOrVirtualBoundary);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
        return (IfcInternalOrExternalEnum) eGet(
                Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum newInternalOrExternalBoundary) {
        eSet(Ifc4x3add2Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary(),
                newInternalOrExternalBoundary);
    }

} //IfcRelSpaceBoundaryImpl
