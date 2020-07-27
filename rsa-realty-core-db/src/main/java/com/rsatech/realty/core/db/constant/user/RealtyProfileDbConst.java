package com.rsatech.realty.core.db.constant.user;

import static com.rsatech.core.db.constant.profile.ProfileDbConst.DB_COMMON_COMPANY_PROFILE_COLUMNS;

// Add Only DB SQL Const for User Profile
public interface RealtyProfileDbConst {

    // ====================   Column Constant   =======================
    String DB_REALTY_USER_PROFILE_COLUMN_RERA_ID = "RERA_ID";

    // ====================   Param Constant   =======================


    // ====================   SELECT/INSERT/UPDATE/DELETE Constant   =======================

    String DB_REALTY_USER_PROFILE_SELECT = "SELECT " + DB_COMMON_COMPANY_PROFILE_COLUMNS + ", RERA_ID FROM USER_PROFILE WHERE 1 = 1 ";

}
