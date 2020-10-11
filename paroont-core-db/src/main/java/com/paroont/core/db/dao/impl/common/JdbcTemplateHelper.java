package com.paroont.core.db.dao.impl.common;

import com.paroont.core.db.dao.common.DbCoreResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@Component
public class JdbcTemplateHelper {

    private static final Logger logger = LoggerFactory.getLogger(JdbcTemplateHelper.class);
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    public <T> List<T> findAll(String sql, SqlParameterSource paramSource, RowMapper<T> rowMapper) {
       return jdbcTemplate.query(sql, paramSource, rowMapper);
    }

    public DbCoreResponse save(String sql, SqlParameterSource paramSource) {
        DbCoreResponse response = new DbCoreResponse();
        int dmlCount = jdbcTemplate.update(sql, paramSource);
        response.addDmlCount(dmlCount);
        logger.info("DML_COUNT: {}", dmlCount);
        return response;
    }

    public DbCoreResponse insert(String sql, SqlParameterSource paramSource) {
        return save( sql, paramSource);
    }

    public DbCoreResponse update(String sql, SqlParameterSource paramSource) {
        return save( sql, paramSource);
    }
    public DbCoreResponse delete(String sql, SqlParameterSource paramSource) {
        return save( sql, paramSource);
    }


    public DbCoreResponse insertAndGetKey(String sql, SqlParameterSource paramSource) {
        DbCoreResponse response = new DbCoreResponse();
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int insertCount =  jdbcTemplate.update(sql, paramSource, keyHolder);
        response.addDmlCount(insertCount);
        long key = ((BigInteger) Objects.requireNonNull(keyHolder.getKey())).longValue();
        response.addGeneratedId(key);
        logger.info("INSERT_COUNT: {}, KEY: {}", insertCount, key);
        return response;
    }
}
