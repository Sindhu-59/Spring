package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Home {

    private int id;
    private String location;
    public Home(){
        System.out.println("Home info invoked");
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
