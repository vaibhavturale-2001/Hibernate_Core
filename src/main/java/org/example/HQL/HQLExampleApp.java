package org.example.HQL;


import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HQLExampleApp {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
//        HQL Syntax
//        String query="from MyEmployee";         for fetching all data

        String query="from MyEmployee where city='Pune'";       //for fetching specific city
        Query q=s.createQuery(query);

//        OR setting parameter
//        String query="from MyEmployee where city=:x";
//        q.setParameter("x","Nagpur");

//        Single -(Unique)
//        Multiple -list
       List<MyEmployee> list =(List<MyEmployee>)((org.hibernate.query.Query<?>) q).list();

       for (MyEmployee emp:list ){
           System.out.println(emp.getEname()+":"+emp.getCTC());
       }
        s.close();
       factory.close();

    }
}
