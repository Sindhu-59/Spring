package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Factory {
    private int id;
    private String name;

    @Autowired
    private Worker worker;

    public Factory() {
        System.out.println("Factory created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Worker getWorker() { return worker; }

    @Override
    public String toString() {
        return "Factory [id=" + id + ", name=" + name + ", Worker=" + worker + "]";
    }
}