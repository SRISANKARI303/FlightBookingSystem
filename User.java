package com.flightBookingSystem;

abstract public class User  {
	protected String name;
   public User(String name) {
	  this.name=name;
   }
   public abstract void showDetails();
}
