package com.info.beans;

public class PassengerDetails {
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	private Long contactNumber;
	
	private String dob;
	
	private Integer totalTickets;
	
	private String currentLocation;
	
	private String destination;
	
	
	
	public PassengerDetails() {
		
	}

	

	//Getters and setters 
	public String getName() {
		return name;
	}

	public PassengerDetails(String name, Integer age, String email, Long contactNumber, String dob,
			Integer totalTickets, String currentLocation, String destination) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.contactNumber = contactNumber;
		this.dob = dob;
		this.totalTickets = totalTickets;
		this.currentLocation = currentLocation;
		this.destination = destination;
	}




	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getTotalTickets() {
		return totalTickets;
	}
	public void setTotalTickets(Integer totalTickets) {
		this.totalTickets = totalTickets;
	}


	public String getCurrentLocation() {
		return currentLocation;
	}


	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}



	@Override
	public String toString() {
		return "PassengerDetails [name=" + name + ", age=" + age + ", email=" + email + ", contactNumber="
				+ contactNumber + ", dob=" + dob + ", totalTickets=" + totalTickets + ", currentLocation="
				+ currentLocation + ", destination=" + destination + "]";
	}
	
	

}
