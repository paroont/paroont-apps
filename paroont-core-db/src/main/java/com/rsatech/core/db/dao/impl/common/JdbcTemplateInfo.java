package com.rsatech.core.db.dao.impl.common;

import com.rsatech.core.db.dao.entity.common.CoreDo;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JdbcTemplateInfo<T extends CoreDo> {

    private SqlParameterSource paramSource;
    private String sql;
    private RowMapper<T> rowMapper;


}
