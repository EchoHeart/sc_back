package com.example.sc_back.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//全局配置类--配置跨域请求 前后端耦合后就不用跨域，酌情注释
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 1. 访问路径
     * 2. 请求来源
     * 3. 方法
     * 4. 允许携带Token
     * 5. 最大响应时间
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                //!!!
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
