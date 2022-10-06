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
package org.bimserver.models.log.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;

import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1PackageImpl;

import org.bimserver.models.ifc4.Ifc4Package;

import org.bimserver.models.ifc4.impl.Ifc4PackageImpl;

import org.bimserver.models.ifc4x3.Ifc4x3Package;

import org.bimserver.models.ifc4x3.impl.Ifc4x3PackageImpl;

import org.bimserver.models.ifc4x3rc4.Ifc4x3rc4Package;

import org.bimserver.models.ifc4x3rc4.impl.Ifc4x3rc4PackageImpl;

import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.log.CheckoutRelated;
import org.bimserver.models.log.DatabaseCreated;
import org.bimserver.models.log.Download;
import org.bimserver.models.log.ExtendedDataAddedToProject;
import org.bimserver.models.log.ExtendedDataAddedToRevision;
import org.bimserver.models.log.GeoTagUpdated;
import org.bimserver.models.log.LogAction;
import org.bimserver.models.log.LogFactory;
import org.bimserver.models.log.LogPackage;
import org.bimserver.models.log.NewCheckoutAdded;
import org.bimserver.models.log.NewObjectIDMUploaded;
import org.bimserver.models.log.NewProjectAdded;
import org.bimserver.models.log.NewRevisionAdded;
import org.bimserver.models.log.NewUserAdded;
import org.bimserver.models.log.PasswordChanged;
import org.bimserver.models.log.PasswordReset;
import org.bimserver.models.log.ProjectDeleted;
import org.bimserver.models.log.ProjectRelated;
import org.bimserver.models.log.ProjectUndeleted;
import org.bimserver.models.log.ProjectUpdated;
import org.bimserver.models.log.RemoteServiceCalled;
import org.bimserver.models.log.RevisionBranched;
import org.bimserver.models.log.RevisionRelated;
import org.bimserver.models.log.RevisionUpdated;
import org.bimserver.models.log.ServerLog;
import org.bimserver.models.log.ServerStarted;
import org.bimserver.models.log.SettingsSaved;
import org.bimserver.models.log.UserAddedToProject;
import org.bimserver.models.log.UserChanged;
import org.bimserver.models.log.UserDeleted;
import org.bimserver.models.log.UserRelated;
import org.bimserver.models.log.UserRemovedFromProject;
import org.bimserver.models.log.UserUndeleted;

import org.bimserver.models.store.StorePackage;

