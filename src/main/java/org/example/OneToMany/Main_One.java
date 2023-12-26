package org.example.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main_One {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory =cfg.buildSessionFactory();

        // creating Question object
        Question que1=new Question();
        que1.setQuestionId(1212);
        que1.setQuestion("What is Java");

       //cerating Answer object
        Answer ans1=new Answer();
        ans1.setAnswerId(343);
        ans1.setAnswer("Java is Programming language");
        ans1.setQuestion(que1);          //ans of Que 1

        Answer ans2=new Answer();
        ans2.setAnswerId(344);
        ans2.setAnswer("With help of Java we can build Web Application");
        ans2.setQuestion(que1);          //ans of Que 1

        Answer ans3=new Answer();
        ans3.setAnswerId(345);
        ans3.setAnswer("With help of Java we can build Software");
        ans3.setQuestion(que1);        //ans of Que 1

        List<Answer> answerList=new ArrayList<>();
         answerList.add(ans1);
         answerList.add(ans2);
         answerList.add(ans3);

         que1.setAnswerList(answerList);    //adding all answer to the one que


        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(que1);
        session.save(ans1);
        session.save(ans2);
        session.save(ans3);

//        fetch

//       Question que=(Question) session.get(Question.class,1212);
//        System.out.println(que.getQuestion());
//        for(Answer a: que.getAnswerList()){
//            System.out.println(a.getAnswer());
//        }
        tx.commit();
        session.close();
        factory.close();
        System.out.println("Successful !!!");

    }
}
