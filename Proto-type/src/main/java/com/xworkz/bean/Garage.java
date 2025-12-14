package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Garage {
    private int id;
    private String name;

    @Autowired
    private Mechanic mechanic;

    public Garage() {
        System.out.println("Garage created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Mechanic getMechanic() { return mechanic; }

    @Override
    public String toString() {
        return "Garage [id=" + id + ", name=" + name + ", Mechanic=" + mechanic + "]";
    }
}