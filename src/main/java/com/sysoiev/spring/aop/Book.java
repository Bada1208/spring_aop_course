package com.sysoiev.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Be tough")
    private String name;

    public String getName() {
        return name;
    }
}
