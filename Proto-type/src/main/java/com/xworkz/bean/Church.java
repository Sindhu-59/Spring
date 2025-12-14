package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Church {
    private int id;
    private String name;

    @Autowired
    private Father father;

    public Church() {
        System.out.println("Church created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Father getFather() { return father; }

    @Override
    public String toString() {
        return "Church [id=" + id + ", name=" + name + ", Father=" + father + "]";
    }
}