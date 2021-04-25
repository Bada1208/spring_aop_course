package com.sysoiev.spring_core;

//@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Miau");
    }
}
