package com.xworkz.meta.dto;

public class GymDTO {

    private int gymId;
    private String name;
    private String location;
    private int totalTrainers;
    private int capacity;
    private boolean hasSwimmingPool;
    private boolean hasDietConsultancy;
    private double monthlyFee;

    public GymDTO() {}

    public GymDTO(int gymId, String name, String location, int totalTrainers, int capacity,
                  boolean hasSwimmingPool, boolean hasDietConsultancy, double monthlyFee) {
        this.gymId = gymId;
        this.name = name;
        this.location = location;
        this.totalTrainers = totalTrainers;
        this.capacity = capacity;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasDietConsultancy = hasDietConsultancy;
        this.monthlyFee = monthlyFee;
    }

    public int getGymId() { return gymId; }
    public void setGymId(int gymId) { this.gymId = gymId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getTotalTrainers() { return totalTrainers; }
    public void setTotalTrainers(int totalTrainers) { this.totalTrainers = totalTrainers; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public boolean isHasSwimmingPool() { return hasSwimmingPool; }
    public void setHasSwimmingPool(boolean hasSwimmingPool) { this.hasSwimmingPool = hasSwimmingPool; }

    public boolean isHasDietConsultancy() { return hasDietConsultancy; }
    public void setHasDietConsultancy(boolean hasDietConsultancy) { this.hasDietConsultancy = hasDietConsultancy; }

    public double getMonthlyFee() { return monthlyFee; }
    public void setMonthlyFee(double monthlyFee) { this.monthlyFee = monthlyFee; }

    @Override
    public String toString() {
        return "GymDTO{" +
                "gymId=" + gymId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalTrainers=" + totalTrainers +
                ", capacity=" + capacity +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasDietConsultancy=" + hasDietConsultancy +
                ", monthlyFee=" + monthlyFee +
                '}';
    }
}

