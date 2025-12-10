package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private String brand;
    private String os;
    public Laptop(){
        System.out.println("Laptop info invoked");;
    }
    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
