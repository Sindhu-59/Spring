package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Warehouse {
    private int id;
    private String name;

    @Autowired
    private Product product;

    public Warehouse() {
        System.out.println("Warehouse created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Product getProduct() { return product; }

    @Override
    public String toString() {
        return "Warehouse [id=" + id + ", name=" + name + ", Product=" + product + "]";
    }
}