package com.rsatech.core.db.dao.impl.common;

import com.rsatech.core.db.constant.common.CoreDbConst;
import com.rsatech.core.db.dao.common.CoreDao;
import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.core.shared.dto.common.CoreActionDto;
import com.rsatech.core.shared.filter.common.CoreFilter;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class CoreDaoImpl<D extends CoreDo, ID, F extends CoreFilter, AD extends CoreAuditDo, AN extends CoreActionDto> implements CoreDao<D, ID, F, AD, AN> , CoreDbConst {


    @Autowired
    protected JdbcTemplateHelper jdbcTemplateHelper;
}
