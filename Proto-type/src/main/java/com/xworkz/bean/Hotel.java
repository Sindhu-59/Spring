package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hotel {
    private int id;
    private String name;

    @Autowired
    private Room room;

    public Hotel() {
        System.out.println("Hotel created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Room getRoom() { return room; }

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", Room=" + room + "]";
    }
}