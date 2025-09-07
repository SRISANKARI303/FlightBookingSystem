package com.flightBookingSystem;

public class Booking {
   private Passenger passenger;
   private Flight flight;
   private String date;
   
   
   public Booking(Passenger passenger, Flight flight, String date) {
	   this.passenger=passenger;
	   this.flight=flight;
	   this.date=date;
   }
   public void display() {
	   System.out.println("Passenger Name: "+passenger.getName()+"Passenger Contact: "+passenger.getContact());
	   System.out.println("FLight No: "+flight.getFlightNo()+"Starting from "+flight.getSource()+" and reached to "+flight.getDestination());
	   System.out.println("Price: "+"Rs."+flight.getPrice());
	   System.out.println("---------------------------------------------------");
   }

}
