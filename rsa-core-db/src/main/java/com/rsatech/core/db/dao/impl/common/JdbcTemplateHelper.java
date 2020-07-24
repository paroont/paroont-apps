package com.rsatech.core.db.dao.impl.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JdbcTemplateHelper {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    public <T> List<T> findAll(String sql, SqlParameterSource paramSource, RowMapper<T> rowMapper) {
       return jdbcTemplate.query(sql, paramSource, rowMapper);
    }
}
