package com.sysoiev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*(String))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice:");
    }

    @Before("execution(public void return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice:");
    }
}
