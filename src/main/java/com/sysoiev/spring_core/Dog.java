package com.sysoiev.spring_core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Dog implements Pet{
    private String name;

    public Dog() {
        System.out.println("Dog is created");
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class dog init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class dog destroy method");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("gav gav");
    }
}
