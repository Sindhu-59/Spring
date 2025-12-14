package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DesignStudio {
    private int id;
    private String name;

    @Autowired
    private Designer designer;

    public DesignStudio() {
        System.out.println("DesignStudio created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Designer getDesigner() { return designer; }

    @Override
    public String toString() {
        return "DesignStudio [id=" + id + ", name=" + name + ", Designer=" + designer + "]";
    }
}