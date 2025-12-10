package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Bank {

    private int id;
    private String name;

    public Bank(){
        System.out.println("Bank info invoked");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
