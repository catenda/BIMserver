package org.bimserver.shared.interfaces.async;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
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
 *****************************************************************************/
import java.util.concurrent.ExecutorService;
import org.bimserver.shared.interfaces.ServiceInterface;

public class AsyncServiceInterface {

	private final ExecutorService executorService;
	private final ServiceInterface syncService;

	public AsyncServiceInterface(ServiceInterface syncService, ExecutorService executorService) {
		this.executorService = executorService;
		this.syncService = syncService;
	}

	public interface AddExtendedDataSchemaCallback {
		void success();
		void error(Exception e);
	}
	
	public interface AddExtendedDataToProjectCallback {
		void success();
		void error(Exception e);
	}
	
	public interface AddLocalServiceToProjectCallback {
		void success();
		void error(Exception e);
	}
	
	public interface AddServiceToProjectCallback {
		void success();
		void error(Exception e);
	}
	
	public interface AddUserCallback {
		void success(org.bimserver.interfaces.objects.SUser result);
		void error(Exception e);
	}
	
	public interface AddUserToExtendedDataSchemaCallback {
		void success();
		void error(Exception e);
	}
	
	public interface AddUserToProjectCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	
	public interface ChangeUserTypeCallback {
		void success();
		void error(Exception e);
	}
	
	public interface CheckinCallback {
		void success(java.lang.Long result);
		void error(Exception e);
	}
	
	public interface CheckinFromUrlCallback {
		void success(java.lang.Long result);
		void error(Exception e);
	}
	
	public interface CleanupLongActionCallback {
		void success();
		void error(Exception e);
	}
	
	public interface CompareCallback {
		void success(org.bimserver.interfaces.objects.SCompareResult result);
		void error(Exception e);
	}
	
	public interface DeleteServiceCallback {
		void success();
		void error(Exception e);
	}
	
	public interface DeleteUserCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	
	public interface DownloadCompareResultsCallback {
		void success(java.lang.Long result);
		void error(Exception e);
	}
	
