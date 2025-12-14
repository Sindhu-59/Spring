package com.xworkz.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Doctor {
    private int id;
    private String type;

    public Doctor() {
        System.out.println("Doctor created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", type=" + type + "]";
    }
}