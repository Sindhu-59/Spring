package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class SocialMedia {

    private String name;
    private boolean isUseful;

    public SocialMedia(){
        System.out.println("info invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUseful(boolean useful) {
        isUseful = useful;
    }

    public boolean isUseful() {
        return isUseful;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "name='" + name + '\'' +
                ", isUseful=" + isUseful +
                '}';
    }
}
