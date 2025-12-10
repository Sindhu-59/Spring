package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

    private String brand;
    private double price;

    public Mobile(){
        System.out.println("Mobile info invoked");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
