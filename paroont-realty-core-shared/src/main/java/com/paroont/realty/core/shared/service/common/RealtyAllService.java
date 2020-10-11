package com.paroont.realty.core.shared.service.common;

import com.paroont.core.shared.service.rdm.AppRefDataService;
import com.paroont.realty.core.shared.service.property.PropertyService;
import com.paroont.realty.core.shared.service.rdm.RealtyRefDataService;
import com.paroont.realty.core.shared.service.user.UserService;

public interface RealtyAllService  extends RealtyService{
    public UserService getUserService();
    public AppRefDataService getAppRefDataService();
    public RealtyRefDataService getRealtyRefDataService();
    public PropertyService getPropertyService();
}
