package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Radio {

    private int id;
    private String name;
    public Radio(){
        System.out.println("Radio info invoked");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
