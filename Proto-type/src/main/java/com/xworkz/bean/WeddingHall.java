package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WeddingHall {
    private int id;
    private String name;

    @Autowired
    private Decorator decorator;

    public WeddingHall() {
        System.out.println("WeddingHall created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Decorator getDecorator() { return decorator; }

    @Override
    public String toString() {
        return "WeddingHall [id=" + id + ", name=" + name + ", Decorator=" + decorator + "]";
    }
}