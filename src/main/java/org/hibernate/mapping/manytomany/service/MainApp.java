package org.hibernate.mapping.manytomany.service;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.mapping.manytomany.entities.*;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee1 = new Employee();
        employee1.setId("emp-1");
        employee1.setName("emp1");

        Employee employee2 = new Employee();
        employee2.setId("emp-2");
        employee2.setName("emp2");

        Project project1 = new Project();
        project1.setId("project-1");
        project1.setName("project1");

        Project project2 = new Project();
        project2.setId("project-2");
        project2.setName("project2");


        employee1.setProjects(List.of(project1,project2));
        employee2.setProjects(List.of(project1));

        session.save(employee1);
//        session.save(project1);
        session.save(employee2);
//        session.save(project2);

        transaction.commit();
        factory.close();
        session.close();
    }
}