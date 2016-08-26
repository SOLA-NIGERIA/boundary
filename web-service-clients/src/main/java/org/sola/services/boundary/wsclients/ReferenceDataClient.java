/**
 * ******************************************************************************************
 * Copyright (C) 2012 - Food and Agriculture Organization of the United Nations (FAO). All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this list of conditions
 * and the following disclaimer. 2. Redistributions in binary form must reproduce the above
 * copyright notice,this list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution. 3. Neither the name of FAO nor the names of its
 * contributors may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.wsclients;

import java.util.List;
import org.sola.services.boundary.wsclients.exception.WebServiceClientException;
import org.sola.webservices.transferobjects.AbstractCodeTO;
import org.sola.webservices.transferobjects.referencedata.*;

/**
 * Interface for the Reference Data Service. Implemented by {@linkplain ReferenceDataClientImpl}. To
 * obtain a reference to the Case Management Service, use {@linkplain WSManager#getReferenceDataService()}
 *
 * @see ReferenceDataClientImpl
 * @see WSManager#getReferenceDataService()
 */
public interface ReferenceDataClient extends AbstractWSClient {

    /**
     * ReferenceData. - Service name prefix for the Reference Data Web Service
     */
    public static final String SERVICE_NAME = "ReferenceData.";
    /**
     * ReferenceData.checkConnection - Identifier for the checkConnection method
     */
    public static final String CHECK_CONNECTION = SERVICE_NAME + "checkConnection";
    /**
     * ReferenceData.getSourceTypes - Identifier for the getSourceTypes method
     */
    public static final String GET_SOURCE_TYPES = SERVICE_NAME + "getSourceTypes";
    /**
     * ReferenceData.getRequestCategoryTypes - Identifier for the getRequestCategoryTypes method
     */
    public static final String GET_REQUEST_CATEGORY_TYPES = SERVICE_NAME + "getRequestCategoryTypes";
    /**
     * ReferenceData.getRequestTypes - Identifier for the getRequestTypes method
     */
    public static final String GET_REQUEST_TYPES = SERVICE_NAME + "getRequestTypes";
    /**
     * ReferenceData.getCommunicationTypes - Identifier for the getCommunicationTypes method
     */
    public static final String GET_COMMUNICATION_TYPES = SERVICE_NAME + "getCommunicationTypes";
    /**
     * ReferenceData.getGenderTypes - Identifier for the getGenderTypes method
     */
    public static final String GET_GENDER_TYPES = SERVICE_NAME + "getGenderTypes";
    /**
     * ReferenceData.getStateTypes - Identifier for the getStateTypes method
     */
    public static final String GET_STATE_TYPES = SERVICE_NAME + "getStateTypes";
    /**
     * ReferenceData.getApplicationStatusTypes - Identifier for the getApplicationStatusTypes method
     */
    public static final String GET_APPLICATION_STATUS_TYPES = SERVICE_NAME + "getApplicationStatusTypes";
    /**
     * ReferenceData.getApplicationActionTypes - Identifier for the getApplicationActionTypes method
     */
    public static final String GET_APPLICATION_ACTION_TYPES = SERVICE_NAME + "getApplicationActionTypes";
    /**
     * ReferenceData.getServiceStatusTypes - Identifier for the getServiceStatusTypes method
     */
    public static final String GET_SERVICE_STATUS_TYPES = SERVICE_NAME + "getServiceStatusTypes";
    /**
     * ReferenceData.getServiceActionTypes - Identifier for the getServiceActionTypes method
     */
    public static final String GET_SERVICE_ACTION_TYPES = SERVICE_NAME + "getServiceActionTypes";
    /**
     * ReferenceData.getPartyTypes - Identifier for the getPartyTypes method
     */
    public static final String GET_PARTY_TYPES = SERVICE_NAME + "getPartyTypes";
    /**
     * ReferenceData.getPartyRoles - Identifier for the getPartyRoles method
     */
    public static final String GET_PARTY_ROLES = SERVICE_NAME + "getPartyRoles";
    /**
     * ReferenceData.getIdTypes - Identifier for the getIdTypes method
     */
    public static final String GET_ID_TYPES = SERVICE_NAME + "getIdTypes";
    /**
     * ReferenceData.getChangeStatusTypes - Identifier for the getChangeStatusTypes method
     */
    public static final String GET_CHANGE_STATUS_TYPES = SERVICE_NAME + "getChangeStatusTypes";
    /**
     * ReferenceData.getBaUnitTypes - Identifier for the getBaUnitTypes method
     */
    public static final String GET_BA_UNIT_TYPES = SERVICE_NAME + "getBaUnitTypes";
    /**
     * ReferenceData.getMortgageTypes - Identifier for the getMortgageTypes method
     */
    public static final String GET_MORTGAGE_TYPES = SERVICE_NAME + "getMortgageTypes";
    /**
     * ReferenceData.getRrrGroupTypes - Identifier for the getRrrGroupTypes method
     */
    public static final String GET_RRR_GROUP_TYPES = SERVICE_NAME + "getRrrGroupTypes";
    /**
     * ReferenceData.getRrrTypes - Identifier for the getRrrTypes method
     */
    public static final String GET_RRR_TYPES = SERVICE_NAME + "getRrrTypes";
    /**
     * ReferenceData.getTypeActions - Identifier for the getTypeActions method
     */
    public static final String GET_TYPE_ACTIONS = SERVICE_NAME + "getTypeActions";
    /**
     * ReferenceData.getSourceBaUnitRelationTypes - Identifier for the getSourceBaUnitRelationTypes
     * method
     */
    public static final String GET_SOURCE_BA_UNIT_RELATION_TYPES = SERVICE_NAME + "getSourceBaUnitRelationTypes";
    /**
     * ReferenceData.getRegistrationStatusTypes - Identifier for the getRegistrationStatusTypes
     * method
     */
    public static final String GET_REGISTRATION_STATUS_TYPES = SERVICE_NAME + "getRegistrationStatusTypes";
    /**
     * ReferenceData.getCadastreObjectTypes - Identifier for the getCadastreObjectTypes method
     */
    public static final String GET_LAND_USE_TYPES = SERVICE_NAME + "getLandUseTypes";
    /**
     * ReferenceData.getCadastreObjectTypes - Identifier for the getCadastreObjectTypes method
     */
    public static final String GET_CADASTRE_OBJECT_TYPES = SERVICE_NAME + "getCadastreObjectTypes";
    /**
     * ReferenceData.saveReferenceData - Identifier for the saveReferenceData method
     */
    public static final String SAVE_REFERENCE_DATA = SERVICE_NAME + "saveReferenceData";
    /**
     * ReferenceData.getBrTechnicalTypes - Identifier for the getBrTechnicalTypes method
     */
    public static final String GET_BR_TECHNICAL_TYPES = SERVICE_NAME + "getBrTechnicalTypes";
    /**
     * ReferenceData.getBrValidationTargetTypes - Identifier for the getBrValidationTargetTypes
     * method
     */
    public static final String GET_BR_VALIDATION_TARGET_TYPES = SERVICE_NAME + "getBrValidationTargetTypes";
    /**
     * ReferenceData.getBrSeverityTypes - Identifier for the getBrSeverityTypes method
     */
    public static final String GET_BR_SEVERITY_TYPES = SERVICE_NAME + "getBrSeverityTypes";
    /**
     * ReferenceData.getBaUnitRelTypes - Identifier for the getBaUnitRelTypes method
     */
    public static final String GET_BA_UNIT_REL_TYPES = SERVICE_NAME + "getBaUnitRelTypes";
    
