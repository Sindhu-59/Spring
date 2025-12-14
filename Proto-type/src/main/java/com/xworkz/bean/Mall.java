package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mall {
    private int id;
    private String name;

    @Autowired
    private ShopUnit shopunit;

    public Mall() {
        System.out.println("Mall created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ShopUnit getShopUnit() { return shopunit; }

    @Override
    public String toString() {
        return "Mall [id=" + id + ", name=" + name + ", ShopUnit=" + shopunit + "]";
    }
}