package com.lwx.springdemo.main;

import com.lwx.springdemo.UseFunctionService;
import com.lwx.springdemo.config.Config_1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/2/27.
 */
public class RunUseFunctionService {
    public static void main(String[] args) {
        //直译为 注解配置应用容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config_1.class);//构造参数为配置类
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);//通过容器获取一个对象的实例
        System.out.println(useFunctionService.sayHello("sunday"));
        context.close();
    }
}
