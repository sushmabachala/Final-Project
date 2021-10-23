package com.air.observer;

import com.info.beans.PassengerDetails;



public class OfferAlert {
	
	Users users = new Users();
	
	public void sendOfferNotification(PassengerDetails user) {
		users.notifyUser("Air Ticket Offer - Up to ₹5000 Off, Code CTFLY - airtrip.com", user.getName());
	}

}
