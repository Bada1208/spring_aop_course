package com.sysoiev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

   /* @Pointcut("execution(* get*())")
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
    }*/


    @Before("com.sysoiev.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice:");
    }



}
