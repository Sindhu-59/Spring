package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gym {
    private int id;
    private String name;

    @Autowired
    private Trainer trainer;

    public Gym() {
        System.out.println("Gym created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Trainer getTrainer() { return trainer; }

    @Override
    public String toString() {
        return "Gym [id=" + id + ", name=" + name + ", Trainer=" + trainer + "]";
    }
}