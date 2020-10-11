package com.rsatech.core.db.constant.rdm;

public interface CoreRdmDbConstant {

    // ====================   Column Constant   =======================

    String DB_RDM_APP_REF_DATA_COLUMN_DATA_ID = "DATA_ID";
    String DB_RDM_APP_REF_DATA_COLUMN_DATA_TYPE = "DATA_TYPE";
    String DB_RDM_APP_REF_DATA_COLUMN_DATA_KEY = "DATA_KEY";
    String DB_RDM_APP_REF_DATA_COLUMN_DATA_VALUE = "DATA_VALUE";

    String DB_RDM_APP_REF_DATA_COLUMNS = " DATA_TYPE, DATA_KEY, DATA_VALUE, GROUP_NAME, SUB_GROUP_NAME, APP_NAME, MODULE_NAME,  STATUS_ID, STATUS_TITLE, CREATED_BY, CREATED_TS, UPDATED_BY, UPDATED_TS  ";

// ====================   RDM Type Constant   =======================

    // ====================   Param Constant   =======================

    String DB_RDM_APP_REF_DATA_COLUMNS_PARAMS = " :DATA_TYPE, :DATA_KEY, :DATA_VALUE, :GROUP_NAME, :SUB_GROUP_NAME, :APP_NAME, :MODULE_NAME,  :STATUS_ID, :STATUS_TITLE, :CREATED_BY, :CREATED_TS, :UPDATED_BY, :UPDATED_TS  ";

    // ====================   SELECT/INSERT/UPDATE/DELETE Constant   =======================

    String DB_RDM_APP_REF_DATA_TABLE = "APP_REF_DATA";
    String DB_RDM_APP_REF_DATA_SELECT = "SELECT DATA_ID, " + DB_RDM_APP_REF_DATA_COLUMNS + " FROM " + DB_RDM_APP_REF_DATA_TABLE + " WHERE 1 = 1 ";


    String DB_RDM_APP_REF_DATA_INSERT = "INSERT INTO " + DB_RDM_APP_REF_DATA_TABLE + " (" + DB_RDM_APP_REF_DATA_COLUMNS + ") VALUES (" +  DB_RDM_APP_REF_DATA_COLUMNS_PARAMS + ") ";

}
