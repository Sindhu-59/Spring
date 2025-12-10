package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Watch {
    private String brand;
    private int id;

    public Watch(){
        System.out.println("Watch info invoked");
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }
}
