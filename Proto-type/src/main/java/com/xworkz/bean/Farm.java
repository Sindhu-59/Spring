package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Farm {
    private int id;
    private String name;

    @Autowired
    private Farmer farmer;

    public Farm() {
        System.out.println("Farm created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Farmer getFarmer() { return farmer; }

    @Override
    public String toString() {
        return "Farm [id=" + id + ", name=" + name + ", Farmer=" + farmer + "]";
    }
}