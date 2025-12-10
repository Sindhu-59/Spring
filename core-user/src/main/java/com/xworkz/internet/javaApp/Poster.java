package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Poster {

    private String color;
    private String size;

    public Poster(){
        System.out.println("Poster info invoked");
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
