package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PostOffice {
    private int id;
    private String name;

    @Autowired
    private Letter letter;

    public PostOffice() {
        System.out.println("PostOffice created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Letter getLetter() { return letter; }

    @Override
    public String toString() {
        return "PostOffice [id=" + id + ", name=" + name + ", Letter=" + letter + "]";
    }
}