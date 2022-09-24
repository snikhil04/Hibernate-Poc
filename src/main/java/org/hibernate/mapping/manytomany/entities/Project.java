package org.hibernate.mapping.manytomany.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Project {

    @Id
    private String id;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public Project() {
    }

    public Project(String id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
