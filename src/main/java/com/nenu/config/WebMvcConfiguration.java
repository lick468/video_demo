//package com.nenu.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@SystemConfiguration
//public class WebMvcConfiguration implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowCredentials(true)
//                .allowedMethods("*")
//                .allowedHeaders("Content-Type")
//                .allowedOrigins(SystemConfiguration.ALLOWORIGINS)
//                .maxAge(SystemConfiguration.ORIGINMAXAGE);
//    }
//}
