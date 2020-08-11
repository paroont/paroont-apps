package com.rsatech.realty.core.db.dao.impl.property.sql.post;

import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseInsertQueryBuilder;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostPropertyInsertQueryBuilder extends PropertyBaseInsertQueryBuilder<PostPropertyDo, PostPropertyAuditDo, PropertyActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(PostPropertyInsertQueryBuilder.class);


    public PostPropertyInsertQueryBuilder() {

    }


    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();
        //queryParams.addValue(DB_REALTY_COMMON_COLUMN_RERA_ID, data.getReraId());

    }


    protected void buildInsertClause() {
        query.append(DB_REALTY_POST_PROPERTY_INSERT);
    }


}
