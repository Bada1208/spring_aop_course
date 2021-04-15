package com.sysoiev.spring.hibernate;

import com.sysoiev.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 5);
            employee.setSalary(400);
            session.getTransaction().commit();
            System.out.println(employee);
        } finally {
            factory.close();
        }
        System.out.println("Done!");
    }
}
