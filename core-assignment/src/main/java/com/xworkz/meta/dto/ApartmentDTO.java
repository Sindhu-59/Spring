package com.xworkz.meta.dto;

public class ApartmentDTO {

    private int id;
    private String name;
    private String location;
    private int floors;
    private int totalUnits;
    private double pricePerUnit;
    private boolean hasParking;
    private String builderName;

    public ApartmentDTO() {}

    public ApartmentDTO(int id, String name, String location, int floors, int totalUnits,
                        double pricePerUnit, boolean hasParking, String builderName) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.floors = floors;
        this.totalUnits = totalUnits;
        this.pricePerUnit = pricePerUnit;
        this.hasParking = hasParking;
        this.builderName = builderName;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getFloors() { return floors; }
    public void setFloors(int floors) { this.floors = floors; }

    public int getTotalUnits() { return totalUnits; }
    public void setTotalUnits(int totalUnits) { this.totalUnits = totalUnits; }

    public double getPricePerUnit() { return pricePerUnit; }
    public void setPricePerUnit(double pricePerUnit) { this.pricePerUnit = pricePerUnit; }

    public boolean isHasParking() { return hasParking; }
    public void setHasParking(boolean hasParking) { this.hasParking = hasParking; }

    public String getBuilderName() { return builderName; }
    public void setBuilderName(String builderName) { this.builderName = builderName; }

    @Override
    public String toString() {
        return "ApartmentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", floors=" + floors +
                ", totalUnits=" + totalUnits +
                ", pricePerUnit=" + pricePerUnit +
                ", hasParking=" + hasParking +
                ", builderName='" + builderName + '\'' +
                '}';
    }
}

