package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pharmacy {
    private int id;
    private String name;

    @Autowired
    private Medicine medicine;

    public Pharmacy() {
        System.out.println("Pharmacy created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Medicine getMedicine() { return medicine; }

    @Override
    public String toString() {
        return "Pharmacy [id=" + id + ", name=" + name + ", Medicine=" + medicine + "]";
    }
}