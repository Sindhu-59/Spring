package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hostel {
    private int id;
    private String name;

    @Autowired
    private Warden warden;

    public Hostel() {
        System.out.println("Hostel created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Warden getWarden() { return warden; }

    @Override
    public String toString() {
        return "Hostel [id=" + id + ", name=" + name + ", Warden=" + warden + "]";
    }
}