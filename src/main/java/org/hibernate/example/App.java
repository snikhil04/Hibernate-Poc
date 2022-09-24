package org.hibernate.example;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.example.entities.*;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        Configuration cf = new Configuration();
        cf.configure();
        SessionFactory factory = cf.buildSessionFactory();

        User user = new User();
        user.setId("user-2");
        user.setName("Rahul");
        user.setEmail("rahul123@gmail.com");

        Address address = new Address();
        address.setId("id-1");
        address.setRoad("ch bakhtawar");
        address.setStreet("us-colonel-4");

        FileInputStream fis = new FileInputStream("src/main/java/pic.png");
        byte[] arr = new byte[fis.read()];
        address.setImage(arr);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        session.save(address);
        tx.commit();
        session.close();

    }
}