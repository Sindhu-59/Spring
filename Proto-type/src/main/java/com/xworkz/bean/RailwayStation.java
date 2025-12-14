package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RailwayStation {
    private int id;
    private String name;

    @Autowired
    private Train train;

    public RailwayStation() {
        System.out.println("RailwayStation created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Train getTrain() { return train; }

    @Override
    public String toString() {
        return "RailwayStation [id=" + id + ", name=" + name + ", Train=" + train + "]";
    }
}