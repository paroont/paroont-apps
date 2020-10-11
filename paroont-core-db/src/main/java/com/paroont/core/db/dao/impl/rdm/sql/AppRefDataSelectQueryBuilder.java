package com.paroont.core.db.dao.impl.rdm.sql;

import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.db.constant.rdm.CoreRdmDbConstant;
import com.paroont.core.db.dao.impl.common.sql.CoreSelectQueryBuilder;
import com.paroont.core.shared.filter.rdm.AppRefDataFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppRefDataSelectQueryBuilder extends CoreSelectQueryBuilder<AppRefDataFilter> implements CoreDbConst {
    private static final Logger logger = LoggerFactory.getLogger(AppRefDataSelectQueryBuilder.class);


    public AppRefDataSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(CoreRdmDbConstant.DB_RDM_APP_REF_DATA_SELECT);
    }

    @Override
    protected void buildWhereQuery() {

        buildNumberSelectQuery(filter.getDataId(), CoreRdmDbConstant.DB_RDM_APP_REF_DATA_COLUMN_DATA_ID);

        buildStringSelectQuery(filter.getType(), CoreRdmDbConstant.DB_RDM_APP_REF_DATA_COLUMN_DATA_TYPE);
        buildStringSelectQuery(filter.getKey(), CoreRdmDbConstant.DB_RDM_APP_REF_DATA_COLUMN_DATA_KEY);


        buildStringSelectQuery(filter.getGroupName(), DB_COMMON_COLUMN_GROUP_NAME);
        buildStringSelectQuery(filter.getSubGroupName(), DB_COMMON_COLUMN_SUB_GROUP_NAME);


        buildStringSelectQuery(filter.getAppName(), DB_COMMON_COLUMN_APP_NAME);
        buildStringSelectQuery(filter.getModuleName(), DB_COMMON_COLUMN_MODULE_NAME);

        buildNumberSelectQuery(filter.getStatusId(), DB_COMMON_COLUMN_STATUS_ID);

    }

    @Override
    protected void buildOrderByQuery() {
        includeOrderByClause();
        query.append(CoreRdmDbConstant.DB_RDM_APP_REF_DATA_COLUMN_DATA_TYPE);
        query.append(", " + CoreRdmDbConstant.DB_RDM_APP_REF_DATA_COLUMN_DATA_KEY);
    }
}
