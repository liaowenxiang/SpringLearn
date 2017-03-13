package com.lwx.springdemo3;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/28.
 */
@Service
public class DemoAnnotationService {
    @Action(name="朱解释拦截的add操作")
    public void add(){}
}
