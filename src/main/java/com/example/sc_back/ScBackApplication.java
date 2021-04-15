package com.example.sc_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.sc_back.dao")
@SpringBootApplication
public class ScBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScBackApplication.class, args);
    }
}
