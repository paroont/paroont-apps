package com.paroont.realty.web.mw.controller;

import com.paroont.realty.core.shared.service.user.UserService;
import com.paroont.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    UserService userService;
    @GetMapping("/")
    public String home() {
        logger.info("home request!!!");
        return "Welcome to RSA Realty!!!";
    }



}
