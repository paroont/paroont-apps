package com.rsatech.core.db.config;

import com.rsatech.core.db.constant.common.CoreDbConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = {"classpath:db.properties"})
public class CoreDbConfig implements CoreDbConst {

    @Autowired
    private Environment env;

    @Bean
    public DataSource defaultDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(connPropertyValue(DB_CONN_DRIVER_CLASS_NAME));
        dataSource.setUrl(connPropertyValue(DB_CONN_URL));
        dataSource.setUsername(connPropertyValue(DB_CONN_USER));
        dataSource.setPassword(connPropertyValue(DB_CONN_PASSWORD));

        return dataSource;
    }

    private String connPropertyValue(String connName, String prosName) {
        return env.getProperty(DB_CONN_KEY_PREFIX + "." + connName + "." + prosName);
    }

    private String connPropertyValue(String prosName) {
        return connPropertyValue(DB_CONN_NAME_DEFAULT, prosName);
    }


}
