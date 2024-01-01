package org.example.HQL.HQL_Updatedata;


import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExampleApp {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
//        HQL Syntax Update
       Query q=s.createQuery("Update MyEmployee set ename='Shubham',city='Bhandara' where eid=:n");
       q.setParameter("n",12);

       int r=q.executeUpdate();
       System.out.println("Updated:");
        System.out.println(r);

        tx.commit();
        s.close();
       factory.close();

    }
}
