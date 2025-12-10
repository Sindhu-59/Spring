package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Bag {

    private int id;
    private String name;

    public Bag(){
        System.out.println("Bag info invoked");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
