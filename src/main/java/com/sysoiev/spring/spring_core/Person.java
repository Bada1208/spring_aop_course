package com.sysoiev.spring.spring_core;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;
    //@Value("Ivanov")
    @Value("${person.surname}")
    private String surname;
    //@Value("23")
    @Value("${person.age}")
    private int age;

    /* @Autowired
     public Person(Pet pet) {
         System.out.println("Person is created");
         this.pet = pet;
     }*/
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }


    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void callMyPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Pet has been added to person");
        this.pet = pet;
    }
}
