package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class College {
    private int id;
    private String name;

    @Autowired
    private Professor professor;

    public College() {
        System.out.println("College created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Professor getProfessor() { return professor; }

    @Override
    public String toString() {
        return "College [id=" + id + ", name=" + name + ", Professor=" + professor + "]";
    }
}