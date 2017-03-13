package com.lwx.springdemo3;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/2/28.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
