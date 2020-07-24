package com.rsatech.realty.core.db.dao.impl.user;

import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileAuditDo;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import com.rsatech.realty.core.db.dao.impl.common.RealtyDaoImpl;
import com.rsatech.realty.core.db.dao.impl.user.sql.UserProfileRowMapper;
import com.rsatech.realty.core.db.dao.impl.user.sql.UserProfileSelectQueryBuilder;
import com.rsatech.realty.core.db.dao.user.UserProfileDao;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.filter.common.RealtyFilter;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  class UserProfileDaoImpl extends RealtyDaoImpl<UserProfileDo, Long, UserProfileFilter, UserProfileAuditDo, RealtyActionDto>
        implements UserProfileDao {


    @Override
    public List<UserProfileDo> findAll(UserProfileFilter filter) {
        UserProfileSelectQueryBuilder queryBuilder = new UserProfileSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String sql = queryBuilder.build();

        return jdbcTemplateHelper.findAll(sql, queryBuilder.getQueryParams(), new UserProfileRowMapper());
    }

    @Override
    public UserProfileDo findById(Long id) {
        return null;
    }

    @Override
    public UserProfileDo fetchById(Long id) {
        return null;
    }

    @Override
    public Long save(UserProfileDo data, RealtyActionDto action) {
        return null;
    }

    @Override
    public void deleteById(Long aLong, RealtyActionDto action) {

    }
}