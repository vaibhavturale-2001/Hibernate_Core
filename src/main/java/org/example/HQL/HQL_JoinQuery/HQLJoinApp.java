package org.example.HQL.HQL_JoinQuery;


import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLJoinApp {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
//        HQL Syntax for JION
//         Query q=s.createQuery(query);
       Query q=s.createQuery("");


        tx.commit();
        s.close();
       factory.close();

    }
}
