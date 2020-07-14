package com.rsatech.realty.web.mw.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rsatech")
public class RealtyWebApp {
    public static void main(String[] args) {
        SpringApplication.run(RealtyWebApp.class, args);
    }
}
