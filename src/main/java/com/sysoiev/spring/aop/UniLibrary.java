package com.sysoiev.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book from uni library ");
        System.out.println("---------------------------------");
    }

    public String returnBook() {
        System.out.println("We return a book to the uni library");
        return "War & peace!";
    }

    public void getMagazine() {
        System.out.println("We take a magazine from uni library");
        System.out.println("---------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return a Magazine to the uni library");
        System.out.println("---------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add a Magazine to the uni library");
        System.out.println("---------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We add a book to the uni library");
        System.out.println("---------------------------------");
    }
}
