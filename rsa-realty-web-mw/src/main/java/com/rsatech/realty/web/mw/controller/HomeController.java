package com.rsatech.realty.web.mw.controller;

import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.user.UserProfileService;
import com.rsatech.realty.web.mw.main.RealtyWebApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
UserProfileService userProfileService;
    @GetMapping("/")
    public String home() {
        logger.info("home request!!!");
        return "Welcome to RSA Realty!!!";
    }


    @GetMapping("/users/")
    public List<UserProfileDto> findAllUserProfiles() {
        UserProfileFilter filter = new UserProfileFilter();
        return  userProfileService.findAllUserProfiles(filter);
    }
}
