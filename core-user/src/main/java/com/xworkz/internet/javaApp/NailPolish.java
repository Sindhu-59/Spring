package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class NailPolish {

    String brand;
    String color;

    public NailPolish(){
        System.out.println("NailPolish info is invoked");
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String
    toString() {
        return "NailPolish{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
