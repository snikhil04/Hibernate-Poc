package org.hibernate.mapping.onetotone.entities;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    private String id;
    private String question;
    @OneToOne
    private Answer answer;

    public Question() {
    }

    public Question(String id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
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
