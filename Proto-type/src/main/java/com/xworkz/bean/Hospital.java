package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hospital {
    private int id;
    private String name;

    @Autowired
    private Doctor doctor;

    public Hospital() {
        System.out.println("Hospital created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Doctor getDoctor() { return doctor; }

    @Override
    public String toString() {
        return "Hospital [id=" + id + ", name=" + name + ", Doctor=" + doctor + "]";
    }
}