package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Sandal {

    private String brand;
    private String color;

    public Sandal(){
        System.out.println("Sandal info invoked");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sandal{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
