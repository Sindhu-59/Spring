package com.xworkz.meta.dto;

public class ParkDTO {

    private int parkId;
    private String name;
    private String location;
    private double areaAcres;
    private boolean entryFee;
    private String openTime;
    private String closeTime;
    private int visitorsPerDay;

    public ParkDTO() {}

    public ParkDTO(int parkId, String name, String location, double areaAcres,
                   boolean entryFee, String openTime, String closeTime, int visitorsPerDay) {
        this.parkId = parkId;
        this.name = name;
        this.location = location;
        this.areaAcres = areaAcres;
        this.entryFee = entryFee;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.visitorsPerDay = visitorsPerDay;
    }

    public int getParkId() { return parkId; }
    public void setParkId(int parkId) { this.parkId = parkId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getAreaAcres() { return areaAcres; }
    public void setAreaAcres(double areaAcres) { this.areaAcres = areaAcres; }

    public boolean isEntryFee() { return entryFee; }
    public void setEntryFee(boolean entryFee) { this.entryFee = entryFee; }

    public String getOpenTime() { return openTime; }
    public void setOpenTime(String openTime) { this.openTime = openTime; }

    public String getCloseTime() { return closeTime; }
    public void setCloseTime(String closeTime) { this.closeTime = closeTime; }

    public int getVisitorsPerDay() { return visitorsPerDay; }
    public void setVisitorsPerDay(int visitorsPerDay) { this.visitorsPerDay = visitorsPerDay; }

    @Override
    public String toString() {
        return "ParkDTO{" +
                "parkId=" + parkId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", areaAcres=" + areaAcres +
                ", entryFee=" + entryFee +
                ", openTime='" + openTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", visitorsPerDay=" + visitorsPerDay +
                '}';
    }
}

