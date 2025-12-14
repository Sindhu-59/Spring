package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class University {
    private int id;
    private String name;

    @Autowired
    private Student student;

    public University() {
        System.out.println("University created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Student getStudent() { return student; }

    @Override
    public String toString() {
        return "University [id=" + id + ", name=" + name + ", Student=" + student + "]";
    }
}