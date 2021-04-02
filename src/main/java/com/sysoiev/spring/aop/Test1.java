package com.sysoiev.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        uniLibrary.getBook("Be tough");

        context.close();
    }
}
