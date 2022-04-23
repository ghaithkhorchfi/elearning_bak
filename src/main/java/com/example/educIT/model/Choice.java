package com.example.educIT.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Choice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String text;
    private Boolean correct;

    public Choice() {

    }


    public Choice(Long id, String text, Boolean correct) {
        this.id = id;
        this.text = text;
        this.correct = correct;
    }


    public Long getChoiceId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Boolean getCorrect() {
        return correct;
    }


    public void setChoiceId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }


    @Override
    public String toString() {
        return "Choice{" +
                "choiceId=" + id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                '}';
    }

}
