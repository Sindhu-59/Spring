package com.xworkz.meta.dto;

public class BagDTO {

    private int bagId;
    private String brand;
    private String type;
    private String color;
    private double price;
    private double capacityLiters;
    private boolean waterproof;
    private String material;

    public BagDTO() {}

    public BagDTO(int bagId, String brand, String type, String color, double price,
                  double capacityLiters, boolean waterproof, String material) {
        this.bagId = bagId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.capacityLiters = capacityLiters;
        this.waterproof = waterproof;
        this.material = material;
    }

    // Getters & Setters
    public int getBagId() { return bagId; }
    public void setBagId(int bagId) { this.bagId = bagId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getCapacityLiters() { return capacityLiters; }
    public void setCapacityLiters(double capacityLiters) { this.capacityLiters = capacityLiters; }

    public boolean isWaterproof() { return waterproof; }
    public void setWaterproof(boolean waterproof) { this.waterproof = waterproof; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return "BagDTO{" +
                "bagId=" + bagId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", capacityLiters=" + capacityLiters +
                ", waterproof=" + waterproof +
                ", material='" + material + '\'' +
                '}';
    }
}

