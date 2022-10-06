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
import org.bimserver.models.ifc4.IfcColourRgbList;
import org.bimserver.models.ifc4.IfcIndexedColourMap;
import org.bimserver.models.ifc4.IfcTessellatedFaceSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Indexed Colour Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getOpacityAsString <em>Opacity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getColours <em>Colours</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getColourIndex <em>Colour Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcIndexedColourMapImpl extends IfcPresentationItemImpl implements IfcIndexedColourMap {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcIndexedColourMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc4Package.eINSTANCE.getIfcIndexedColourMap();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcTessellatedFaceSet getMappedTo() {
        return (IfcTessellatedFaceSet) eGet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_MappedTo(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMappedTo(IfcTessellatedFaceSet newMappedTo) {
        eSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_MappedTo(), newMappedTo);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getOpacity() {
        return (Double) eGet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Opacity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpacity(double newOpacity) {
        eSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Opacity(), newOpacity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpacity() {
        eUnset(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Opacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpacity() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Opacity());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOpacityAsString() {
        return (String) eGet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_OpacityAsString(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpacityAsString(String newOpacityAsString) {
        eSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_OpacityAsString(), newOpacityAsString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpacityAsString() {
        eUnset(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_OpacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpacityAsString() {
        return eIsSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_OpacityAsString());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcColourRgbList getColours() {
        return (IfcColourRgbList) eGet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Colours(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColours(IfcColourRgbList newColours) {
        eSet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_Colours(), newColours);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Long> getColourIndex() {
        return (EList<Long>) eGet(Ifc4Package.eINSTANCE.getIfcIndexedColourMap_ColourIndex(), true);
    }

} //IfcIndexedColourMapImpl
