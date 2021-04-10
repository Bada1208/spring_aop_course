package com.sysoiev.spring.aop.aspects;

import com.sysoiev.spring.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice:");
    }

    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
        Student first = students.get(0);
        String name = first.getName();
        first.setName("Mr. " + name);
        System.out.println("afterReturningStudentsLoggingAdvice:");
    }*/

   /* @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAdvice");

    }*/
   @After("execution(* getStudents())")
   public void afterStudentsLoggingAdvice() {
       System.out.println("afterStudentsLoggingAdvice");

   }
}
