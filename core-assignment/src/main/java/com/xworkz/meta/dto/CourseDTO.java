package com.xworkz.meta.dto;

public class CourseDTO {

    private int id;
    private String courseName;
    private String category;
    private int durationHours;
    private double fee;
    private String instructor;
    private String startDate;
    private String endDate;

    public CourseDTO() {}

    public CourseDTO(int id, String courseName, String category, int durationHours,
                     double fee, String instructor, String startDate, String endDate) {
        this.id = id;
        this.courseName = courseName;
        this.category = category;
        this.durationHours = durationHours;
        this.fee = fee;
        this.instructor = instructor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getDurationHours() { return durationHours; }
    public void setDurationHours(int durationHours) { this.durationHours = durationHours; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", category='" + category + '\'' +
                ", durationHours=" + durationHours +
                ", fee=" + fee +
                ", instructor='" + instructor + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

