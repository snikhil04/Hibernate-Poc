package org.hibernate.mapping.onetomanyANDmanytoone.service;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.mapping.onetomanyANDmanytoone.entities.*;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Question question = new Question();
        question.setId("ques-1");
        question.setQuestion("What is java ?");

        Answer answer1 = new Answer("ans-1", "Java is Platform Independent.", question);
        Answer answer2 = new Answer("ans-2", "Because of its bytecode feature.", question);
        Answer answer3 = new Answer("ans-3", "We Can compile it once on a machine and run it anywhere.", question);
        List<Answer> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);

        question.setAnswer(answerList);

        session.save(question);
        transaction.commit();


        factory.close();
        session.close();
    }
}