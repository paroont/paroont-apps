package com.paroont.realty.core.db.dao.impl.property;

import com.paroont.core.db.dao.common.DbCoreResponse;
import com.paroont.core.db.exception.common.RecordNotFoundException;
import com.paroont.realty.core.db.dao.impl.property.sql.post.PostPropertyInsertQueryBuilder;
import com.paroont.realty.core.db.dao.impl.property.sql.post.PostPropertyRowMapper;
import com.paroont.realty.core.db.dao.impl.property.sql.post.PostPropertySelectQueryBuilder;
import com.paroont.realty.core.db.dao.impl.property.sql.post.PostPropertyUpdateQueryBuilder;
import com.paroont.realty.core.db.dao.dao.property.PostPropertyDao;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.paroont.realty.core.db.dao.impl.common.RealtyDaoImpl;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PostPropertyDaoImpl extends RealtyDaoImpl<PostPropertyDo, Long, PropertyFilter, PostPropertyAuditDo, PropertyActionDto>
        implements PostPropertyDao {
    private static final Logger logger = LoggerFactory.getLogger(PostPropertyDaoImpl.class);

    @Override
    public List<PostPropertyDo> findAll(PropertyFilter filter) {
        logger.info("Begin - findAll.");
        PostPropertySelectQueryBuilder queryBuilder = new PostPropertySelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String sql = queryBuilder.build();
        List<PostPropertyDo> datas = jdbcTemplateHelper.findAll(sql, queryBuilder.getQueryParams(), new PostPropertyRowMapper());
        logger.info("End - findAll.");
        return datas;
    }

    @Override
    public PostPropertyDo findById(Long id) {
        logger.info("Begin - findById. PROPERTY_ID:{}", id);
        long propertyId = Optional.ofNullable(id).orElse(-1L);
        PropertyFilter filter = new PropertyFilter();
        filter.setPropertyId(propertyId);
        PostPropertyDo data = findAll(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findById. PROPERTY_ID:{}", id);
        return data;
    }

    @Override
    public PostPropertyDo fetchById(Long id) {
        logger.info("Begin - fetchById. PROPERTY_ID:{}", id);
        PostPropertyDo data = findById(id);
        if (null == data) {
            throw new RecordNotFoundException("Property doesn't exist for PROPERTY_ID:" + id);
        }
        logger.info("End - fetchById. PROPERTY_ID:{}", id);
        return data;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long save(PostPropertyDo data, PropertyActionDto action) {
        long propertyId = data.getPropertyId();
        logger.info("Begin - save. PROPERTY_ID:{}", propertyId);
        DbCoreResponse response = null;
        int saveCount = 0;

        if (propertyId > 0) {
            logger.info("Updating Post Property for PROPERTY_ID:{}.", propertyId);
            response = update(data, action);
        } else {
            logger.info("Creating new Post Property.");
            response = insert(data, action);
            propertyId = response.generatedId();
        }
        logger.info("End - save. PROPERTY_ID:{}", propertyId);
        return propertyId;
    }


    private DbCoreResponse update(PostPropertyDo data, PropertyActionDto action) {
        long propertyId = data.getPropertyId();
        logger.info("Begin - update. PROPERTY_ID:{}", propertyId);
        PostPropertyUpdateQueryBuilder queryBuilder = new PostPropertyUpdateQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setOldData(fetchById(propertyId));
        queryBuilder.setAction(action);
        queryBuilder.build();
        DbCoreResponse response = jdbcTemplateHelper.save(queryBuilder.takeSql(), queryBuilder.getQueryParams());
        logger.info("End - update. PROPERTY_ID:{}, UPDATE_COUNT:{}", propertyId, response.dmlCount());
        return response;
    }

    private DbCoreResponse insert(PostPropertyDo data, PropertyActionDto action) {
        logger.info("Begin - insert.");
        PostPropertyInsertQueryBuilder queryBuilder = new PostPropertyInsertQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(action);
        queryBuilder.build();
        DbCoreResponse response = jdbcTemplateHelper.insertAndGetKey(queryBuilder.takeSql(), queryBuilder.getQueryParams());
        logger.info("End - insert. USER_ID:{}, INSERT_COUNT:{}", response.generatedId(), response.dmlCount());
        return response;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteById(Long aLong, PropertyActionDto action) {
        throw new UnsupportedOperationException();
    }


}