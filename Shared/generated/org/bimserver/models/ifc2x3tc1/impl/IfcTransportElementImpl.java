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
import org.bimserver.models.ifc2x3tc1.IfcTransportElement;
import org.bimserver.models.ifc2x3tc1.IfcTransportElementTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumber <em>Capacity By Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumberAsString <em>Capacity By Number As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcTransportElementImpl extends IfcElementImpl implements IfcTransportElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcTransportElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcTransportElementTypeEnum getOperationType() {
        return (IfcTransportElementTypeEnum) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_OperationType(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationType(IfcTransportElementTypeEnum newOperationType) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_OperationType(), newOperationType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationType() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_OperationType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationType() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_OperationType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCapacityByWeight() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeight(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacityByWeight(double newCapacityByWeight) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeight(), newCapacityByWeight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacityByWeight() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacityByWeight() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeight());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapacityByWeightAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeightAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacityByWeightAsString(String newCapacityByWeightAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeightAsString(), newCapacityByWeightAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacityByWeightAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacityByWeightAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeightAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getCapacityByNumber() {
        return (Double) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumber(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacityByNumber(double newCapacityByNumber) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumber(), newCapacityByNumber);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacityByNumber() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumber());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacityByNumber() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumber());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapacityByNumberAsString() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumberAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacityByNumberAsString(String newCapacityByNumberAsString) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumberAsString(), newCapacityByNumberAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacityByNumberAsString() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumberAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacityByNumberAsString() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumberAsString());
    }

} //IfcTransportElementImpl
