package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class AmusementPark {
    private int id;
    private String name;

    public AmusementPark(){
        System.out.println("Park info invoked");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AmusementPark{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
