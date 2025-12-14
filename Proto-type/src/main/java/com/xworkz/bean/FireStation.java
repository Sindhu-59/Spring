package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FireStation {
    private int id;
    private String name;

    @Autowired
    private Firefighter firefighter;

    public FireStation() {
        System.out.println("FireStation created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Firefighter getFirefighter() { return firefighter; }

    @Override
    public String toString() {
        return "FireStation [id=" + id + ", name=" + name + ", Firefighter=" + firefighter + "]";
    }
}