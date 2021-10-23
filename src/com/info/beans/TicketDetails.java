package com.info.beans;

public class TicketDetails {
	
	
	private String passengerName;
	
	private String fromCity;
	
	private String toCity;
	
	private Integer totalFare;
	
	private Integer noOfTickets;
	
	private String arrivalTime;
	
	private String departureTime;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Integer getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(Integer totalFare) {
		this.totalFare = totalFare;
	}

	public Integer getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "TicketDetails [passengerName=" + passengerName + ", fromCity=" + fromCity + ", toCity=" + toCity
				+ ", totalFare=" + totalFare + ", noOfTickets=" + noOfTickets + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + "]";
	}
	
	

}
