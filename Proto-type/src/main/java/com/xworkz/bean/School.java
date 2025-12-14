package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class School {
    private int id;
    private String name;

    @Autowired
    private Teacher teacher;

    public School() {
        System.out.println("School created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Teacher getTeacher() { return teacher; }

    @Override
    public String toString() {
        return "School [id=" + id + ", name=" + name + ", Teacher=" + teacher + "]";
    }
}