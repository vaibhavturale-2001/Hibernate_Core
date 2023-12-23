package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData_App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
//        get-student
        Student s1=(Student)session.get(Student.class,1);          //It will return the object or data
        System.out.println(s1);

        Address a1=(Address)session.get(Address.class,1);
        System.out.println(a1.getStreet()+""+a1.getCity()+""+a1.getAddedDate());

        session.close();
        factory.close();

    }
}
