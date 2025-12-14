package com.xworkz.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Father {
    private int id;
    private String type;

    public Father() {
        System.out.println("Father created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Father [id=" + id + ", type=" + type + "]";
    }
}