package com.lwx.springdemo13;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/13.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
