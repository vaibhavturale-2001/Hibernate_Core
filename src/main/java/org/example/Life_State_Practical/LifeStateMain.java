package org.example.Life_State_Practical;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LifeStateMain {
    public static void main(String[] args) {

//        Practical of Hibernate Object State
//        Transient State
//        Persistent State
//        Detached State
//        Removed State
//
        SessionFactory f=new Configuration().configure("config.xml").buildSessionFactory();

//       Creating student Object
        Student s1=new Student();
        s1.setId(10);
        s1.setName("Vaibhav Turale");
        s1.setCity("Warora");
//      Transient State
        Session s=f.openSession();
        Transaction tx=s.beginTransaction();
        s.save(s1);
//      Persistent State         -session, database
        s1.setName("Chetan");    //update

        tx.commit();
        s.close();
//        s1: Detached state
        s1.setName("Suhag");
        f.close();

    }
}
