package com.sysoiev.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person is created");
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

    public void setPet(Pet pet) {
        System.out.println("Pet has been added to person");
        this.pet = pet;
    }
}
