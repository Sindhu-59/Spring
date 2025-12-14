package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MobileStore {
    private int id;
    private String name;

    @Autowired
    private Mobile mobile;

    public MobileStore() {
        System.out.println("MobileStore created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Mobile getMobile() { return mobile; }

    @Override
    public String toString() {
        return "MobileStore [id=" + id + ", name=" + name + ", Mobile=" + mobile + "]";
    }
}