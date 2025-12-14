package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zoo {
    private int id;
    private String name;

    @Autowired
    private Animal animal;

    public Zoo() {
        System.out.println("Zoo created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Animal getAnimal() { return animal; }

    @Override
    public String toString() {
        return "Zoo [id=" + id + ", name=" + name + ", Animal=" + animal + "]";
    }
}