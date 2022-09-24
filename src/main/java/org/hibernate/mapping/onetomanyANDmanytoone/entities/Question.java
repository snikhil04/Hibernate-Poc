package org.hibernate.mapping.onetomanyANDmanytoone.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Question {

    @Id
    private String id;
    private String question;
    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Answer> answer;

    public Question() {
    }

    public Question(String id, String question, List<Answer> answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
