package com.xworkz.internet.javaApp;

import org.springframework.stereotype.Component;

@Component
public class District {

    private String movieName;
    private String location;
    public District(){
        System.out.println("Movie info");
    }

    public String getLocation() {
        return location;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "District{" +
                "movieName='" + movieName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
