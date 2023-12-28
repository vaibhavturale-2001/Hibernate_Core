package org.example.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.setEid(34);
        e1.setName("Vaibhav");
        e2.setEid(35);
        e2.setName("Chetan");

        Project p1=new Project();
        Project p2=new Project();

        p1.setPid(111);
        p1.setProjectName("Institute Management System");
        p2.setPid(112);
        p2.setProjectName("Library Management System");

        List<Employee> elist=new ArrayList<>();
        List<Project> plist=new ArrayList<>();

        elist.add(e1);
        elist.add(e2);

        plist.add(p1);
        plist.add(p2);

//        ---
        e1.setProjects(plist);   // all project aasign to e1

        p2.setEmployees(elist);  //all the employee assign to p2

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();
        factory.close();
    }
}
