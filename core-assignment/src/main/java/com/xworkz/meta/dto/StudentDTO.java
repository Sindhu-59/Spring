package com.xworkz.meta.dto;

public class StudentDTO {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    private String email;
    private String phone;
    private String address;
    private double percentage;

    public StudentDTO(int rollNo, String name, int age, String course,
                      double percentage, String phone, String email, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
