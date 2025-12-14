package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CourierOffice {
    private int id;
    private String name;

    @Autowired
    private Parcel parcel;

    public CourierOffice() {
        System.out.println("CourierOffice created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Parcel getParcel() { return parcel; }

    @Override
    public String toString() {
        return "CourierOffice [id=" + id + ", name=" + name + ", Parcel=" + parcel + "]";
    }
}