package org.example;


import org.example.Address;
import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App_InsertData_Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello world! Vaibhav");
        //It is a type of connection and also type of object  and also sessionFactory is interface
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
//        ORRRRRRR  below shortcut
//        SessionFactory factory1=new Configuration().configure("config.xml").buildSessionFactory();

//        Creating student
        Student s1=new Student();
        s1.setId(1);
        s1.setName("Vaibhav");
        s1.setCity("Nagpur");
        System.out.println(s1);

//       Session session= factory.openSession();   //session use for .save() method and all for CRUD
//       Transaction tx= session.beginTransaction();         //transaction start to save the data
//        session.save(s1);                //It save the object or data
//        tx.commit();                    //It is used for doing pysically changes in database
//        session.close();              //for close thr connection

//   ----------------------------------------------------------------------------------------------
//    CTREATING OBJECT OF ADDRESS
        Address a1=new Address();
        a1.setStreet("Street2");
        a1.setCity("Warora2");
        a1.setOpen(true);
        a1.setAddedDate(new Date());
        a1.setX(123.4);

//        For Reading Image
            FileInputStream fis=new FileInputStream("vaibha.png");
            byte[] data=new byte[fis.available()];
            fis.read(data);
            a1.setImage(data);

        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(s1);
        session.save(a1);
        tx.commit();
        session.close();
        System.out.println("Done !!!");

    }
}