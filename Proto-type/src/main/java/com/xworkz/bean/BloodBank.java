package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BloodBank {
    private int id;
    private String name;

    @Autowired
    private Donor donor;

    public BloodBank() {
        System.out.println("BloodBank created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Donor getDonor() { return donor; }

    @Override
    public String toString() {
        return "BloodBank [id=" + id + ", name=" + name + ", Donor=" + donor + "]";
    }
}