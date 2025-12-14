package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mosque {
    private int id;
    private String name;

    @Autowired
    private Imam imam;

    public Mosque() {
        System.out.println("Mosque created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Imam getImam() { return imam; }

    @Override
    public String toString() {
        return "Mosque [id=" + id + ", name=" + name + ", Imam=" + imam + "]";
    }
}