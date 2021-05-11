package com.example.sc_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@MapperScan("com.example.sc_back.dao")
@SpringBootApplication
public class ScBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScBackApplication.class, args);
    }

}
