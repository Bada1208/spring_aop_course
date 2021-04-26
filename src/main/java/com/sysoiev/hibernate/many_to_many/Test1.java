package com.sysoiev.hibernate.many_to_many;

import com.sysoiev.hibernate.many_to_many.entity.Child;
import com.sysoiev.hibernate.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        try (Session session = factory.getCurrentSession()) {
           /* Section section1 = new Section("Football");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Painting");
            Child child1 = new Child("Vanya", 7);
            Child child2 = new Child("Egor", 9);
            Child child3 = new Child("Olesia", 8);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section2.addChildToSection(child3);
            section3.addChildToSection(child3);
            section3.addChildToSection(child1);*/
            session.beginTransaction();
           /* session.save(section1);
            session.save(section2);
            session.save(section3);
            session.save(child1);
            session.save(child2);
            session.save(child3);*/
            //Section section = session.get(Section.class, 4);
            Child child = session.get(Child.class, 4);
            session.delete(child);
            session.getTransaction().commit();
            System.out.println("Done!!!))");
        }


    }
}
