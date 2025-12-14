package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Company {
    private int id;
    private String name;

    @Autowired
    private Employee employee;

    public Company() {
        System.out.println("Company created");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Employee getEmployee() { return employee; }

    @Override
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", Employee=" + employee + "]";
    }
}