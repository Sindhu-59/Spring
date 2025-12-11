package com.xworkz.meta.dto;

public class WatchDTO {

    private int watchId;
    private String brand;
    private String type;
    private String color;
    private boolean isWaterproof;
    private boolean hasChronograph;
    private double price;
    private String material;

    public WatchDTO() {}

    public WatchDTO(int watchId, String brand, String type, String color,
                    boolean isWaterproof, boolean hasChronograph, double price, String material) {
        this.watchId = watchId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.isWaterproof = isWaterproof;
        this.hasChronograph = hasChronograph;
        this.price = price;
        this.material = material;
    }

    public int getWatchId() { return watchId; }
    public void setWatchId(int watchId) { this.watchId = watchId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isWaterproof() { return isWaterproof; }
    public void setWaterproof(boolean waterproof) { isWaterproof = waterproof; }

    public boolean isHasChronograph() { return hasChronograph; }
    public void setHasChronograph(boolean hasChronograph) { this.hasChronograph = hasChronograph; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return "WatchDTO{" +
                "watchId=" + watchId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", isWaterproof=" + isWaterproof +
                ", hasChronograph=" + hasChronograph +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
