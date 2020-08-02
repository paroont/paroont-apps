package com.rsatech.realty.core.shared.service.common;

import com.rsatech.core.shared.service.rdm.AppRefDataService;
import com.rsatech.realty.core.shared.service.rdm.RealtyRefDataService;
import com.rsatech.realty.core.shared.service.user.UserService;

public interface RealtyAllService  extends RealtyService{
    public UserService getUserService();
    public AppRefDataService getAppRefDataService();
    public RealtyRefDataService getRealtyRefDataService();
}
