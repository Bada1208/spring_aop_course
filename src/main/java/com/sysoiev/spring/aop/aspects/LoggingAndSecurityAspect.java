package com.sysoiev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdviceGet() {
        System.out.println("beforeGetLoggingAdviceGet:log get");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeGetLoggingAdviceReturn() {
        System.out.println("beforeGetLoggingAdviceReturn: log return");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: log get and return");
    }
/*
    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice:");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice:");
    }*/

}
