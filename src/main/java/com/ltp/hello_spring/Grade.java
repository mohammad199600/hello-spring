package com.ltp.hello_spring;

import java.util.UUID;

import com.ltp.hello_spring.validation.Score;

import jakarta.validation.constraints.*;

public class Grade {
    @NotBlank(message = "Name can't be blank")
    private String name;
    @NotBlank(message = "Subject can't be blank")
    private String subject;
    @Score(message="Please enter a vaild score")
    private String score;
    private String id;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.id = UUID.randomUUID().toString();
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", subject='" + getSubject() + "'" +
                ", score='" + getScore() + "'" +
                "}";
    }

}
