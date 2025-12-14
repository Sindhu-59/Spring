package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Library {
    private int id;
    private String name;

    @Autowired
    private Book book;

    public Library() {
        System.out.println("Library created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Book getBook() { return book; }

    @Override
    public String toString() {
        return "Library [id=" + id + ", name=" + name + ", Book=" + book + "]";
    }
}