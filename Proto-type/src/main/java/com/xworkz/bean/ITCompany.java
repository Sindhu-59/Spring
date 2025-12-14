package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ITCompany {
    private int id;
    private String name;

    @Autowired
    private Developer developer;

    public ITCompany() {
        System.out.println("ITCompany created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Developer getDeveloper() { return developer; }

    @Override
    public String toString() {
        return "ITCompany [id=" + id + ", name=" + name + ", Developer=" + developer + "]";
    }
}