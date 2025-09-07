package com.flightBookingSystem;
import java.util.*;
public class FlightbookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Admin admin=new Admin("Thiru");
		
		ArrayList<Passenger> passenger=new ArrayList<>();
		ArrayList<Flight> flight=new ArrayList<>();
		ArrayList<Booking> booking=new ArrayList<>();
		
		flight.add(new Flight("AI102","Chennai","Coimbatore",1200));
		flight.add(new Flight("EK343","Dubai", "India",4300));
		flight.add(new Flight("AI832","Bangalore", "Chennai",1400));
		
		int passengerIdCounter=1;
		
		while(true) {
			admin.showDetails();
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter Passenger name: ");
				String pname=sc.nextLine();
				System.out.println("Enter contact: ");
				String pcontact=sc.nextLine();
				passenger.add(new Passenger(passengerIdCounter++,pname,pcontact));
				System.out.println("Passenger Registered");
				break;
				 
			case 2:
				System.out.println("Available Flights");
				for(Flight f:flight) {
					System.out.println(f.getFlightNo()+": "
				    +f.getSource()+"-> "
				    +f.getDestination()
				    +"Rs."+f.getPrice());
				}
				 break;
			case 3:
				if(passenger.isEmpty()) {
					System.out.println("Register Please");
					break;
				}
				System.out.println("Passengers List");
				for(Passenger p:passenger) {
					System.out.println(p.getId()+" "+p.getName());
				}
				int pid=sc.nextInt();
				sc.nextLine();
				
				Passenger SelectedPassenger=null;
				for(Passenger p:passenger) {
					if(p.getId()==pid) {
						SelectedPassenger=p;
					}
				}
				if(SelectedPassenger==null) {
					System.out.println("Invalid Id");
					break;
				}
				System.out.println("Flight Details");
				for(int i=0;i<flight.size();i++) {
					System.out.println((i+1)+". "+flight.get(i).getFlightNo());
				}
				System.out.println("Choose flight Number: ");
				int fid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Travel Date(dd-mm-yyyy");
				String date=sc.nextLine();
				booking.add(new Booking(SelectedPassenger,flight.get(fid-1),date));
				System.out.println("Flight Booked...");
				 break;
			case 4: 
				if(booking.isEmpty()) {
					System.out.println("No Bookings Yet...");
					break;
				}
				for(Booking b:booking) {
					b.display();				}
				 break;
			case 5:
				 System.out.println("Enter Source");
				 String src=sc.nextLine().toLowerCase();
				 System.out.println("Enter destination: ");
				 String dest=sc.nextLine().toLowerCase();
				 boolean found=false;
				 System.out.println("Search Results:");
				 for(Flight f:flight) {
					 if(f.getSource().toLowerCase().equals(src) && f.getDestination().toLowerCase().equals(dest))
					 {
						 System.out.println(f.getFlightNo()+": "+
					     f.getSource()+"-> "+f.getDestination()+" - "+f.getPrice());
						 found=true;
					 }
				 }
				 if(!found) {
					System.out.println("No flights found");
					}
				 break;
			case 6:
				System.out.println("Exited.....");
				sc.close();
				System.exit(0);
			     break;
			default:
				System.out.println("Invalid choice");
			}
		}
		

	}

}
