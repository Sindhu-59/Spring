package com.xworkz.meta.dto;

public class LodgeDTO {

    private int lodgeId;
    private String name;
    private String location;
    private int rooms;
    private double pricePerNight;
    private boolean hasAC;
    private boolean hasWifi;
    private String contactNumber;

    public LodgeDTO() {}

    public LodgeDTO(int lodgeId, String name, String location, int rooms,
                    double pricePerNight, boolean hasAC, boolean hasWifi, String contactNumber) {
        this.lodgeId = lodgeId;
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.pricePerNight = pricePerNight;
        this.hasAC = hasAC;
        this.hasWifi = hasWifi;
        this.contactNumber = contactNumber;
    }

    public int getLodgeId() { return lodgeId; }
    public void setLodgeId(int lodgeId) { this.lodgeId = lodgeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getRooms() { return rooms; }
    public void setRooms(int rooms) { this.rooms = rooms; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }

    public boolean isHasAC() { return hasAC; }
    public void setHasAC(boolean hasAC) { this.hasAC = hasAC; }

    public boolean isHasWifi() { return hasWifi; }
    public void setHasWifi(boolean hasWifi) { this.hasWifi = hasWifi; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public String toString() {
        return "LodgeDTO{" +
                "lodgeId=" + lodgeId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", rooms=" + rooms +
                ", pricePerNight=" + pricePerNight +
                ", hasAC=" + hasAC +
                ", hasWifi=" + hasWifi +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
