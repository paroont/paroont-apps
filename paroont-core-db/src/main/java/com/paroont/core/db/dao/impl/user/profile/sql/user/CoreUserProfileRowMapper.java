package com.paroont.core.db.dao.impl.user.profile.sql.user;

import com.paroont.core.db.dao.entity.user.CoreUserProfileDo;
import com.paroont.core.db.dao.impl.user.profile.sql.common.UserProfileBaseRowMapper;

public class CoreUserProfileRowMapper extends UserProfileBaseRowMapper<CoreUserProfileDo> {
    @Override
    protected CoreUserProfileDo createData() {
        return new CoreUserProfileDo();
    }
}
