package org.example;

import org.example.entities.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class FetchData {
    public static void main(String[] args) {

        Configuration cf = new Configuration();
        cf.configure();
        SessionFactory factory = cf.buildSessionFactory();
        Session session = factory.openSession();

        User user = session.load(User.class,"user-2");

        session.close();
        factory.close();
    }
}
