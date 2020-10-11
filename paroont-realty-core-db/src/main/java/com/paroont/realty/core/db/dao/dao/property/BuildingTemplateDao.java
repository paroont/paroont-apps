package com.paroont.realty.core.db.dao.dao.property;

import com.paroont.realty.core.db.dao.dao.common.RealtyDao;
import com.paroont.realty.core.db.dao.entity.property.template.BuildingTemplateAuditDo;
import com.paroont.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;


public interface BuildingTemplateDao extends RealtyDao<BuildingTemplateDo, Long, PropertyFilter, BuildingTemplateAuditDo, PropertyActionDto> {

}