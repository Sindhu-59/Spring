package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Novel {
    private String name;
    private String author;

    public Novel(){
        System.out.println("Novel info invoked");
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
