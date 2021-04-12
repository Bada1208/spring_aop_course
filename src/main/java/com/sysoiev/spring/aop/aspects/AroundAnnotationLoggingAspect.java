package com.sysoiev.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAnnotationLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAspectMethod(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("aroundReturnBookAspectMethod beginning");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }
        System.out.println("aroundReturnBookAspectMethod ending");
        return result;
    }
}
