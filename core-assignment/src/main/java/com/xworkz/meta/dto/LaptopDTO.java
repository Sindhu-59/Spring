package com.xworkz.meta.dto;

public class LaptopDTO {
    private int id;
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String processor;
    private double price;
    private String color;

    public LaptopDTO(int id, String brand, String model, double price,
                     int ram, int storage, String processor, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.color = color;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }

    public int getStorage() { return storage; }
    public void setStorage(int storage) { this.storage = storage; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "LaptopDTO{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
