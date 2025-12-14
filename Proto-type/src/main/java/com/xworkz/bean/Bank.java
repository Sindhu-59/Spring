package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bank {
    private int id;
    private String name;

    @Autowired
    private Account account;

    public Bank() {
        System.out.println("Bank created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Account getAccount() { return account; }

    @Override
    public String toString() {
        return "Bank [id=" + id + ", name=" + name + ", Account=" + account + "]";
    }
}