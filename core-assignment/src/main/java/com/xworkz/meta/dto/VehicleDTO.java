package com.xworkz.meta.dto;

public class VehicleDTO {
    private String vehicleNo;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String type;
    private String ownerName;

    public VehicleDTO(String vehicleNo, String brand, String model, int year,
                      String color, double price, String type, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String getVehicleNo() { return vehicleNo; }
    public void setVehicleNo(String vehicleNo) { this.vehicleNo = vehicleNo; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

