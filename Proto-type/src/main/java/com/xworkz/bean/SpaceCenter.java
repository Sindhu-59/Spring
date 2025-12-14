package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpaceCenter {
    private int id;
    private String name;

    @Autowired
    private Astronaut astronaut;

    public SpaceCenter() {
        System.out.println("SpaceCenter created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Astronaut getAstronaut() { return astronaut; }

    @Override
    public String toString() {
        return "SpaceCenter [id=" + id + ", name=" + name + ", Astronaut=" + astronaut + "]";
    }
}