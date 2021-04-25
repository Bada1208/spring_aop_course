package com.sysoiev.aop.aspects;

import com.sysoiev.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("com.sysoiev.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object o : arguments) {
                if (o instanceof Book) {
                    Book myBook = (Book) o;
                    System.out.println("Book info: " + myBook.getName() + ", " + myBook.getAuthor() + ", " + myBook.getYearOfPublication());
                } else if (o instanceof String) {
                    System.out.println("book add : " + o);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice:");
    }


}
