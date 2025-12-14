package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ConstructionSite {
    private int id;
    private String name;

    @Autowired
    private Engineer engineer;

    public ConstructionSite() {
        System.out.println("ConstructionSite created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Engineer getEngineer() { return engineer; }

    @Override
    public String toString() {
        return "ConstructionSite [id=" + id + ", name=" + name + ", Engineer=" + engineer + "]";
    }
}