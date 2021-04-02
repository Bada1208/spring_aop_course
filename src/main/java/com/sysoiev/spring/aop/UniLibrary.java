package com.sysoiev.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(String bookName) {
        System.out.println("We take a book from uni library " + bookName);
    }

    /* public void returnBook() {
         System.out.println("We return a book to the uni library");
     }
 */
    public void getMagazine() {
        System.out.println("We take a magazine from uni library");
    }
}
