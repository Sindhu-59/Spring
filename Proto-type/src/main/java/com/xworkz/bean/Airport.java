package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Airport {
    private int id;
    private String name;

    @Autowired
    private Flight flight;

    public Airport() {
        System.out.println("Airport created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Flight getFlight() { return flight; }

    @Override
    public String toString() {
        return "Airport [id=" + id + ", name=" + name + ", Flight=" + flight + "]";
    }
}