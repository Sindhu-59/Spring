package com.xworkz.meta.dto;

public class ProductDTO {

        private int id;
        private String name;
        private double price;
        private String brand;
        private String category;
        private int quantity;
        private String manufactureDate;
        private String expiryDate;

    public ProductDTO(int id, String name, double price, String brand, String category,
                      int quantity, String manufactureDate, String expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.quantity = quantity;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public String getBrand() { return brand; }
        public void setBrand(String brand) { this.brand = brand; }

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }

        public String getManufactureDate() { return manufactureDate; }
        public void setManufactureDate(String manufactureDate) { this.manufactureDate = manufactureDate; }

        public String getExpiryDate() { return expiryDate; }
        public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

        @Override
        public String toString() {
            return "ProductDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", brand='" + brand + '\'' +
                    ", category='" + category + '\'' +
                    ", quantity=" + quantity +
                    ", manufactureDate='" + manufactureDate + '\'' +
                    ", expiryDate='" + expiryDate + '\'' +
                    '}';
        }
    }

