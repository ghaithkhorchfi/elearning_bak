package com.example.educIT.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long courseId;
    private String version;
    private String questionText;
    @OneToMany(targetEntity = Choice.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "qc_fk", referencedColumnName = "id")
    private List<Choice> choices;
    private String explanation;




    public Question() {

    }


    public Question(Long id, Long courseId, String version, String questionText, List<Choice> choices, String explanation) {
        this.id = id;
        this.courseId = courseId;
        this.version = version;
        this.questionText = questionText;
        this.choices = choices;
        this.explanation = explanation;
    }


    public Long getId() {
        return id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getVersion() {
        return version;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public String getExplanation() {
        return explanation;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", version='" + version + '\'' +
                ", questionText='" + questionText + '\'' +
                ", choices=" + choices +
                ", explanation='" + explanation + '\'' +
                '}';
    }
}
