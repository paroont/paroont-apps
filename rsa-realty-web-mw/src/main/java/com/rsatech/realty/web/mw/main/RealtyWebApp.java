package com.rsatech.realty.web.mw.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rsatech")
public class RealtyWebApp {
    private static final Logger logger = LoggerFactory.getLogger(RealtyWebApp.class);
    public static void main(String[] args) {
        logger.info("Starting RealtyWebApp!!!");
        SpringApplication.run(RealtyWebApp.class, args);
    }
}
