package com.info.bookingService;

import com.info.beans.Passenger;

public class TicketFactory {
	
	
	public Booking getInstance(String obj ) {
		if(obj.equals("Passenger")) {
			return new Passenger();
		}
		
		return null;
		
	}

}
