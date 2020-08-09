package com.rsatech.realty.core.db.dao.dao.property;

import com.rsatech.realty.core.db.dao.dao.common.RealtyDao;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;


public interface BuildingTemplateDao extends RealtyDao<BuildingTemplateDo, Long, PropertyFilter, BuildingTemplateAuditDo, PropertyActionDto> {

}