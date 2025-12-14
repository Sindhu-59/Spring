package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PetShop {
    private int id;
    private String name;

    @Autowired
    private Pet pet;

    public PetShop() {
        System.out.println("PetShop created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Pet getPet() { return pet; }

    @Override
    public String toString() {
        return "PetShop [id=" + id + ", name=" + name + ", Pet=" + pet + "]";
    }
}