package com.xworkz.meta.dto;

public class FestivalDTO {

    private int festivalId;
    private String name;
    private String type;
    private String month;
    private int durationDays;
    private String country;
    private boolean publicHoliday;
    private double budgetPerPerson;

    public FestivalDTO() {}

    public FestivalDTO(int festivalId, String name, String type, String month,
                       int durationDays, String country, boolean publicHoliday, double budgetPerPerson) {
        this.festivalId = festivalId;
        this.name = name;
        this.type = type;
        this.month = month;
        this.durationDays = durationDays;
        this.country = country;
        this.publicHoliday = publicHoliday;
        this.budgetPerPerson = budgetPerPerson;
    }


    public int getFestivalId() { return festivalId; }
    public void setFestivalId(int festivalId) { this.festivalId = festivalId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }

    public int getDurationDays() { return durationDays; }
    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public boolean isPublicHoliday() { return publicHoliday; }
    public void setPublicHoliday(boolean publicHoliday) { this.publicHoliday = publicHoliday; }

    public double getBudgetPerPerson() { return budgetPerPerson; }
    public void setBudgetPerPerson(double budgetPerPerson) { this.budgetPerPerson = budgetPerPerson; }

    @Override
    public String toString() {
        return "FestivalDTO{" +
                "festivalId=" + festivalId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", month='" + month + '\'' +
                ", durationDays=" + durationDays +
                ", country='" + country + '\'' +
                ", publicHoliday=" + publicHoliday +
                ", budgetPerPerson=" + budgetPerPerson +
                '}';
    }
}
