package com.brincandocomspringboot.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;


    @Profile("dev")
    @Bean
    public String testDatabaseConection(){
        System.out.println("DB connetction for DEV - H2");
        System.out.println(driverClassName);
        System.err.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }


    @Profile("prod")
    @Bean
    public String productionDatabaseConection(){
        System.out.println("DB connetction for PROD - MYSQL");
        System.out.println(driverClassName);
        System.err.println(url);
        return "DB Connection to PROD - Production instance";
    }
}
