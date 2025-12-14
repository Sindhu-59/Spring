package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Stadium {
    private int id;
    private String name;

    @Autowired
    private Player player;

    public Stadium() {
        System.out.println("Stadium created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Player getPlayer() { return player; }

    @Override
    public String toString() {
        return "Stadium [id=" + id + ", name=" + name + ", Player=" + player + "]";
    }
}