package com.xworkz.internet.javaApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internet {
    @Value("1")
    private int id;
    @Value("Jio")
    private String name;

    public Internet(){
        System.out.println("Internet is invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