    public static final String GET_LEASE_CONDITION_TYPES = SERVICE_NAME + "getRrrConditions";

        /**
     * ReferenceData.getHierarchyLevels - Identifier for the getHierarchyLevels method
     */
    public static final String GET_HIERARCHY_LEVELS = SERVICE_NAME + "getHierarchyLevels";

    /**
     * ReferenceData.getCadastreObjectTypes - Identifier for the getCadastreObjectTypes method
     */
    public static final String GET_LGA_TYPES = SERVICE_NAME + "getLgaTypes";
     /**
     * ReferenceData.getCadastreObjectTypes - Identifier for the getCadastreObjectTypes method
     */
    public static final String GET_ZONE_TYPES = SERVICE_NAME + "getZoneTypes";
    
     /**
     * ReferenceData.getMortgageTypes - Identifier for the getMortgageTypes method
     */
    public static final String GET_ROT_TYPES = SERVICE_NAME + "getRotTypes";
    
    List<LgaTypeTO> getLgaTypes() throws WebServiceClientException;

    /**
     * Retrieves all cadastre.land_use_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<LgaTypeTO> getLgaTypes(String lang) throws WebServiceClientException;

   
    List<ZoneTypeTO> getZoneTypes() throws WebServiceClientException;

    /**
     * Retrieves all cadastre.land_use_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ZoneTypeTO> getZoneTypes(String lang) throws WebServiceClientException;
    
    List<RotTypeTO> getRotTypes() throws WebServiceClientException;

    List<RotTypeTO> getRotTypes(String lang) throws WebServiceClientException;
    
    /**
     * Retrieves all source.source_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<SourceTypeTO> getSourceTypes() throws WebServiceClientException;

    /**
     * Retrieves all source.source_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<SourceTypeTO> getSourceTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all application.request_category_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<RequestCategoryTypeTO> getRequestCategoryTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.request_category_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<RequestCategoryTypeTO> getRequestCategoryTypes(String lang) throws WebServiceClientException;

    /*
     * DISPUTE
     */
    /**
     * ReferenceData.getDisputeCategory - Identifier for the getDisputeCategory
     * method
     */
    public static final String GET_DISPUTE_CATEGORY = SERVICE_NAME + "getDisputeCategory";
    /**
     * ReferenceData.getRequestStatus - Identifier for the getRequestStatus
     * method
     */
    public static final String GET_DISPUTE_STATUS = SERVICE_NAME + "getDisputeStatus";
    /**
     * ReferenceData.getDisputeType - Identifier for the getDisputeType method
     */
    public static final String GET_DISPUTE_TYPE = SERVICE_NAME + "getDisputeType";
    
    
    /**
     * ReferenceData.getDisputeType - Identifier for the getDisputeRoleType method
     */
    public static final String GET_DISPUTE_ROLE_TYPE = SERVICE_NAME + "getDisputeRoleType";
    /**
     * ReferenceData.getOtherAuthorities - Identifier for the
     * getOtherAuthorities method
     */
    public static final String GET_OTHER_AUTHORITIES = SERVICE_NAME + "getOtherAuthorities";
  
