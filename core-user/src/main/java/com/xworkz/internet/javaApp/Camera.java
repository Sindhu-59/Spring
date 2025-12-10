package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Camera {

    private int id;
    private String name;

    public Camera(){
        System.out.println("Camera info invoked");
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
        return "Camera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
