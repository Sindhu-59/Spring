package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ResearchLab {
    private int id;
    private String name;

    @Autowired
    private Scientist scientist;

    public ResearchLab() {
        System.out.println("ResearchLab created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Scientist getScientist() { return scientist; }

    @Override
    public String toString() {
        return "ResearchLab [id=" + id + ", name=" + name + ", Scientist=" + scientist + "]";
    }
}