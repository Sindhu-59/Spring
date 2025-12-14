package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarShowroom {
    private int id;
    private String name;

    @Autowired
    private Car car;

    public CarShowroom() {
        System.out.println("CarShowroom created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Car getCar() { return car; }

    @Override
    public String toString() {
        return "CarShowroom [id=" + id + ", name=" + name + ", Car=" + car + "]";
    }
}