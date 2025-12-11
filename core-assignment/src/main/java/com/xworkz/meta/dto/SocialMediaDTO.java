package com.xworkz.meta.dto;

public class SocialMediaDTO {

    private int id;
    private String name;
    private String type;
    private int monthlyActiveUsers; // in millions
    private int foundedYear;
    private boolean isFree;
    private String founder;
    private String headquarters;

    public SocialMediaDTO() {}

    public SocialMediaDTO(int id, String name, String type, int monthlyActiveUsers,
                          int foundedYear, boolean isFree, String founder, String headquarters) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.monthlyActiveUsers = monthlyActiveUsers;
        this.foundedYear = foundedYear;
        this.isFree = isFree;
        this.founder = founder;
        this.headquarters = headquarters;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getMonthlyActiveUsers() { return monthlyActiveUsers; }
    public void setMonthlyActiveUsers(int monthlyActiveUsers) { this.monthlyActiveUsers = monthlyActiveUsers; }

    public int getFoundedYear() { return foundedYear; }
    public void setFoundedYear(int foundedYear) { this.foundedYear = foundedYear; }

    public boolean isFree() { return isFree; }
    public void setFree(boolean free) { isFree = free; }

    public String getFounder() { return founder; }
    public void setFounder(String founder) { this.founder = founder; }

    public String getHeadquarters() { return headquarters; }
    public void setHeadquarters(String headquarters) { this.headquarters = headquarters; }

    @Override
    public String toString() {
        return "SocialMediaDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", monthlyActiveUsers=" + monthlyActiveUsers +
                ", foundedYear=" + foundedYear +
                ", isFree=" + isFree +
                ", founder='" + founder + '\'' +
                ", headquarters='" + headquarters + '\'' +
                '}';
    }
}