    public static final String GET_COFO_TYPES = SERVICE_NAME + "getCofoTypes";
    /**
     * Retrieves all application.request_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<RequestTypeTO> getRequestTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.request_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<RequestTypeTO> getRequestTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all party.communication_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<CommunicationTypeTO> getCommunicationTypes() throws WebServiceClientException;

    /**
     * Retrieves all party.communication_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<CommunicationTypeTO> getCommunicationTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all party.gender_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<GenderTypeTO> getGenderTypes() throws WebServiceClientException;

    /**
     * Retrieves all party.gender_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<GenderTypeTO> getGenderTypes(String lang) throws WebServiceClientException;
    
     /**
     * Retrieves all party.state_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<StateTypeTO> getStateTypes() throws WebServiceClientException;

    /**
     * Retrieves all party.state_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<StateTypeTO> getStateTypes(String lang) throws WebServiceClientException;

    
    /**
     * Retrieves all application.application_status_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<ApplicationStatusTypeTO> getApplicationStatusTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.application_status_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ApplicationStatusTypeTO> getApplicationStatusTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all application.application_action_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<ApplicationActionTypeTO> getApplicationActionTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.application_action_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ApplicationActionTypeTO> getApplicationActionTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all application.service_status_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<ServiceStatusTypeTO> getServiceStatusTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.service_status_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ServiceStatusTypeTO> getServiceStatusTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all application.service_action_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<ServiceActionTypeTO> getServiceActionTypes() throws WebServiceClientException;

    /**
     * Retrieves all application.service_action_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ServiceActionTypeTO> getServiceActionTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all party.party_type code values using the default locale of the client to localize
     * the display values.
     *
     * @throws WebServiceClientException
     */
    List<PartyTypeTO> getPartyTypes() throws WebServiceClientException;

