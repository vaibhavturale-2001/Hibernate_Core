package org.example.HQL.HQL_deletedata;


import jakarta.persistence.Query;
import org.example.HQL.HQL_Getdata.MyEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HQLExampleApp {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
//        HQL Syntax Delete
       Query q=s.createQuery("delete from MyEmployee where city='Pune'");

       int r=q.executeUpdate();
       System.out.println("Deleted:");
        System.out.println(r);

        tx.commit();
        s.close();
       factory.close();

    }
}
