package com.ltp.hello_spring;

import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.ltp.hello_spring.validation.Age;
import com.ltp.hello_spring.validation.Username;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "First name can't be blank")
    @Size(min = 2, message = "First name is too short")
    private String firstName;
    @NotBlank(message = "Last name can't be blank")
    @Size(min = 2, message = "Last name is too short")
    private String lastName;
    @NotBlank(message = "Username can't be blank")
    @Size(min = 7, message = "Username is too short")
    @Username(message="Please enter a vaild username")
    private String userName;
    @Email(message = "Email is not formatted properly")
    private String email;
    @Past(message = "Date of Birth can't be later than today")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Age(message="User must be 18 years old or older")
    private Date dateOfBirth;
    private String id;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.id = UUID.randomUUID().toString();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public User lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public User userName(String userName) {
        setUserName(userName);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User dateOfBirth(Date dateOfBirth) {
        setDateOfBirth(dateOfBirth);
        return this;
    }

    public User id(String id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        return this.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, email, dateOfBirth, id);
    }

    @Override
    public String toString() {
        return "{" +
                " firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", userName='" + getUserName() + "'" +
                ", email='" + getEmail() + "'" +
                ", dateOfBirth='" + getDateOfBirth() + "'" +
                ", id='" + getId() + "'" +
                "}";
    }

}
