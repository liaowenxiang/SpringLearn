package com.lwx.springdemo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/28.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.lwx.springdemo3.Action)")
    /**
     * @author 作者:leo 
     * @date 创建时间：2017/2/28 12:11
     */
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }



    @Before("execution(* com.lwx.springdemo3.DemoMethodService.*(..))")//第一个*后必须有空格
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法声明拦截，"+method.getName());
    }
}