	public interface GetAllAuthorizedUsersOfProjectCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SUser> result);
		void error(Exception e);
	}
	
	public interface GetAllCheckoutsByUserCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SCheckout> result);
		void error(Exception e);
	}
	
	public interface GetAllCheckoutsOfProjectCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SCheckout> result);
		void error(Exception e);
	}
	
	public interface GetAllCheckoutsOfProjectAndSubProjectsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SCheckout> result);
		void error(Exception e);
	}
	
	public interface GetAllCheckoutsOfRevisionCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SCheckout> result);
		void error(Exception e);
	}
	
	public interface GetAllExtendedDataSchemasCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SExtendedDataSchema> result);
		void error(Exception e);
	}
	
	public interface GetAllLocalProfilesCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> result);
		void error(Exception e);
	}
	
	public interface GetAllLocalServiceDescriptorsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SServiceDescriptor> result);
		void error(Exception e);
	}
	
	public interface GetAllNonAuthorizedProjectsOfUserCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProject> result);
		void error(Exception e);
	}
	
	public interface GetAllNonAuthorizedUsersOfProjectCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SUser> result);
		void error(Exception e);
	}
	
	public interface GetAllPrivateProfilesCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> result);
		void error(Exception e);
	}
	
	public interface GetAllPublicProfilesCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> result);
		void error(Exception e);
	}
	
	public interface GetAllReadableProjectsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProject> result);
		void error(Exception e);
	}
	
	public interface GetAllRelatedProjectsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProjectSmall> result);
		void error(Exception e);
	}
	
	public interface GetAllRepositoryExtendedDataSchemasCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SExtendedDataSchema> result);
		void error(Exception e);
	}
	
	public interface GetAllRevisionsByUserCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SRevision> result);
		void error(Exception e);
	}
	
	public interface GetAllServiceDescriptorsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SServiceDescriptor> result);
		void error(Exception e);
	}
	
	public interface GetAllServicesOfProjectCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SService> result);
		void error(Exception e);
	}
	
	public interface GetAllUsersCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SUser> result);
		void error(Exception e);
	}
	
	public interface GetAllWritableProjectsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProject> result);
		void error(Exception e);
	}
	
	public interface GetAvailableClassesCallback {
		void success(java.util.List<java.lang.String> result);
		void error(Exception e);
	}
	
	public interface GetAvailableClassesInRevisionCallback {
		void success(java.util.List<java.lang.String> result);
		void error(Exception e);
	}
	
	public interface GetCheckinWarningsCallback {
		void success(java.util.Set<java.lang.String> result);
		void error(Exception e);
	}
	
	public interface GetCheckoutWarningsCallback {
		void success(java.util.Set<java.lang.String> result);
		void error(Exception e);
	}
	
	public interface GetExtendedDataSchemaFromRepositoryCallback {
		void success(org.bimserver.interfaces.objects.SExtendedDataSchema result);
		void error(Exception e);
	}
	
	public interface GetFileCallback {
		void success(org.bimserver.interfaces.objects.SFile result);
		void error(Exception e);
	}
	
	public interface GetGeoTagCallback {
		void success(org.bimserver.interfaces.objects.SGeoTag result);
		void error(Exception e);
	}
	
	public interface GetOidByGuidCallback {
		void success(java.lang.Long result);
		void error(Exception e);
	}
	
	public interface GetQueryEngineExampleCallback {
		void success(java.lang.String result);
		void error(Exception e);
	}
	
	public interface GetQueryEngineExampleKeysCallback {
		void success(java.util.List<java.lang.String> result);
		void error(Exception e);
	}
	
	public interface GetRevisionSummaryCallback {
		void success(org.bimserver.interfaces.objects.SRevisionSummary result);
		void error(Exception e);
	}
	
	public interface GetServiceCallback {
		void success(org.bimserver.interfaces.objects.SService result);
		void error(Exception e);
	}
	
	public interface GetServiceDescriptorCallback {
		void success(org.bimserver.interfaces.objects.SServiceDescriptor result);
		void error(Exception e);
	}
	
	public interface GetUserByUoidCallback {
		void success(org.bimserver.interfaces.objects.SUser result);
		void error(Exception e);
	}
	
	public interface GetUserByUserNameCallback {
		void success(org.bimserver.interfaces.objects.SUser result);
		void error(Exception e);
	}
	
	public interface GetUserRelatedLogsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SLogAction> result);
		void error(Exception e);
	}
	
	public interface GetUserSettingsCallback {
		void success(org.bimserver.interfaces.objects.SUserSettings result);
		void error(Exception e);
	}
	
	public interface GetUsersProjectsCallback {
		void success(java.util.List<org.bimserver.interfaces.objects.SProject> result);
		void error(Exception e);
	}
	
	public interface RemoveUserFromExtendedDataSchemaCallback {
		void success();
		void error(Exception e);
	}
	
	public interface RemoveUserFromProjectCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	
	public interface SendCompareEmailCallback {
		void success();
		void error(Exception e);
	}
	
	public interface SetRevisionTagCallback {
		void success();
		void error(Exception e);
	}
	
	public interface ShareRevisionCallback {
		void success(java.lang.String result);
		void error(Exception e);
	}
	
	public interface TriggerNewExtendedDataCallback {
		void success();
		void error(Exception e);
	}
	
	public interface TriggerNewRevisionCallback {
		void success();
		void error(Exception e);
	}
	
	public interface UndeleteUserCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	
	public interface UpdateGeoTagCallback {
		void success();
		void error(Exception e);
	}
	
	public interface UpdateProjectCallback {
		void success();
		void error(Exception e);
	}
	
	public interface UpdateRevisionCallback {
		void success();
		void error(Exception e);
	}
	
	public interface UploadFileCallback {
		void success(java.lang.Long result);
		void error(Exception e);
	}
	
	public interface UserHasCheckinRightsCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	
	public interface UserHasRightsCallback {
		void success(java.lang.Boolean result);
		void error(Exception e);
	}
	


	public void addExtendedDataSchema(final org.bimserver.interfaces.objects.SExtendedDataSchema extendedDataSchema, final AddExtendedDataSchemaCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.addExtendedDataSchema(extendedDataSchema);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addExtendedDataToProject(final java.lang.Long poid, final org.bimserver.interfaces.objects.SExtendedData extendedData, final AddExtendedDataToProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.addExtendedDataToProject(poid, extendedData);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addLocalServiceToProject(final java.lang.Long poid, final org.bimserver.interfaces.objects.SService sService, final java.lang.Long internalServiceOid, final AddLocalServiceToProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.addLocalServiceToProject(poid, sService, internalServiceOid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addServiceToProject(final java.lang.Long poid, final org.bimserver.interfaces.objects.SService sService, final AddServiceToProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.addServiceToProject(poid, sService);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addUser(final java.lang.String username, final java.lang.String name, final org.bimserver.interfaces.objects.SUserType type, final java.lang.Boolean selfRegistration, final java.lang.String resetUrl, final AddUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.addUser(username, name, type, selfRegistration, resetUrl));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addUserToExtendedDataSchema(final java.lang.Long uoid, final java.lang.Long edsid, final AddUserToExtendedDataSchemaCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.addUserToExtendedDataSchema(uoid, edsid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void addUserToProject(final java.lang.Long uoid, final java.lang.Long poid, final AddUserToProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.addUserToProject(uoid, poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void changeUserType(final java.lang.Long uoid, final org.bimserver.interfaces.objects.SUserType userType, final ChangeUserTypeCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.changeUserType(uoid, userType);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void checkin(final java.lang.Long poid, final java.lang.String comment, final java.lang.Long deserializerOid, final java.lang.Long fileSize, final java.lang.String fileName, final javax.activation.DataHandler data, final java.lang.Boolean merge, final java.lang.Boolean sync, final CheckinCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.checkin(poid, comment, deserializerOid, fileSize, fileName, data, merge, sync));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void checkinFromUrl(final java.lang.Long poid, final java.lang.String comment, final java.lang.Long deserializerOid, final java.lang.String fileName, final java.lang.String url, final java.lang.Boolean merge, final java.lang.Boolean sync, final CheckinFromUrlCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.checkinFromUrl(poid, comment, deserializerOid, fileName, url, merge, sync));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void cleanupLongAction(final java.lang.Long actionId, final CleanupLongActionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.cleanupLongAction(actionId);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void compare(final java.lang.Long roid1, final java.lang.Long roid2, final org.bimserver.interfaces.objects.SCompareType sCompareType, final java.lang.Long mcid, final CompareCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.compare(roid1, roid2, sCompareType, mcid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void deleteService(final java.lang.Long oid, final DeleteServiceCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.deleteService(oid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void deleteUser(final java.lang.Long uoid, final DeleteUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.deleteUser(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void downloadCompareResults(final java.lang.Long serializerOid, final java.lang.Long roid1, final java.lang.Long roid2, final java.lang.Long mcid, final org.bimserver.interfaces.objects.SCompareType type, final java.lang.Boolean sync, final DownloadCompareResultsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.downloadCompareResults(serializerOid, roid1, roid2, mcid, type, sync));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllAuthorizedUsersOfProject(final java.lang.Long poid, final GetAllAuthorizedUsersOfProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllAuthorizedUsersOfProject(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllCheckoutsByUser(final java.lang.Long uoid, final GetAllCheckoutsByUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllCheckoutsByUser(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllCheckoutsOfProject(final java.lang.Long poid, final GetAllCheckoutsOfProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllCheckoutsOfProject(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllCheckoutsOfProjectAndSubProjects(final java.lang.Long poid, final GetAllCheckoutsOfProjectAndSubProjectsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllCheckoutsOfProjectAndSubProjects(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllCheckoutsOfRevision(final java.lang.Long roid, final GetAllCheckoutsOfRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllCheckoutsOfRevision(roid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllExtendedDataSchemas(final GetAllExtendedDataSchemasCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllExtendedDataSchemas());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllLocalProfiles(final java.lang.String serviceIdentifier, final GetAllLocalProfilesCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllLocalProfiles(serviceIdentifier));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllLocalServiceDescriptors(final GetAllLocalServiceDescriptorsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllLocalServiceDescriptors());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllNonAuthorizedProjectsOfUser(final java.lang.Long uoid, final GetAllNonAuthorizedProjectsOfUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllNonAuthorizedProjectsOfUser(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllNonAuthorizedUsersOfProject(final java.lang.Long poid, final GetAllNonAuthorizedUsersOfProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllNonAuthorizedUsersOfProject(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllPrivateProfiles(final java.lang.String notificationsUrl, final java.lang.String serviceIdentifier, final java.lang.String token, final GetAllPrivateProfilesCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllPrivateProfiles(notificationsUrl, serviceIdentifier, token));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllPublicProfiles(final java.lang.String notificationsUrl, final java.lang.String serviceIdentifier, final GetAllPublicProfilesCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllPublicProfiles(notificationsUrl, serviceIdentifier));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllReadableProjects(final GetAllReadableProjectsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllReadableProjects());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllRelatedProjects(final java.lang.Long poid, final GetAllRelatedProjectsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllRelatedProjects(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllRepositoryExtendedDataSchemas(final GetAllRepositoryExtendedDataSchemasCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllRepositoryExtendedDataSchemas());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllRevisionsByUser(final java.lang.Long uoid, final GetAllRevisionsByUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllRevisionsByUser(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllServiceDescriptors(final GetAllServiceDescriptorsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllServiceDescriptors());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllServicesOfProject(final java.lang.Long poid, final GetAllServicesOfProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllServicesOfProject(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllUsers(final GetAllUsersCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllUsers());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAllWritableProjects(final GetAllWritableProjectsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAllWritableProjects());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAvailableClasses(final GetAvailableClassesCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAvailableClasses());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getAvailableClassesInRevision(final java.lang.Long roid, final GetAvailableClassesInRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getAvailableClassesInRevision(roid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getCheckinWarnings(final java.lang.Long poid, final GetCheckinWarningsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getCheckinWarnings(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getCheckoutWarnings(final java.lang.Long poid, final GetCheckoutWarningsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getCheckoutWarnings(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getExtendedDataSchemaFromRepository(final java.lang.String namespace, final GetExtendedDataSchemaFromRepositoryCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getExtendedDataSchemaFromRepository(namespace));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getFile(final java.lang.Long fileId, final GetFileCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getFile(fileId));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getGeoTag(final java.lang.Long goid, final GetGeoTagCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getGeoTag(goid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getOidByGuid(final java.lang.Long roid, final java.lang.String guid, final GetOidByGuidCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getOidByGuid(roid, guid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getQueryEngineExample(final java.lang.Long qeid, final java.lang.String key, final GetQueryEngineExampleCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getQueryEngineExample(qeid, key));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getQueryEngineExampleKeys(final java.lang.Long qeid, final GetQueryEngineExampleKeysCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getQueryEngineExampleKeys(qeid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getRevisionSummary(final java.lang.Long roid, final GetRevisionSummaryCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getRevisionSummary(roid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getService(final java.lang.Long soid, final GetServiceCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getService(soid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getServiceDescriptor(final java.lang.String url, final GetServiceDescriptorCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getServiceDescriptor(url));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getUserByUoid(final java.lang.Long uoid, final GetUserByUoidCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getUserByUoid(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getUserByUserName(final java.lang.String username, final GetUserByUserNameCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getUserByUserName(username));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getUserRelatedLogs(final java.lang.Long uoid, final GetUserRelatedLogsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getUserRelatedLogs(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getUserSettings(final GetUserSettingsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getUserSettings());
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void getUsersProjects(final java.lang.Long uoid, final GetUsersProjectsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.getUsersProjects(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void removeUserFromExtendedDataSchema(final java.lang.Long uoid, final java.lang.Long edsid, final RemoveUserFromExtendedDataSchemaCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.removeUserFromExtendedDataSchema(uoid, edsid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void removeUserFromProject(final java.lang.Long uoid, final java.lang.Long poid, final RemoveUserFromProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.removeUserFromProject(uoid, poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void sendCompareEmail(final org.bimserver.interfaces.objects.SCompareType sCompareType, final java.lang.Long mcid, final java.lang.Long poid, final java.lang.Long roid1, final java.lang.Long roid2, final java.lang.String address, final SendCompareEmailCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.sendCompareEmail(sCompareType, mcid, poid, roid1, roid2, address);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void setRevisionTag(final java.lang.Long roid, final java.lang.String tag, final SetRevisionTagCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.setRevisionTag(roid, tag);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void shareRevision(final java.lang.Long roid, final ShareRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.shareRevision(roid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void triggerNewExtendedData(final java.lang.Long edid, final TriggerNewExtendedDataCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.triggerNewExtendedData(edid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void triggerNewRevision(final java.lang.Long roid, final java.lang.Long soid, final TriggerNewRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.triggerNewRevision(roid, soid);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void undeleteUser(final java.lang.Long uoid, final UndeleteUserCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.undeleteUser(uoid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void updateGeoTag(final org.bimserver.interfaces.objects.SGeoTag sGeoTag, final UpdateGeoTagCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.updateGeoTag(sGeoTag);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void updateProject(final org.bimserver.interfaces.objects.SProject sProject, final UpdateProjectCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.updateProject(sProject);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void updateRevision(final org.bimserver.interfaces.objects.SRevision sRevision, final UpdateRevisionCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					syncService.updateRevision(sRevision);
					callback.success();
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void uploadFile(final org.bimserver.interfaces.objects.SFile file, final UploadFileCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.uploadFile(file));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void userHasCheckinRights(final java.lang.Long uoid, final java.lang.Long poid, final UserHasCheckinRightsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.userHasCheckinRights(uoid, poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
	public void userHasRights(final java.lang.Long poid, final UserHasRightsCallback callback) {
		executorService.submit(new Runnable(){
			public void run(){
				try {
					callback.success(syncService.userHasRights(poid));
				} catch (Exception e) {
					callback.error(e);
				}
			}
		});
	}
	
}