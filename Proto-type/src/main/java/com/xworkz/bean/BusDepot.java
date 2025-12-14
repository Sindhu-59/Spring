package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BusDepot {
    private int id;
    private String name;

    @Autowired
    private Bus bus;

    public BusDepot() {
        System.out.println("BusDepot created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Bus getBus() { return bus; }

    @Override
    public String toString() {
        return "BusDepot [id=" + id + ", name=" + name + ", Bus=" + bus + "]";
    }
}