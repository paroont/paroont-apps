package com.rsatech.realty.web.shared.constant.url;

public interface WebUrlConst {

    String URL_REALTY_API_DATA_PREFIX  ="/api/data/realty";
    String URL_REALTY_RDM_API_DATA_PREFIX  =URL_REALTY_API_DATA_PREFIX + "/rdm";

    String URL_REALTY_RDM_PROPERTY_API_DATA_PREFIX  =URL_REALTY_RDM_API_DATA_PREFIX + "/property";
    String URL_REALTY_RDM_COMMON_API_DATA_PREFIX  =URL_REALTY_RDM_API_DATA_PREFIX + "/common";


    // User Profile
    String URL_REALTY_USER_PROFILE  = URL_REALTY_API_DATA_PREFIX + "/user/profiles";
    String URL_REALTY_USER_PROFILE_ID  = URL_REALTY_USER_PROFILE + "/{userId}";

    //RDM Common
    String URL_REALTY_RDM_COMMON_CONTACT_TYPE  = URL_REALTY_RDM_COMMON_API_DATA_PREFIX + "/contact-types";
    String URL_REALTY_RDM_COMMON_STATUS_TYPE  = URL_REALTY_RDM_COMMON_API_DATA_PREFIX + "/status-types";

    //RDM Property
    String URL_REALTY_RDM_PROPERTY_TYPE  = URL_REALTY_RDM_PROPERTY_API_DATA_PREFIX + "/types";
    String URL_REALTY_RDM_PROPERTY_TYPE_GROUP  = URL_REALTY_RDM_PROPERTY_API_DATA_PREFIX + "/type-groups";
    String URL_REALTY_RDM_PROPERTY_FURNISH_TYPE = URL_REALTY_RDM_PROPERTY_API_DATA_PREFIX + "/furnish-types";


    //Property


    String URL_REALTY_PROPERTY  = URL_REALTY_API_DATA_PREFIX + "/properties";
    String URL_REALTY_PROPERTY_ID  = URL_REALTY_PROPERTY + "/{propertyId}";


}
