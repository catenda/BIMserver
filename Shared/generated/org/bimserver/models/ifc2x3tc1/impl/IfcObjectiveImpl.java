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
import org.bimserver.models.ifc2x3tc1.IfcMetric;
import org.bimserver.models.ifc2x3tc1.IfcObjective;
import org.bimserver.models.ifc2x3tc1.IfcObjectiveEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcObjectiveImpl#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcObjectiveImpl#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcObjectiveImpl#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcObjectiveImpl#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcObjectiveImpl extends IfcConstraintImpl implements IfcObjective {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfcObjectiveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Ifc2x3tc1Package.eINSTANCE.getIfcObjective();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcMetric getBenchmarkValues() {
        return (IfcMetric) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_BenchmarkValues(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBenchmarkValues(IfcMetric newBenchmarkValues) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_BenchmarkValues(), newBenchmarkValues);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBenchmarkValues() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_BenchmarkValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBenchmarkValues() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_BenchmarkValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcMetric getResultValues() {
        return (IfcMetric) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ResultValues(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResultValues(IfcMetric newResultValues) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ResultValues(), newResultValues);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResultValues() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ResultValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResultValues() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ResultValues());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfcObjectiveEnum getObjectiveQualifier() {
        return (IfcObjectiveEnum) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ObjectiveQualifier(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setObjectiveQualifier(IfcObjectiveEnum newObjectiveQualifier) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_ObjectiveQualifier(), newObjectiveQualifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserDefinedQualifier() {
        return (String) eGet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_UserDefinedQualifier(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserDefinedQualifier(String newUserDefinedQualifier) {
        eSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_UserDefinedQualifier(), newUserDefinedQualifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserDefinedQualifier() {
        eUnset(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_UserDefinedQualifier());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserDefinedQualifier() {
        return eIsSet(Ifc2x3tc1Package.eINSTANCE.getIfcObjective_UserDefinedQualifier());
    }

} //IfcObjectiveImpl
