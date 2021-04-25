package com.sysoiev.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Belka");
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.setName("Strelka");
        System.out.println(dog == dog2);
        System.out.println(dog.getName());
        System.out.println(dog2.getName());
    }
}
