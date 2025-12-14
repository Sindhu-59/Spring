package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Salon {
    private int id;
    private String name;

    @Autowired
    private Stylist stylist;

    public Salon() {
        System.out.println("Salon created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Stylist getStylist() { return stylist; }

    @Override
    public String toString() {
        return "Salon [id=" + id + ", name=" + name + ", Stylist=" + stylist + "]";
    }
}