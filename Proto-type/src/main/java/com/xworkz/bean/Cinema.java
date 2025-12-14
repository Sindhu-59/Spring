package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cinema {
    private int id;
    private String name;

    @Autowired
    private Movie movie;

    public Cinema() {
        System.out.println("Cinema created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Movie getMovie() { return movie; }

    @Override
    public String toString() {
        return "Cinema [id=" + id + ", name=" + name + ", Movie=" + movie + "]";
    }
}