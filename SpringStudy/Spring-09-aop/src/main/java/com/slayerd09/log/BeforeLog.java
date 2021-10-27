package com.slayerd09.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName()+"执行前输出日志：准备执行"+method.getName()+"方法");
    }
}
