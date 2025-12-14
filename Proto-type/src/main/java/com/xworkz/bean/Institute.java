package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Institute {
    private int id;
    private String name;

    @Autowired
    private Trainee trainee;

    public Institute() {
        System.out.println("Institute created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Trainee getTrainee() { return trainee; }

    @Override
    public String toString() {
        return "Institute [id=" + id + ", name=" + name + ", Trainee=" + trainee + "]";
    }
}