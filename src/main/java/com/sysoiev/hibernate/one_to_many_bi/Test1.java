package com.sysoiev.hibernate.one_to_many_bi;


import com.sysoiev.hibernate.one_to_many_bi.entity.Department;
import com.sysoiev.hibernate.one_to_many_bi.entity.Employee;
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
          /*  Department department = new Department("Sales", 300, 1000);
            Employee employee1 = new Employee("Zaur", "Zaurov", 400);
            Employee employee2 = new Employee("Ilnar", "Ilnarov", 800);
            Employee employee3 = new Employee("Elena", "Smirnova", 900);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            department.addEmployeeToDepartment(employee3);
            session.save(department);*/

            Department department = session.get(Department.class, 3);
            System.out.println(department);
            System.out.println(department.getEmployeeList());

          /*  Employee employee = session.get(Employee.class, 1);
            session.delete(employee);*/

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}