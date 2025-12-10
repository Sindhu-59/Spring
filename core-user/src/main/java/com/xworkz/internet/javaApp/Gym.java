package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Gym {

    private int id;
    private String name;

    public Gym(){
        System.out.println("Gym info is invoked");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
