package org.example.OneToOne_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_One {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory =cfg.buildSessionFactory();

        //creating Question object
        Question que1=new Question();
        que1.setQuestionId(1212);
        que1.setQuestion("What is Java");

        //cerating Answer object
        Answer ans1=new Answer();
        ans1.setAnswerId(343);
        ans1.setAnswer("Java is Programming language");
//        ans1.setQuestion(que1);   //optional
        que1.setAnswer(ans1);

        //creating Question object
        Question que2=new Question();
        que2.setQuestionId(242);
        que2.setQuestion("What is Collection");

       //cerating Answer object
        Answer ans2=new Answer();
        ans2.setAnswerId(344);
        ans2.setAnswer("Predefined API");
//        ans2.setQuestion(que2);   //optional
        que2.setAnswer(ans2);

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(que1);
        session.save(que2);
        session.save(ans1);
        session.save(ans2);
         tx.commit();

//         fetching
        Question q1=(Question)session.get(Question.class,1212);
        System.out.println(q1.getQuestion());
        System.out.println(q1.getAnswer().getAnswer());


        session.close();
        factory.close();
        System.out.println("Successful !!!");

    }
}
