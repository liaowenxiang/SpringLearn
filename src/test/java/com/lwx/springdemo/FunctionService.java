package com.lwx.springdemo;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/27.
 */
@Service//将这个类注册为Bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word +"!";
    }
}
