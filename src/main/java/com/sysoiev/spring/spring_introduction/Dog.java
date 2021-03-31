package com.sysoiev.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    private String name;

    public Dog() {
        System.out.println("Dog is created");
    }

    public String getName() {
        return name;
    }

    public void init(){
        System.out.println("Class dog init method");
    }

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
