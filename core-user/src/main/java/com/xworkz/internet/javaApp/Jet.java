package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Jet {

    private String name;
    private String location;
     public Jet(){
         System.out.println("Jet info");
     }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
