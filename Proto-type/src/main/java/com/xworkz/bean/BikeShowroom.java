package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BikeShowroom {
    private int id;
    private String name;

    @Autowired
    private Bike bike;

    public BikeShowroom() {
        System.out.println("BikeShowroom created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Bike getBike() { return bike; }

    @Override
    public String toString() {
        return "BikeShowroom [id=" + id + ", name=" + name + ", Bike=" + bike + "]";
    }
}