import org.bimserver.models.store.impl.StorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogPackageImpl extends EPackageImpl implements LogPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serverLogEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectRelatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass checkoutRelatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass revisionRelatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userRelatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newUserAddedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newProjectAddedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass revisionBranchedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newRevisionAddedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newCheckoutAddedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass settingsSavedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userAddedToProjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newObjectIDMUploadedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass downloadEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userRemovedFromProjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectDeletedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userDeletedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passwordResetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass databaseCreatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serverStartedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectUpdatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userUndeletedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectUndeletedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass revisionUpdatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass geoTagUpdatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passwordChangedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userChangedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendedDataAddedToRevisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendedDataAddedToProjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteServiceCalledEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessMethodEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.bimserver.models.log.LogPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private LogPackageImpl() {
        super(eNS_URI, LogFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link LogPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static LogPackage init() {
        if (isInited)
            return (LogPackage) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredLogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        LogPackageImpl theLogPackage = registeredLogPackage instanceof LogPackageImpl
                ? (LogPackageImpl) registeredLogPackage
                : new LogPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI);
        Ifc2x3tc1PackageImpl theIfc2x3tc1Package = (Ifc2x3tc1PackageImpl) (registeredPackage instanceof Ifc2x3tc1PackageImpl
                ? registeredPackage
                : Ifc2x3tc1Package.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc4Package.eNS_URI);
        Ifc4PackageImpl theIfc4Package = (Ifc4PackageImpl) (registeredPackage instanceof Ifc4PackageImpl
                ? registeredPackage
                : Ifc4Package.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc4x3Package.eNS_URI);
        Ifc4x3PackageImpl theIfc4x3Package = (Ifc4x3PackageImpl) (registeredPackage instanceof Ifc4x3PackageImpl
                ? registeredPackage
                : Ifc4x3Package.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc4x3rc4Package.eNS_URI);
        Ifc4x3rc4PackageImpl theIfc4x3rc4Package = (Ifc4x3rc4PackageImpl) (registeredPackage instanceof Ifc4x3rc4PackageImpl
                ? registeredPackage
                : Ifc4x3rc4Package.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
        StorePackageImpl theStorePackage = (StorePackageImpl) (registeredPackage instanceof StorePackageImpl
                ? registeredPackage
                : StorePackage.eINSTANCE);

        // Load packages
        theIfc2x3tc1Package.loadPackage();
        theIfc4Package.loadPackage();
        theIfc4x3Package.loadPackage();
        theIfc4x3rc4Package.loadPackage();

        // Create package meta-data objects
        theLogPackage.createPackageContents();
        theStorePackage.createPackageContents();

        // Initialize created meta-data
        theLogPackage.initializePackageContents();
        theStorePackage.initializePackageContents();

        // Fix loaded packages
        theIfc2x3tc1Package.fixPackageContents();
        theIfc4Package.fixPackageContents();
        theIfc4x3Package.fixPackageContents();
        theIfc4x3rc4Package.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theLogPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(LogPackage.eNS_URI, theLogPackage);
        return theLogPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogAction() {
        return logActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogAction_Date() {
        return (EAttribute) logActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogAction_Executor() {
        return (EReference) logActionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogAction_AccessMethod() {
        return (EAttribute) logActionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServerLog() {
        return serverLogEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServerLog_Actions() {
        return (EReference) serverLogEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectRelated() {
        return projectRelatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProjectRelated_Project() {
        return (EReference) projectRelatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCheckoutRelated() {
        return checkoutRelatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCheckoutRelated_Checkout() {
        return (EReference) checkoutRelatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRevisionRelated() {
        return revisionRelatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRevisionRelated_Revision() {
        return (EReference) revisionRelatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserRelated() {
        return userRelatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUserRelated_User() {
        return (EReference) userRelatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNewUserAdded() {
        return newUserAddedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNewProjectAdded() {
        return newProjectAddedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNewProjectAdded_ParentProject() {
        return (EReference) newProjectAddedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRevisionBranched() {
        return revisionBranchedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRevisionBranched_Oldrevision() {
        return (EReference) revisionBranchedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRevisionBranched_Newrevision() {
        return (EReference) revisionBranchedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNewRevisionAdded() {
        return newRevisionAddedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNewRevisionAdded_Project() {
        return (EReference) newRevisionAddedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNewCheckoutAdded() {
        return newCheckoutAddedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSettingsSaved() {
        return settingsSavedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserAddedToProject() {
        return userAddedToProjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUserAddedToProject_Project() {
        return (EReference) userAddedToProjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNewObjectIDMUploaded() {
        return newObjectIDMUploadedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDownload() {
        return downloadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserRemovedFromProject() {
        return userRemovedFromProjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUserRemovedFromProject_Project() {
        return (EReference) userRemovedFromProjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectDeleted() {
        return projectDeletedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserDeleted() {
        return userDeletedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPasswordReset() {
        return passwordResetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDatabaseCreated() {
        return databaseCreatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDatabaseCreated_Path() {
        return (EAttribute) databaseCreatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDatabaseCreated_Version() {
        return (EAttribute) databaseCreatedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServerStarted() {
        return serverStartedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectUpdated() {
        return projectUpdatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserUndeleted() {
        return userUndeletedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectUndeleted() {
        return projectUndeletedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRevisionUpdated() {
        return revisionUpdatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGeoTagUpdated() {
        return geoTagUpdatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeoTagUpdated_GeoTag() {
        return (EReference) geoTagUpdatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPasswordChanged() {
        return passwordChangedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserChanged() {
        return userChangedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExtendedDataAddedToRevision() {
        return extendedDataAddedToRevisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendedDataAddedToRevision_Revision() {
        return (EReference) extendedDataAddedToRevisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendedDataAddedToRevision_ExtendedData() {
        return (EReference) extendedDataAddedToRevisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExtendedDataAddedToProject() {
        return extendedDataAddedToProjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendedDataAddedToProject_Project() {
        return (EReference) extendedDataAddedToProjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendedDataAddedToProject_ExtendedData() {
        return (EReference) extendedDataAddedToProjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRemoteServiceCalled() {
        return remoteServiceCalledEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRemoteServiceCalled_Service() {
        return (EReference) remoteServiceCalledEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRemoteServiceCalled_State() {
        return (EAttribute) remoteServiceCalledEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRemoteServiceCalled_Percentage() {
        return (EAttribute) remoteServiceCalledEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRemoteServiceCalled_Infos() {
        return (EAttribute) remoteServiceCalledEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRemoteServiceCalled_Warnings() {
        return (EAttribute) remoteServiceCalledEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRemoteServiceCalled_Errors() {
        return (EAttribute) remoteServiceCalledEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAccessMethod() {
        return accessMethodEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogFactory getLogFactory() {
        return (LogFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        logActionEClass = createEClass(LOG_ACTION);
        createEAttribute(logActionEClass, LOG_ACTION__DATE);
        createEReference(logActionEClass, LOG_ACTION__EXECUTOR);
        createEAttribute(logActionEClass, LOG_ACTION__ACCESS_METHOD);

        serverLogEClass = createEClass(SERVER_LOG);
        createEReference(serverLogEClass, SERVER_LOG__ACTIONS);

        projectRelatedEClass = createEClass(PROJECT_RELATED);
        createEReference(projectRelatedEClass, PROJECT_RELATED__PROJECT);

        checkoutRelatedEClass = createEClass(CHECKOUT_RELATED);
        createEReference(checkoutRelatedEClass, CHECKOUT_RELATED__CHECKOUT);

        revisionRelatedEClass = createEClass(REVISION_RELATED);
        createEReference(revisionRelatedEClass, REVISION_RELATED__REVISION);

        userRelatedEClass = createEClass(USER_RELATED);
        createEReference(userRelatedEClass, USER_RELATED__USER);

        newUserAddedEClass = createEClass(NEW_USER_ADDED);

        newProjectAddedEClass = createEClass(NEW_PROJECT_ADDED);
        createEReference(newProjectAddedEClass, NEW_PROJECT_ADDED__PARENT_PROJECT);

        revisionBranchedEClass = createEClass(REVISION_BRANCHED);
        createEReference(revisionBranchedEClass, REVISION_BRANCHED__OLDREVISION);
        createEReference(revisionBranchedEClass, REVISION_BRANCHED__NEWREVISION);

        newRevisionAddedEClass = createEClass(NEW_REVISION_ADDED);
        createEReference(newRevisionAddedEClass, NEW_REVISION_ADDED__PROJECT);

        newCheckoutAddedEClass = createEClass(NEW_CHECKOUT_ADDED);

        settingsSavedEClass = createEClass(SETTINGS_SAVED);

        userAddedToProjectEClass = createEClass(USER_ADDED_TO_PROJECT);
        createEReference(userAddedToProjectEClass, USER_ADDED_TO_PROJECT__PROJECT);

        newObjectIDMUploadedEClass = createEClass(NEW_OBJECT_IDM_UPLOADED);

        downloadEClass = createEClass(DOWNLOAD);

        userRemovedFromProjectEClass = createEClass(USER_REMOVED_FROM_PROJECT);
        createEReference(userRemovedFromProjectEClass, USER_REMOVED_FROM_PROJECT__PROJECT);

        projectDeletedEClass = createEClass(PROJECT_DELETED);

        userDeletedEClass = createEClass(USER_DELETED);

        passwordResetEClass = createEClass(PASSWORD_RESET);

        databaseCreatedEClass = createEClass(DATABASE_CREATED);
        createEAttribute(databaseCreatedEClass, DATABASE_CREATED__PATH);
        createEAttribute(databaseCreatedEClass, DATABASE_CREATED__VERSION);

        serverStartedEClass = createEClass(SERVER_STARTED);

        projectUpdatedEClass = createEClass(PROJECT_UPDATED);

        userUndeletedEClass = createEClass(USER_UNDELETED);

        projectUndeletedEClass = createEClass(PROJECT_UNDELETED);

        revisionUpdatedEClass = createEClass(REVISION_UPDATED);

        geoTagUpdatedEClass = createEClass(GEO_TAG_UPDATED);
        createEReference(geoTagUpdatedEClass, GEO_TAG_UPDATED__GEO_TAG);

        passwordChangedEClass = createEClass(PASSWORD_CHANGED);

        userChangedEClass = createEClass(USER_CHANGED);

        extendedDataAddedToRevisionEClass = createEClass(EXTENDED_DATA_ADDED_TO_REVISION);
        createEReference(extendedDataAddedToRevisionEClass, EXTENDED_DATA_ADDED_TO_REVISION__REVISION);
        createEReference(extendedDataAddedToRevisionEClass, EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA);

        extendedDataAddedToProjectEClass = createEClass(EXTENDED_DATA_ADDED_TO_PROJECT);
        createEReference(extendedDataAddedToProjectEClass, EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT);
        createEReference(extendedDataAddedToProjectEClass, EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA);

        remoteServiceCalledEClass = createEClass(REMOTE_SERVICE_CALLED);
        createEReference(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__SERVICE);
        createEAttribute(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__STATE);
        createEAttribute(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__PERCENTAGE);
        createEAttribute(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__INFOS);
        createEAttribute(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__WARNINGS);
        createEAttribute(remoteServiceCalledEClass, REMOTE_SERVICE_CALLED__ERRORS);

        // Create enums
        accessMethodEEnum = createEEnum(ACCESS_METHOD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        StorePackage theStorePackage = (StorePackage) EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        projectRelatedEClass.getESuperTypes().add(this.getLogAction());
        checkoutRelatedEClass.getESuperTypes().add(this.getLogAction());
        revisionRelatedEClass.getESuperTypes().add(this.getLogAction());
        userRelatedEClass.getESuperTypes().add(this.getLogAction());
        newUserAddedEClass.getESuperTypes().add(this.getUserRelated());
        newProjectAddedEClass.getESuperTypes().add(this.getProjectRelated());
        revisionBranchedEClass.getESuperTypes().add(this.getLogAction());
        newRevisionAddedEClass.getESuperTypes().add(this.getRevisionRelated());
        newCheckoutAddedEClass.getESuperTypes().add(this.getCheckoutRelated());
        settingsSavedEClass.getESuperTypes().add(this.getLogAction());
        userAddedToProjectEClass.getESuperTypes().add(this.getUserRelated());
        newObjectIDMUploadedEClass.getESuperTypes().add(this.getLogAction());
        downloadEClass.getESuperTypes().add(this.getLogAction());
        userRemovedFromProjectEClass.getESuperTypes().add(this.getUserRelated());
        projectDeletedEClass.getESuperTypes().add(this.getProjectRelated());
        userDeletedEClass.getESuperTypes().add(this.getUserRelated());
        passwordResetEClass.getESuperTypes().add(this.getUserRelated());
        databaseCreatedEClass.getESuperTypes().add(this.getLogAction());
        serverStartedEClass.getESuperTypes().add(this.getLogAction());
        projectUpdatedEClass.getESuperTypes().add(this.getProjectRelated());
        userUndeletedEClass.getESuperTypes().add(this.getUserRelated());
        projectUndeletedEClass.getESuperTypes().add(this.getProjectRelated());
        revisionUpdatedEClass.getESuperTypes().add(this.getRevisionRelated());
        geoTagUpdatedEClass.getESuperTypes().add(this.getLogAction());
        passwordChangedEClass.getESuperTypes().add(this.getUserRelated());
        userChangedEClass.getESuperTypes().add(this.getUserRelated());
        extendedDataAddedToRevisionEClass.getESuperTypes().add(this.getLogAction());
        extendedDataAddedToProjectEClass.getESuperTypes().add(this.getLogAction());
        remoteServiceCalledEClass.getESuperTypes().add(this.getLogAction());

        // Initialize classes and features; add operations and parameters
        initEClass(logActionEClass, LogAction.class, "LogAction", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLogAction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, LogAction.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLogAction_Executor(), theStorePackage.getUser(), null, "executor", null, 0, 1,
                LogAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLogAction_AccessMethod(), this.getAccessMethod(), "accessMethod", null, 0, 1, LogAction.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(serverLogEClass, ServerLog.class, "ServerLog", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getServerLog_Actions(), this.getLogAction(), null, "actions", null, 0, -1, ServerLog.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(projectRelatedEClass, ProjectRelated.class, "ProjectRelated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProjectRelated_Project(), theStorePackage.getProject(), theStorePackage.getProject_Logs(),
                "project", null, 0, 1, ProjectRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(checkoutRelatedEClass, CheckoutRelated.class, "CheckoutRelated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCheckoutRelated_Checkout(), theStorePackage.getCheckout(), theStorePackage.getCheckout_Logs(),
                "checkout", null, 0, 1, CheckoutRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(revisionRelatedEClass, RevisionRelated.class, "RevisionRelated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRevisionRelated_Revision(), theStorePackage.getRevision(), theStorePackage.getRevision_Logs(),
                "revision", null, 0, 1, RevisionRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(userRelatedEClass, UserRelated.class, "UserRelated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUserRelated_User(), theStorePackage.getUser(), theStorePackage.getUser_Logs(), "user", null,
                0, 1, UserRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newUserAddedEClass, NewUserAdded.class, "NewUserAdded", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(newProjectAddedEClass, NewProjectAdded.class, "NewProjectAdded", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNewProjectAdded_ParentProject(), theStorePackage.getProject(), null, "parentProject", null, 0,
                1, NewProjectAdded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(revisionBranchedEClass, RevisionBranched.class, "RevisionBranched", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRevisionBranched_Oldrevision(), theStorePackage.getRevision(), null, "oldrevision", null, 0,
                1, RevisionBranched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRevisionBranched_Newrevision(), theStorePackage.getRevision(), null, "newrevision", null, 0,
                1, RevisionBranched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newRevisionAddedEClass, NewRevisionAdded.class, "NewRevisionAdded", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNewRevisionAdded_Project(), theStorePackage.getProject(), null, "project", null, 0, 1,
                NewRevisionAdded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newCheckoutAddedEClass, NewCheckoutAdded.class, "NewCheckoutAdded", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(settingsSavedEClass, SettingsSaved.class, "SettingsSaved", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(userAddedToProjectEClass, UserAddedToProject.class, "UserAddedToProject", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUserAddedToProject_Project(), theStorePackage.getProject(), null, "project", null, 0, 1,
                UserAddedToProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newObjectIDMUploadedEClass, NewObjectIDMUploaded.class, "NewObjectIDMUploaded", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(downloadEClass, Download.class, "Download", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(userRemovedFromProjectEClass, UserRemovedFromProject.class, "UserRemovedFromProject", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUserRemovedFromProject_Project(), theStorePackage.getProject(), null, "project", null, 0, 1,
                UserRemovedFromProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(projectDeletedEClass, ProjectDeleted.class, "ProjectDeleted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(userDeletedEClass, UserDeleted.class, "UserDeleted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(passwordResetEClass, PasswordReset.class, "PasswordReset", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(databaseCreatedEClass, DatabaseCreated.class, "DatabaseCreated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDatabaseCreated_Path(), ecorePackage.getEString(), "path", null, 0, 1, DatabaseCreated.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDatabaseCreated_Version(), ecorePackage.getEIntegerObject(), "version", null, 0, 1,
                DatabaseCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(serverStartedEClass, ServerStarted.class, "ServerStarted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(projectUpdatedEClass, ProjectUpdated.class, "ProjectUpdated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(userUndeletedEClass, UserUndeleted.class, "UserUndeleted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(projectUndeletedEClass, ProjectUndeleted.class, "ProjectUndeleted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(revisionUpdatedEClass, RevisionUpdated.class, "RevisionUpdated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(geoTagUpdatedEClass, GeoTagUpdated.class, "GeoTagUpdated", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGeoTagUpdated_GeoTag(), theStorePackage.getGeoTag(), null, "geoTag", null, 0, 1,
                GeoTagUpdated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(passwordChangedEClass, PasswordChanged.class, "PasswordChanged", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(userChangedEClass, UserChanged.class, "UserChanged", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(extendedDataAddedToRevisionEClass, ExtendedDataAddedToRevision.class, "ExtendedDataAddedToRevision",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtendedDataAddedToRevision_Revision(), theStorePackage.getRevision(), null, "revision", null,
                0, 1, ExtendedDataAddedToRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtendedDataAddedToRevision_ExtendedData(), theStorePackage.getExtendedData(), null,
                "extendedData", null, 0, 1, ExtendedDataAddedToRevision.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendedDataAddedToProjectEClass, ExtendedDataAddedToProject.class, "ExtendedDataAddedToProject",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtendedDataAddedToProject_Project(), theStorePackage.getProject(), null, "project", null, 0,
                1, ExtendedDataAddedToProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtendedDataAddedToProject_ExtendedData(), theStorePackage.getExtendedData(), null,
                "extendedData", null, 0, 1, ExtendedDataAddedToProject.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteServiceCalledEClass, RemoteServiceCalled.class, "RemoteServiceCalled", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRemoteServiceCalled_Service(), theStorePackage.getService(), null, "service", null, 0, 1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteServiceCalled_State(), theStorePackage.getNotifictionResultEnum(), "state", null, 0, 1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteServiceCalled_Percentage(), ecorePackage.getEInt(), "percentage", null, 0, 1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteServiceCalled_Infos(), ecorePackage.getEString(), "infos", null, 0, -1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteServiceCalled_Warnings(), ecorePackage.getEString(), "warnings", null, 0, -1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteServiceCalled_Errors(), ecorePackage.getEString(), "errors", null, 0, -1,
                RemoteServiceCalled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(accessMethodEEnum, AccessMethod.class, "AccessMethod");
        addEEnumLiteral(accessMethodEEnum, AccessMethod.SOAP);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.WEB_INTERFACE);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.INTERNAL);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.REST);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.SYNDICATION);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.JSON);
        addEEnumLiteral(accessMethodEEnum, AccessMethod.PROTOCOL_BUFFERS);

        // Create resource
        createResource(eNS_URI);
    }

} //LogPackageImpl
