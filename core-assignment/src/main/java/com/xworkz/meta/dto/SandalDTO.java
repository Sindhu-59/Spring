package com.xworkz.meta.dto;

public class SandalDTO {

    private int sandalId;
    private String brand;
    private String type;
    private String color;
    private double size;
    private double price;
    private boolean isLeather;
    private String material;

    public SandalDTO() {}

    public SandalDTO(int sandalId, String brand, String type, String color,
                     double size, double price, boolean isLeather, String material) {
        this.sandalId = sandalId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isLeather = isLeather;
        this.material = material;
    }

    public int getSandalId() { return sandalId; }
    public void setSandalId(int sandalId) { this.sandalId = sandalId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isLeather() { return isLeather; }
    public void setLeather(boolean leather) { isLeather = leather; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return "SandalDTO{" +
                "sandalId=" + sandalId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", isLeather=" + isLeather +
                ", material='" + material + '\'' +
                '}';
    }
}
