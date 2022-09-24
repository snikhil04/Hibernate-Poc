package org.hibernate.mapping.onetotone.service;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.mapping.onetotone.entities.*;

public class MainApp {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question1 = new Question();
        Answer answer1 = new Answer("ans-1", "Java Is A Programming Language.");
        question1.setAnswer(answer1);
        question1.setId("ques-1");
        question1.setQuestion("what is java ?");

        Question question2 = new Question();
        Answer answer2 = new Answer("ans-2", "Hibernate Is An ORM Framework.");
        question2.setAnswer(answer2);
        question2.setId("ques-2");
        question2.setQuestion("What Is Hibernate.");

        session.save(question1);
        session.save(answer1);
        session.save(question2);
        session.save(answer2);

        transaction.commit();

//        Question firstQuestion = session.get(Question.class, "ques-1");
//        System.out.println(firstQuestion.getQuestion());
//        System.out.println(firstQuestion.getAnswer());

        factory.close();
        session.close();
    }
}