package com.sysoiev.spring.hibernate_relations;

import com.sysoiev.spring.hibernate_relations.entity.Detail;
import com.sysoiev.spring.hibernate_relations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
        System.out.println("Done!");
    }
}