package com.sysoiev.hibernate.basics;

import com.sysoiev.hibernate.basics.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //get all employees
            List<Employee> employeeList = session
                    .createQuery("from Employee where name = 'Elena' and salary > 300")
                    .getResultList();
            for (Employee e : employeeList) {
                System.out.println(e);
            }

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
        System.out.println("Done!");
    }
}
