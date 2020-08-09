package com.rsatech.realty.core.mw.service.impl.common;

import com.rsatech.core.shared.service.rdm.AppRefDataService;
import com.rsatech.realty.core.shared.service.common.RealtyAllService;
import com.rsatech.realty.core.shared.service.property.PropertyService;
import com.rsatech.realty.core.shared.service.rdm.RealtyRefDataService;
import com.rsatech.realty.core.shared.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealtyAllServiceImpl extends RealtyServiceImpl implements RealtyAllService {

    @Autowired
    private UserService userService;

    @Autowired
    private AppRefDataService appRefDataService;

    @Autowired
    private RealtyRefDataService realtyRefDataService;

    @Autowired
    private PropertyService propertyService;

    public UserService getUserService() {
        return userService;
    }

    public AppRefDataService getAppRefDataService() {
        return appRefDataService;
    }

    public RealtyRefDataService getRealtyRefDataService() {
        return realtyRefDataService;
    }

    public PropertyService getPropertyService() {
        return propertyService;
    }
}
