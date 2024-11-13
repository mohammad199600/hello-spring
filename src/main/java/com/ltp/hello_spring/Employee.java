package com.ltp.hello_spring;

import java.util.UUID;

public class Employee {
    private String name;
    private int age;
    private String role;
    private String id;

    public Employee() {
         this.id = UUID.randomUUID().toString();
    }
    

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
