package com.lwx.springdemo6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/3/1.
 */
@Configuration
@ComponentScan("com.lwx.springdemo6")
public class Config {

    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
