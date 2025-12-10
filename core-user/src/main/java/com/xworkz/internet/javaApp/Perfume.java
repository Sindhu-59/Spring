package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Perfume {

    private String flavor;
    private String brand;

    public Perfume(){
        System.out.println("Perfume info invoked");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "flavor='" + flavor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
