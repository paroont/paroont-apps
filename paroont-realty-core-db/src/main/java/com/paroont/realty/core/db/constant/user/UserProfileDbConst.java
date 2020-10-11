package com.paroont.realty.core.db.constant.user;

import static com.paroont.core.db.constant.profile.CoreProfileDbConst.DB_COMMON_COMPANY_PROFILE_COLUMNS;
import static com.paroont.core.db.constant.profile.CoreProfileDbConst.DB_COMMON_COMPANY_PROFILE_COLUMNS_PARAMS;

// Add Only DB SQL Const for User Profile
public interface UserProfileDbConst {

    // ====================   Column Constant   =======================

    String DB_REALTY_COMPANY_PROFILE_COLUMNS = DB_COMMON_COMPANY_PROFILE_COLUMNS + ", RERA_ID " ;
    String DB_REALTY_COMPANY_PROFILE_COLUMNS_PARAMS = DB_COMMON_COMPANY_PROFILE_COLUMNS_PARAMS + ", :RERA_ID " ;


    // ====================   Param Constant   =======================


    // ====================   SELECT/INSERT/UPDATE/DELETE Constant   =======================

    String DB_REALTY_USER_PROFILE_SELECT = "SELECT USER_ID, " + DB_REALTY_COMPANY_PROFILE_COLUMNS + " FROM USER_PROFILE WHERE 1 = 1 ";
    String DB_REALTY_USER_PROFILE_INSERT = "INSERT INTO USER_PROFILE (" + DB_REALTY_COMPANY_PROFILE_COLUMNS + ") VALUES (" +  DB_REALTY_COMPANY_PROFILE_COLUMNS_PARAMS + ") ";
}
