package com.sysoiev.spring.hibernate;

import com.sysoiev.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Vasia", "Vasev", "HR", 3000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
        System.out.println("Done!");
    }
}
