package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PoliceStation {
    private int id;
    private String name;

    @Autowired
    private Officer officer;

    public PoliceStation() {
        System.out.println("PoliceStation created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Officer getOfficer() { return officer; }

    @Override
    public String toString() {
        return "PoliceStation [id=" + id + ", name=" + name + ", Officer=" + officer + "]";
    }
}