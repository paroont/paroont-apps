package com.paroont.realty.core.db.dao.dao.property;

import com.paroont.realty.core.db.dao.dao.common.RealtyDao;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;


public interface PostPropertyDao extends RealtyDao<PostPropertyDo, Long, PropertyFilter, PostPropertyAuditDo, PropertyActionDto> {

}