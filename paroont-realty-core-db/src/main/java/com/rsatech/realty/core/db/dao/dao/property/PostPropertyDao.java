package com.rsatech.realty.core.db.dao.dao.property;

import com.rsatech.realty.core.db.dao.dao.common.RealtyDao;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;


public interface PostPropertyDao extends RealtyDao<PostPropertyDo, Long, PropertyFilter, PostPropertyAuditDo, PropertyActionDto> {

}