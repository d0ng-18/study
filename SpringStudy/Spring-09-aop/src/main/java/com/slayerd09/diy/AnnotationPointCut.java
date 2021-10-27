package com.slayerd09.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.slayerd09.service.impl.TestServiceImpl.*(..))")
    public void beforeMethod(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.slayerd09.service.impl.TestServiceImpl.*(..))")
    public void afterMethod(){
        System.out.println("方法执行后");
    }
}
