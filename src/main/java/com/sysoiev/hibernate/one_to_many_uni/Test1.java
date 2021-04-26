package com.sysoiev.hibernate.one_to_many_uni;


import com.sysoiev.hibernate.one_to_many_uni.entity.Department;
import com.sysoiev.hibernate.one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = new Department("HR", 500, 1500);
            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
            Employee employee2 = new Employee("Ivan", "Sidorov", 1500);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            session.save(department);
         /*   Employee employee = session.get(Employee.class, 1);
            session.delete(employee);*/

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}