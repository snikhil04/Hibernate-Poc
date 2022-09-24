package org.hibernate.mapping.manytomany.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Employee {

    @Id
    private String id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employeeProject",joinColumns = {@JoinColumn(name = "empId")}, inverseJoinColumns = {@JoinColumn(name = "projectId")})
    private List<Project> projects;

    public Employee() {
    }

    public Employee(String id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
