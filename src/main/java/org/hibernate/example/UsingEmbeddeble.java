package org.hibernate.example;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.example.entities.*;

public class UsingEmbeddeble {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setCertificate(new Certificate("java","2 months"));
        user.setId("user-3");
        user.setName("Admin User");
        user.setEmail("admin123@gmail.com");

        session.save(user);

        transaction.commit();
        factory.close();
        session.close();
    }
}
