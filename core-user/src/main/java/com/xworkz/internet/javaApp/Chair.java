package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Chair {

    private int id;
    private String brand;

    public Chair(){
        System.out.println("Chair info invoked");
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
