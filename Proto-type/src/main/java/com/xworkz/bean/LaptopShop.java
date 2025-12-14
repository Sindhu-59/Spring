package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LaptopShop {
    private int id;
    private String name;

    @Autowired
    private Laptop laptop;

    public LaptopShop() {
        System.out.println("LaptopShop created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Laptop getLaptop() { return laptop; }

    @Override
    public String toString() {
        return "LaptopShop [id=" + id + ", name=" + name + ", Laptop=" + laptop + "]";
    }
}