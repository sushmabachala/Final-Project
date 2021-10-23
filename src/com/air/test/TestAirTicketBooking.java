package com.air.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.air.builder.PassengerBuilder;
import com.info.beans.FlightDetails;
import com.info.beans.Passenger;
import com.info.beans.PassengerDetails;
import com.info.beans.TicketDetails;

class TestAirTicketBooking {
 
	Passenger passenger = new Passenger();
	
	@Test
	void testbookTicket() {
		PassengerDetails p1 = new PassengerBuilder().setName("Ankit").setAge(20).setDob("01-11-1996")
				.setEmail("ankit@gmail.com").setTotalTickets(3).getPassenger() ;
		
		FlightDetails f1 = new FlightDetails("Air India", 112, "Delhi", "dubai", "21-10-2021", "Indira gandhi Airport", 20000);
		
		TicketDetails details = passenger.bookTicket(f1, p1);
		
		
		assertNotNull(details);
	}
	
	@Test
	void showFlights() {
		List<FlightDetails> details1 = passenger.showAvailableFlights("Delhi", "dubai");
		assertNotNull(details1);
		
	}
	
	@Test
	void dontshowFlights() {
		
		List<FlightDetails> noflights = passenger.showAvailableFlights("somewhere", "germany");
		assertFalse(noflights.isEmpty());
	}



}
