package com.info.bookingService;
import java.util.List;

import com.info.beans.FlightDetails;
import com.info.beans.PassengerDetails;
import com.info.beans.TicketDetails;

public interface Booking {
	
	void registerUser(PassengerDetails passenger);
	
	TicketDetails bookTicket(FlightDetails flights,PassengerDetails passengerDetails);
	
	void cancelTicket(String reason,TicketDetails details);

	List<FlightDetails> showAvailableFlights(String currentlocation, String destination);
	
	FlightDetails selectFlightWithLowPrice(List<FlightDetails> flightList);
	

}
