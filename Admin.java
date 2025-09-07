package com.flightBookingSystem;

public class Admin extends User {
    public Admin(String name) {
    	super(name);
    }
    public void showDetails() {
    	System.out.println("Welcome "+name+" For Flight Booking");
    	System.out.println("1.Register");
    	System.out.println("2.View Flights");
    	System.out.println("3.Booking Flights");
    	System.out.println("4.View Bookings");
    	System.out.println("5.Search Flights");
    	System.out.println("Exit");
    }
}