    /**
     * Retrieves all party.party_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<PartyTypeTO> getPartyTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all party.party_role code values using the default locale of the client to localize
     * the display values.
     *
     * @throws WebServiceClientException
     */
    List<PartyRoleTypeTO> getPartyRoles() throws WebServiceClientException;

    /**
     * Retrieves all party.party_role code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<PartyRoleTypeTO> getPartyRoles(String lang) throws WebServiceClientException;

    /**
     * Retrieves all party.id_type code values using the default locale of the client to localize
     * the display values.
     *
     * @throws WebServiceClientException
     */
    List<IdTypeTO> getIdTypes() throws WebServiceClientException;

    /**
     * Retrieves all party.id_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<IdTypeTO> getIdTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all transaction.change_status_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<ChangeStatusTypeTO> getChangeStatusTypes() throws WebServiceClientException;

    /**
     * Retrieves all transaction.change_status_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<ChangeStatusTypeTO> getChangeStatusTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.ba_unit_type code values using the default locale of the client
     * to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<BaUnitTypeTO> getBaUnitTypes() throws WebServiceClientException;

    /**
     * Retrieves all administrative.ba_unit_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<BaUnitTypeTO> getBaUnitTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.mortgage_type code values using the default locale of the client
     * to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<MortgageTypeTO> getMortgageTypes() throws WebServiceClientException;

    /**
     * Retrieves all administrative.mortgage_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<MortgageTypeTO> getMortgageTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.rrr_group_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<RrrGroupTypeTO> getRrrGroupTypes() throws WebServiceClientException;

    /**
     * Retrieves all administrative.rrr_group_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<RrrGroupTypeTO> getRrrGroupTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.rrr_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<RrrTypeTO> getRrrTypes() throws WebServiceClientException;

    /**
     * Retrieves all administrative.rrr_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<RrrTypeTO> getRrrTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all application.type_action code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<TypeActionTO> getTypeActions() throws WebServiceClientException;

    /**
     * Retrieves all application.type_action code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<TypeActionTO> getTypeActions(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.source_ba_unit_rel_type code values using the default locale of
     * the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<SourceBaUnitRelationTypeTO> getSourceBaUnitRelationTypes()
            throws WebServiceClientException;

    /**
     * Retrieves all administrative.source_ba_unit_rel_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<SourceBaUnitRelationTypeTO> getSourceBaUnitRelationTypes(String lang)
            throws WebServiceClientException;

    /**
     * Retrieves all transaction.reg_status_type code values using the default locale of the client
     * to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<RegistrationStatusTypeTO> getRegistrationStatusTypes() throws WebServiceClientException;

    /**
     * Retrieves all transaction.reg_status_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<RegistrationStatusTypeTO> getRegistrationStatusTypes(String lang) throws WebServiceClientException;
    
    /**
     * Retrieves all cadastre.land_use_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<LandUseTypeTO> getLandUseTypes() throws WebServiceClientException;

    /**
     * Retrieves all cadastre.land_use_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<LandUseTypeTO> getLandUseTypes(String lang) throws WebServiceClientException;

   
    
    /**
     * Retrieves all cadastre.cadastre_object_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<CadastreObjectTypeTO> getCadastreObjectTypes() throws WebServiceClientException;

    /**
     * Retrieves all cadastre.cadastre_object_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<CadastreObjectTypeTO> getCadastreObjectTypes(String lang) throws WebServiceClientException;

    /**
     * Supports saving of all SOLA Reference Data types. <p>Requires the {@linkplain RolesConstants#ADMIN_MANAGE_REFDATA}
     * role.</p>
     *
     * @param refDataTO The refernce data type to save. Must extend {@linkplain AbstractCodeTO}.
     * @throws WebServiceClientException
     */
    AbstractCodeTO saveReferenceData(AbstractCodeTO refDataTO) throws WebServiceClientException;

