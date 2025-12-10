package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class Hero {
    private String name;
    private String industry;

    public Hero(){
        System.out.println("Hero info invoked");
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }
}
