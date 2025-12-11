package com.xworkz.meta.dto;

public class FlightDTO {
    private int id;
    private String airline;
    private String source;
    private String destination;
    private double price;
    private String departure;
    private String arrival;
    private String type;

    public FlightDTO(int id, String airline, String source, String destination,
                     double price, String departure, String arrival, String type) {
        this.id = id;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.departure = departure;
        this.arrival = arrival;
        this.type = type;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }
    public String getArrival() { return arrival; }
    public void setArrival(String arrival) { this.arrival = arrival; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "FlightDTO{" +
                "id=" + id +
                ", airline='" + airline + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}


