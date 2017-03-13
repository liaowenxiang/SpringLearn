package com.lwx.springdemo5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
        Config config = context.getBean(Config.class);
        config.outputResource();
        context.close();
    }
}
