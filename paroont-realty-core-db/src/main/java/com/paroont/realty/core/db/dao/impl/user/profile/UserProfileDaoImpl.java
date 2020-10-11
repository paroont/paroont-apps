package com.paroont.realty.core.db.dao.impl.user.profile;

import com.paroont.core.db.dao.common.DbCoreResponse;
import com.paroont.core.db.exception.common.RecordNotFoundException;
import com.paroont.realty.core.db.dao.entity.user.UserProfileAuditDo;
import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import com.paroont.realty.core.db.dao.impl.common.RealtyDaoImpl;
import com.paroont.realty.core.db.dao.impl.user.profile.sql.UserProfileInsertQueryBuilder;
import com.paroont.realty.core.db.dao.impl.user.profile.sql.UserProfileRowMapper;
import com.paroont.realty.core.db.dao.impl.user.profile.sql.UserProfileSelectQueryBuilder;
import com.paroont.realty.core.db.dao.impl.user.profile.sql.UserProfileUpdateQueryBuilder;
import com.paroont.realty.core.db.dao.dao.user.UserProfileDao;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;
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
public class UserProfileDaoImpl extends RealtyDaoImpl<UserProfileDo, Long, UserProfileFilter, UserProfileAuditDo, UserActionDto>
        implements UserProfileDao {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileDaoImpl.class);

    @Override
    public List<UserProfileDo> findAll(UserProfileFilter filter) {
        logger.info("Begin - findAll.");
        UserProfileSelectQueryBuilder queryBuilder = new UserProfileSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String sql = queryBuilder.build();
        List<UserProfileDo> datas = jdbcTemplateHelper.findAll(sql, queryBuilder.getQueryParams(), new UserProfileRowMapper());
        logger.info("End - findAll.");
        return datas;
    }

    @Override
    public UserProfileDo findById(Long id) {
        logger.info("Begin - findById. USER_ID:{}", id);
        long userId = Optional.ofNullable(id).orElse(0L);
        UserProfileFilter filter = new UserProfileFilter();
        filter.setUserId(userId);
        UserProfileDo data = findAll(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findById. USER_ID:{}", id);
        return data;
    }

    @Override
    public UserProfileDo fetchById(Long id) {
        logger.info("Begin - fetchById. USER_ID:{}", id);
        UserProfileDo data = findById(id);
        if (null == data) {
            throw new RecordNotFoundException("User profile doesn't exist for USER_ID:" + id);
        }
        logger.info("End - fetchById. USER_ID:{}", id);
        return data;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long save(UserProfileDo data, UserActionDto action) {
        long userId = data.getUserId();
        logger.info("Begin - save. USER_ID:{}", userId);
        DbCoreResponse response = null;
        int saveCount = 0;

        if (userId > 0) {
            logger.info("Updating user profile for USER_ID:{}.", userId);
            response = update(data, action);
        } else {
            logger.info("Creating new User profile.");
            response = insert(data, action);
            userId = response.generatedId();
        }
        logger.info("End - save. USER_ID:{}", userId);
        return userId;
    }


    private DbCoreResponse update(UserProfileDo data, UserActionDto action) {
        long userId = data.getUserId();
        logger.info("Begin - update. USER_ID:{}", userId);
        UserProfileUpdateQueryBuilder queryBuilder = new UserProfileUpdateQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setOldData(fetchById(userId));
        queryBuilder.setAction(action);
        queryBuilder.build();
        DbCoreResponse response = jdbcTemplateHelper.save(queryBuilder.takeSql(), queryBuilder.getQueryParams());
        logger.info("End - update. USER_ID:{}, UPDATE_COUNT:{}", userId, response.dmlCount());
        return response;
    }

    private DbCoreResponse insert(UserProfileDo data, UserActionDto action) {
        logger.info("Begin - insert.");
        UserProfileInsertQueryBuilder queryBuilder = new UserProfileInsertQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(action);
        queryBuilder.build();
        DbCoreResponse response = jdbcTemplateHelper.insertAndGetKey(queryBuilder.takeSql(), queryBuilder.getQueryParams());
        logger.info("End - insert. USER_ID:{}, INSERT_COUNT:{}", response.generatedId(), response.dmlCount());
        return response;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteById(Long aLong, UserActionDto action) {
        throw new UnsupportedOperationException();
    }

}