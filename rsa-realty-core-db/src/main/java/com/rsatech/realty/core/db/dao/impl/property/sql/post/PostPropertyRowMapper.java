package com.rsatech.realty.core.db.dao.impl.property.sql.post;

import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostPropertyRowMapper extends PropertyBaseRowMapper<PostPropertyDo> {
    @Override
    protected PostPropertyDo createData() {
        return new PostPropertyDo();
    }

    @Override
    protected void mapData(PostPropertyDo data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);
    }
}
