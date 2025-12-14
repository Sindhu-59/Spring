package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Temple {
    private int id;
    private String name;

    @Autowired
    private Priest priest;

    public Temple() {
        System.out.println("Temple created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Priest getPriest() { return priest; }

    @Override
    public String toString() {
        return "Temple [id=" + id + ", name=" + name + ", Priest=" + priest + "]";
    }
}