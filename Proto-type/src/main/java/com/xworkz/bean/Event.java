package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Event {
    private int id;
    private String name;

    @Autowired
    private Organizer organizer;

    public Event() {
        System.out.println("Event created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Organizer getOrganizer() { return organizer; }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", Organizer=" + organizer + "]";
    }
}