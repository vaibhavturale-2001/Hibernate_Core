package org.example.Embeddable_Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Embed {
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        StudentEm s1=new StudentEm();
        s1.setName("Ankur");
        s1.setCity("Pune");
        Certificate cert=new Certificate();
        cert.setCourse("Web Dev");
        cert.setDuration("3 month");
        s1.setCert(cert);

        Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(s1);
       tx.commit();
       session.close();
    }
}
