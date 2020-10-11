package com.paroont.core.db.dao.impl.common;

import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.db.dao.dao.common.CoreDao;
import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.common.CoreDo;
import com.paroont.core.shared.dto.common.CoreActionDto;
import com.paroont.core.shared.filter.common.CoreFilter;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class CoreDaoImpl<D extends CoreDo, ID, F extends CoreFilter, AD extends CoreAuditDo, AN extends CoreActionDto> implements CoreDao<D, ID, F, AD, AN>, CoreDbConst {


    @Autowired
    protected JdbcTemplateHelper jdbcTemplateHelper;
}
