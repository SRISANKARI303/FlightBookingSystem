package com.flightBookingSystem;

public class Flight {
    private String FlightNo;
    private String source;
    private String destination;
    private double price;
    public Flight(String FlightNo, String source, String destination, double price) {
    	this.FlightNo=FlightNo;
    	this.source=source;
    	this.destination=destination;
    	this.price=price;
    }
    
    public String getFlightNo() {
    	return FlightNo;
    }
    
    public String getSource() {
    	return source;
    }
    
    public String getDestination() {
    	return destination;
    }
    
    public double getPrice() {
    	return price;
    }
    
}
