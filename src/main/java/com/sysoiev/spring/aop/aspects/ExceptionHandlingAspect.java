package com.sysoiev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.sysoiev.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeExceptionHandlingAdvice(){
        System.out.println("beforeExceptionHandlingAdvice: log exception");
    }
}
