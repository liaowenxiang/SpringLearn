package com.lwx.springdemo8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("hello application event!");
        context.close();
    }
}
