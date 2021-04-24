package com.sysoiev.spring.hibernate_relations;

import com.sysoiev.spring.hibernate_relations.entity.Detail;
import com.sysoiev.spring.hibernate_relations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
         /*   Employee employee = new Employee("Misha", "Sidorov", "IT", 1000);
            Detail detail = new Detail("Kiev", "67890", "sidr@mail.com");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);*/
            session.beginTransaction();
            // session.save(employee);
            Employee employee = session.get(Employee.class, 2);
            Detail detail = session.get(Detail.class, 2);
            System.out.println(employee.getEmpDetail());
            System.out.println(detail.getEmployee());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}