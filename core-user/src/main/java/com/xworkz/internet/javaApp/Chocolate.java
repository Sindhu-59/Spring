package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {

    String brand;
    String name;

    public Chocolate(){
        System.out.println("Chocolate info is invoked");
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
