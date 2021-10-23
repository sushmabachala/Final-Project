package com.info.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.air.builder.FlightBuilder;
import com.info.bookingService.Booking;

public class Passenger implements Booking {


	@Override
	public void registerUser(PassengerDetails passenger) {
		// TODO Auto-generated method stub
		List<PassengerDetails> registeredUser = new ArrayList<>();
		registeredUser.add(passenger);
		System.out.println("********hello "+passenger.getName()+" Registered successfully ****************");
	    System.out.println();			
	}

	@Override
	public TicketDetails bookTicket(FlightDetails flights, PassengerDetails passengerDetails) {
		// TODO Auto-generated method stub
		TicketDetails ticketDetails = new TicketDetails();
		ticketDetails.setPassengerName(passengerDetails.getName());
		ticketDetails.setNoOfTickets(passengerDetails.getTotalTickets());
		ticketDetails.setFromCity(flights.getFromCity());
		ticketDetails.setToCity(flights.getTocity());
		ticketDetails.setDepartureTime("6.00 pm");
		ticketDetails.setArrivalTime("1.00 am");
		ticketDetails.setTotalFare(flights.getTotalFare()*passengerDetails.getTotalTickets());
		System.out.println("===========Ticket Booked Successfully "+ticketDetails.getPassengerName()+"==============");
		System.out.println(ticketDetails);
	    return	ticketDetails;
		
		
	}

	@Override
	public List<FlightDetails> showAvailableFlights(String currentlocation, String destination) {
		// TODO Auto-generated method stub
		FlightDetails f1 = new FlightBuilder().setFlightName("Air India").setFlightNo(112)
				         .setFromCity("Delhi").setTocity("dubai").setDate("21-10-2021").setTotalFare(20000).setAirportName("Indira gandhi Airport").getFlight();
		
		FlightDetails f2 = new FlightBuilder().setFlightName("King Fisher").setFlightNo(112)
		         .setFromCity("Chennai").setTocity("dubai").setDate("21-10-2021").setTotalFare(30000).setAirportName("Kamarajar Airport").getFlight();

		FlightDetails f3 = new FlightBuilder().setFlightName("British Airways").setFlightNo(112)
		         .setFromCity("Delhi").setTocity("UK").setDate("21-10-2021").setTotalFare(40000).setAirportName("Indira gandhi Airport").getFlight();

		FlightDetails f4 = new FlightBuilder().setFlightName("Qatar Airways").setFlightNo(112)
		         .setFromCity("Mumbai").setTocity("US").setDate("21-10-2021").setTotalFare(35000).setAirportName("Shivaji Airport").getFlight();

		List<FlightDetails> flightList= Arrays.asList(f1,f2,f3,f4);
		List<FlightDetails> availableFlightList= new ArrayList<>();
		

		for(FlightDetails flightDetails :flightList) {
			if(flightDetails.getFromCity().equalsIgnoreCase(currentlocation) && flightDetails.getTocity().equalsIgnoreCase(destination)) {
				availableFlightList.add(flightDetails);
			}
		}
		System.out.println("*******Available flights for current city and destination ***********");
		return availableFlightList;
	}

	@Override
	public void cancelTicket(String reason, TicketDetails details) {
		// TODO Auto-generated method stub
		System.out.println("XXXXXXXX----Reason for cancellation "+reason+"-----XXXXXXXXX");
	    System.out.println();
		System.out.println("********Ticket cancelled successfully for the passengerDetail**********");
	    System.out.println();
		System.out.println(details);
	}

	@Override
	public FlightDetails selectFlightWithLowPrice(List<FlightDetails> flightList) {
		// TODO Auto-generated method stub
		List<FlightDetails> orderedFlights = new ArrayList<>();
		flightList.sort(Comparator.comparing(FlightDetails::getTotalFare));
		for (FlightDetails flightDetails : flightList) {
			orderedFlights.add(flightDetails);
		}
		return orderedFlights.get(0);
	}

}
