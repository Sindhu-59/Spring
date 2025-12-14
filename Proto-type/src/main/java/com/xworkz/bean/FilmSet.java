package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FilmSet {
    private int id;
    private String name;

    @Autowired
    private Actor actor;

    public FilmSet() {
        System.out.println("FilmSet created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Actor getActor() { return actor; }

    @Override
    public String toString() {
        return "FilmSet [id=" + id + ", name=" + name + ", Actor=" + actor + "]";
    }
}