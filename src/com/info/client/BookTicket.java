package com.info.client;

import java.util.List;

import com.air.builder.PassengerBuilder;
import com.air.observer.OfferAlert;
import com.info.beans.FlightDetails;
import com.info.beans.PassengerDetails;
import com.info.beans.TicketDetails;
import com.info.bookingService.Booking;
import com.info.bookingService.TicketFactory;

public class BookTicket {
	
	
	public static void main(String[] args) {
		
		//Builder Pattern to set the passenger Input 
		PassengerDetails p1 = new PassengerBuilder().setName("Ankit").setAge(20).setDob("01-11-1996")
				.setEmail("ankit@gmail.com").setTotalTickets(2).getPassenger() ;
		
		//Factory Pattern to create objects to book and cancel tickets 
		TicketFactory factory = new TicketFactory();
		
		Booking passenger =  factory.getInstance("Passenger");
		//Register the User 
		passenger.registerUser(p1);
		
		//Show all the flights occording to the current and destination
	    List<FlightDetails> flights=	passenger.showAvailableFlights("Delhi", "dubai");
	    flights.stream().forEach(i->System.out.println(i));
	    System.out.println();
	    //Select the flights 
	    FlightDetails selectedFlight =passenger.selectFlightWithLowPrice(flights);
	    //Book the ticket 
	    TicketDetails ticket = passenger.bookTicket(selectedFlight, p1);
	    
	    //Cancel the Ticket 
		passenger.cancelTicket("Personal emergency ", ticket);
		
		System.out.println();
		
		//Observer pattern to show the offer notification to the user 
		System.out.println("=========Observer pattern to show the offer notification to the user=========== ");
		OfferAlert alert = new OfferAlert();
		alert.sendOfferNotification(p1);
				
		
	}

}
