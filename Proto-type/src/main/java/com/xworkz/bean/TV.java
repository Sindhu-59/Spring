package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TV {
    private int id;
    private String name;

    @Autowired
    private Remote remote;

    public TV() {
        System.out.println("TV created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Remote getRemote() { return remote; }

    @Override
    public String toString() {
        return "TV [id=" + id + ", name=" + name + ", Remote=" + remote + "]";
    }
}