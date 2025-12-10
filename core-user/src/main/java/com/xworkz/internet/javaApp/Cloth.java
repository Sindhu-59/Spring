package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Cloth {

    private String name;
    private String brand;

    public Cloth(){
        System.out.println("Cloth info invoked");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
