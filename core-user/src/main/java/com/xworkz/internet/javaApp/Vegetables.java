package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Vegetables {
    private String name;
    private  String color;

    public Vegetables(){
        System.out.println("vegetables is invoked");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
