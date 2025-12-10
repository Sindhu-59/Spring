package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private int id;
    private String name;
    public Vehicle(){
        System.out.println("Vehicle info invoked");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String
    toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
