package org.hibernate.mapping.onetomanyANDmanytoone.entities;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    private String id;
    private String answer;

    @ManyToOne
    private Question question;

    public Answer() {
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(String id, String answer, Question question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

    public Answer(String id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
