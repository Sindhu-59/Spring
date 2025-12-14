package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Court {
    private int id;
    private String name;

    @Autowired
    private Judge judge;

    public Court() {
        System.out.println("Court created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Judge getJudge() { return judge; }

    @Override
    public String toString() {
        return "Court [id=" + id + ", name=" + name + ", Judge=" + judge + "]";
    }
}