    /**
     * Retrieves all system.br_technical_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<BrTechnicalTypeTO> getBrTechnicalTypes() throws WebServiceClientException;

    /**
     * Retrieves all system.br_technical_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<BrTechnicalTypeTO> getBrTechnicalTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all system.br_validation_target_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<BrValidationTargetTypeTO> getBrValidationTargetTypes() throws WebServiceClientException;

    /**
     * Retrieves all system.br_validation_target_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<BrValidationTargetTypeTO> getBrValidationTargetTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all system.br_severity_type code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<BrSeverityTypeTO> getBrSeverityTypes() throws WebServiceClientException;

    /**
     * Retrieves all system.br_serverity_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<BrSeverityTypeTO> getBrSeverityTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.ba_unit_rel_type code values using the default locale of the
     * client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<BaUnitRelTypeTO> getBaUnitRelTypes(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.ba_unit_rel_type code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<BaUnitRelTypeTO> getBaUnitRelTypes() throws WebServiceClientException;
    
    List<RrrConditionTO> getRrrConditions() throws WebServiceClientException;
    
    List<RrrConditionTO> getRrrConditions(String lang) throws WebServiceClientException;

    /**
     * Retrieves all cadastre.hierarchy_level code values using the default locale of the client to
     * localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<HierarchyLevelTO> getHierarchyLevels() throws WebServiceClientException;

    /**
     * Retrieves all cadastre.hierarchy_level code values.
     *
     * @param languageCode The language code to use for localization of display values.
     * @throws WebServiceClientException
     */
    List<HierarchyLevelTO> getHierarchyLevels(String lang) throws WebServiceClientException;   
    /*
     * DISPUTE
     */
   
    /**
     * Retrieves all administrative.disputeCategory code values using the
     * default locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeCategoryTO> getDisputeCategory() throws WebServiceClientException;

    /**
     * Retrieves all administrative.disputeCategory code values using the
     * default locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeCategoryTO> getDisputeCategory(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.disputeStatus code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeStatusTO> getDisputeStatus() throws WebServiceClientException;

    /**
     * Retrieves all administrative.disputeStatus code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeStatusTO> getDisputeStatus(String lang) throws WebServiceClientException;

    /**
     * Retrieves all administrative.disputeType code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeTypeTO> getDisputeType() throws WebServiceClientException;
     /**
     * Retrieves all administrative.disputeType code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeTypeTO> getDisputeType(String lang) throws WebServiceClientException;
       /**
     * Retrieves all administrative.disputeRoleType code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeRoleTypeTO> getDisputeRoleType() throws WebServiceClientException;
     
     /**
     * Retrieves all administrative.disputeRoleType code values using the default
     * locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<DisputeRoleTypeTO> getDisputeRoleType(String lang) throws WebServiceClientException;
    
   
    /**
     * Retrieves all administrative.otherAuthorities code values using the
     * default locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<OtherAuthoritiesTO> getOtherAuthorities() throws WebServiceClientException;

    /**
     * Retrieves all administrative.otherAuthorities code values using the
     * default locale of the client to localize the display values.
     *
     * @throws WebServiceClientException
     */
    List<OtherAuthoritiesTO> getOtherAuthorities(String lang) throws WebServiceClientException;

    List<CofoTypeTO> getCofoTypes() throws WebServiceClientException;

    List<CofoTypeTO> getCofoTypes(String lang) throws WebServiceClientException;
}
