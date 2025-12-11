package com.xworkz.meta.dto;
public class RestaurantDTO {

    private int restaurantId;
    private String name;
    private String type; // veg / non-veg / multi-cuisine
    private String location;
    private double rating;
    private int seatingCapacity;
    private String openingTime;
    private String closingTime;

    public RestaurantDTO() {
        System.out.println("No-arg constructor of RestaurantDTO");
    }

    public RestaurantDTO(int restaurantId, String name, String type, String location,
                         double rating, int seatingCapacity, String openingTime,
                         String closingTime) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.type = type;
        this.location = location;
        this.rating = rating;
        this.seatingCapacity = seatingCapacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public int getRestaurantId() { return restaurantId; }
    public void setRestaurantId(int restaurantId) { this.restaurantId = restaurantId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public int getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(int seatingCapacity) { this.seatingCapacity = seatingCapacity; }

    public String getOpeningTime() { return openingTime; }
    public void setOpeningTime(String openingTime) { this.openingTime = openingTime; }

    public String getClosingTime() { return closingTime; }
    public void setClosingTime(String closingTime) { this.closingTime = closingTime; }

    @Override
    public String toString() {
        return "RestaurantDTO{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", seatingCapacity=" + seatingCapacity +
                ", openingTime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                '}';
    }
}
