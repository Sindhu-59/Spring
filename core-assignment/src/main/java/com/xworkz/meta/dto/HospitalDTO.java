package com.xworkz.meta.dto;

public class HospitalDTO {
    private int id;
    private String name;
    private String location;
    private int beds;
    private int doctors;
    private int nurses;
    private String contact;
    private String type;

    public HospitalDTO(int id, String name, String location,
                       int doctors, int nurses, int beds,
                       String type, String contact) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.doctors = doctors;
        this.nurses = nurses;
        this.beds = beds;
        this.type = type;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDoctors() {
        return doctors;
    }

    public String getType() {
        return type;
    }

    public int getBeds() {
        return beds;
    }

    public int getNurses() {
        return nurses;
    }

    public String getContact() {
        return contact;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDoctors(int doctors) {
        this.doctors = doctors;
    }

    public void setNurses(int nurses) {
        this.nurses = nurses;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", beds=" + beds +
                ", doctors=" + doctors +
                ", nurses=" + nurses +
                ", contact='" + contact + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}