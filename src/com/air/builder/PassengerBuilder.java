package com.air.builder;

import com.info.beans.PassengerDetails;

public class PassengerBuilder {
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	private Long contactNumber;
	
	private String dob;

	private Integer totalTickets;
	
    private String currentLocation;
	
	private String destination;
	
	public PassengerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PassengerBuilder setAge(Integer age) {
		this.age = age;
		return this;

	}

	public PassengerBuilder setEmail(String email) {
		this.email = email;
		return this;

	}

	public PassengerBuilder setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
		return this;

	}

	public PassengerBuilder setDob(String dob) {
		this.dob = dob;
		return this;

	}
	
	public PassengerBuilder setTotalTickets(Integer totalTickets) {
		this.totalTickets = totalTickets;
		return this;
	}
	
	

	public PassengerBuilder setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
		return this;

	}

	public PassengerBuilder setDestination(String destination) {
		this.destination = destination;
		return this;

	}

	public PassengerDetails getPassenger() {
		return new PassengerDetails(name, age, email, contactNumber, dob, totalTickets, currentLocation, destination);
	}
	

}
