package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Port {
    private int id;
    private String name;

    @Autowired
    private Ship ship;

    public Port() {
        System.out.println("Port created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Ship getShip() { return ship; }

    @Override
    public String toString() {
        return "Port [id=" + id + ", name=" + name + ", Ship=" + ship + "]";
    }
}