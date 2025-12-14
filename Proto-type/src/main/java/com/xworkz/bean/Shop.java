package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Shop {
    private int id;
    private String name;

    @Autowired
    private Customer customer;

    public Shop() {
        System.out.println("Shop created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Customer getCustomer() { return customer; }

    @Override
    public String toString() {
        return "Shop [id=" + id + ", name=" + name + ", Customer=" + customer + "]";
    }
}