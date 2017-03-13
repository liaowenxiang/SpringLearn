package com.lwx.springdemo9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/10.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }
}
