//package com.example.sc_back.util;
//
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.ErrorPage;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
////全局配置类--配置跨域请求 前后端耦合后就不用跨域，酌情注释
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    /**
//     * 1. 访问路径
//     * 2. 请求来源
//     * 3. 方法
//     * 4. 允许携带Token
//     * 5. 最大响应时间
//     * @param registry
//     */
//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/**")
//                //!!!
//                .allowedOrigins("http://localhost:8080")
//                .allowedMethods("*")
//                .allowCredentials(true)
//                .maxAge(3600);
//    }
////
////    //    下面说是整合vue+springboot并部署需要的代码，但是我失败了
////    @Bean
////    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
////        return factory -> {
////            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/static/index.html");
////            factory.addErrorPages(error404Page);
////        };
////    }
////    private CorsConfiguration corsConfig() {
////        CorsConfiguration corsConfiguration = new CorsConfiguration();
////    // 请求常用的三种配置，*代表允许所有，当时你也可以自定义属性（比如header只能带什么，只能是post方式等等）
////        corsConfiguration.addAllowedOrigin("*");
////        corsConfiguration.addAllowedHeader("*");
////        corsConfiguration.addAllowedMethod("*");
////        corsConfiguration.setAllowCredentials(true);
////        corsConfiguration.setMaxAge(3600L);
////        return corsConfiguration;
////    }
////
////    @Bean
////    public CorsFilter corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", corsConfig());
////        return new CorsFilter(source);
////    }
//}
