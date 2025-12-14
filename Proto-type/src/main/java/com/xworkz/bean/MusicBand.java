package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicBand {
    private int id;
    private String name;

    @Autowired
    private Singer singer;

    public MusicBand() {
        System.out.println("MusicBand created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Singer getSinger() { return singer; }

    @Override
    public String toString() {
        return "MusicBand [id=" + id + ", name=" + name + ", Singer=" + singer + "]";
    }
}