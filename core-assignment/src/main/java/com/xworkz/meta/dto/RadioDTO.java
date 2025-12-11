package com.xworkz.meta.dto;

public class RadioDTO {

    private int radioId;
    private String brand;
    private String type;
    private boolean isDigital;
    private double frequencyMHz;
    private boolean hasBluetooth;
    private double price;
    private String color;

    public RadioDTO() {}

    public RadioDTO(int radioId, String brand, String type, boolean isDigital,
                    double frequencyMHz, boolean hasBluetooth, double price, String color) {
        this.radioId = radioId;
        this.brand = brand;
        this.type = type;
        this.isDigital = isDigital;
        this.frequencyMHz = frequencyMHz;
        this.hasBluetooth = hasBluetooth;
        this.price = price;
        this.color = color;
    }

    public int getRadioId() { return radioId; }
    public void setRadioId(int radioId) { this.radioId = radioId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isDigital() { return isDigital; }
    public void setDigital(boolean digital) { isDigital = digital; }

    public double getFrequencyMHz() { return frequencyMHz; }
    public void setFrequencyMHz(double frequencyMHz) { this.frequencyMHz = frequencyMHz; }

    public boolean isHasBluetooth() { return hasBluetooth; }
    public void setHasBluetooth(boolean hasBluetooth) { this.hasBluetooth = hasBluetooth; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "RadioDTO{" +
                "radioId=" + radioId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", isDigital=" + isDigital +
                ", frequencyMHz=" + frequencyMHz +
                ", hasBluetooth=" + hasBluetooth +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

