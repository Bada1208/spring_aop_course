package com.sysoiev.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

   /* @Autowired
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }*/

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
