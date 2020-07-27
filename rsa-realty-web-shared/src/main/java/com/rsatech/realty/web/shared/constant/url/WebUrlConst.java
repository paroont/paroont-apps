package com.rsatech.realty.web.shared.constant.url;

public interface WebUrlConst {

    String URL_REALTY_API_DATA_PREFIX  ="/api/data/realty";

    String URL_REALTY_USER_PROFILE  = URL_REALTY_API_DATA_PREFIX + "/user/profiles";
    String URL_REALTY_USER_PROFILE_ID  = URL_REALTY_USER_PROFILE + "/{userId}";
}
