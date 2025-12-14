package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Restaurant {
    private int id;
    private String name;

    @Autowired
    private Chef chef;

    public Restaurant() {
        System.out.println("Restaurant created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Chef getChef() { return chef; }

    @Override
    public String toString() {
        return "Restaurant [id=" + id + ", name=" + name + ", Chef=" + chef + "]";
    }
}