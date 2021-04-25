package com.sysoiev.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Vasia", 3, 2.1));
        students.add(new Student("Petia", 2, 2.3));
        students.add(new Student("Galia", 1, 1.9));
    }

    public List<Student> getStudents() {
        System.out.println("getStudents starts:");
        System.out.println(students.get(3));
        System.out.println("list students: ");
        System.out.println(students);
        return students;
    }
}
