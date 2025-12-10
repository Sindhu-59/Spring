package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Food {

    private String name;
    private double price;

    public Food(){
        System.out.println("Food info invoked");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
