package com.lwx.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/27.
 */
@Service//将这个类注册为由Spring的IoC管理的Bean
public class UseFunctionService {
    @Autowired//为这对象注入Bean
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(
                word
        );
    }
}
