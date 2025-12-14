package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WeatherStation {
    private int id;
    private String name;

    @Autowired
    private Meteorologist meteorologist;

    public WeatherStation() {
        System.out.println("WeatherStation created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Meteorologist getMeteorologist() { return meteorologist; }

    @Override
    public String toString() {
        return "WeatherStation [id=" + id + ", name=" + name + ", Meteorologist=" + meteorologist + "]";
    }
}