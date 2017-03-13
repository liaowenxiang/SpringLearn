package com.lwx.springdemo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);
        System.out.println(demoSingletonService1==demoSingletonService2);
        System.out.println(demoPrototypeService1==demoPrototypeService2);
    }
}
