package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private String name;
    private String location;
    public Company(){
        System.out.println("Company info invoked");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
