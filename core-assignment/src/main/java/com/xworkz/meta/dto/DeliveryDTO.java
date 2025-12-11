package com.xworkz.meta.dto;

public class DeliveryDTO {

    private int deliveryId;
    private String customerName;
    private String address;
    private String city;
    private String deliveryDate;
    private String status;
    private double weightKg;
    private double cost;

    public DeliveryDTO() {}

    public DeliveryDTO(int deliveryId, String customerName, String address, String city,
                       String deliveryDate, String status, double weightKg, double cost) {
        this.deliveryId = deliveryId;
        this.customerName = customerName;
        this.address = address;
        this.city = city;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.weightKg = weightKg;
        this.cost = cost;
    }

    public int getDeliveryId() { return deliveryId; }
    public void setDeliveryId(int deliveryId) { this.deliveryId = deliveryId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(String deliveryDate) { this.deliveryDate = deliveryDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getWeightKg() { return weightKg; }
    public void setWeightKg(double weightKg) { this.weightKg = weightKg; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "DeliveryDTO{" +
                "deliveryId=" + deliveryId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", status='" + status + '\'' +
                ", weightKg=" + weightKg +
                ", cost=" + cost +
                '}';
    }
}

