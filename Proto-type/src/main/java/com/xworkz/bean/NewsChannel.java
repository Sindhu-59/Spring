package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NewsChannel {
    private int id;
    private String name;

    @Autowired
    private Reporter reporter;

    public NewsChannel() {
        System.out.println("NewsChannel created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Reporter getReporter() { return reporter; }

    @Override
    public String toString() {
        return "NewsChannel [id=" + id + ", name=" + name + ", Reporter=" + reporter + "]";
    }
}