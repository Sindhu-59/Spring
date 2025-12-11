package com.xworkz.meta.dto;
public class HotelDTO {

    private int hotelId;
    private String name;
    private String location;
    private int totalRooms;
    private double rating;
    private double pricePerNight;
    private String checkInTime;
    private String checkOutTime;

    public HotelDTO() {
        System.out.println("No-arg constructor of HotelDTO");
    }

    public HotelDTO(int hotelId, String name, String location, int totalRooms,
                    double rating, double pricePerNight, String checkInTime,
                    String checkOutTime) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.totalRooms = totalRooms;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getTotalRooms() { return totalRooms; }
    public void setTotalRooms(int totalRooms) { this.totalRooms = totalRooms; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }

    public String getCheckInTime() { return checkInTime; }
    public void setCheckInTime(String checkInTime) { this.checkInTime = checkInTime; }

    public String getCheckOutTime() { return checkOutTime; }
    public void setCheckOutTime(String checkOutTime) { this.checkOutTime = checkOutTime; }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalRooms=" + totalRooms +
                ", rating=" + rating +
                ", pricePerNight=" + pricePerNight +
                ", checkInTime='" + checkInTime + '\'' +
                ", checkOutTime='" + checkOutTime + '\'' +
                '}';
    }
}
