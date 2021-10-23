package com.air.builder;

import com.info.beans.FlightDetails;

public class FlightBuilder {
	
	
    private String flightName;
	
	private Integer flightNo;
	
	private String fromCity;
	
	private String tocity;
	
	private String date;
	
	private String airportName;
	
	private Integer totalFare;

	public FlightBuilder setFlightName(String flightName) {
		this.flightName = flightName;
		return this;
	}

	public FlightBuilder setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
		return this;
	}

	public FlightBuilder setFromCity(String fromCity) {
		this.fromCity = fromCity;
		return this;
	}

	public FlightBuilder setTocity(String tocity) {
		this.tocity = tocity;
		return this;
	}

	public FlightBuilder setDate(String date) {
		this.date = date;
		return this;
	}

	public FlightBuilder setAirportName(String airportName) {
		this.airportName = airportName;
		return this;
	}
	
	
	public FlightBuilder setTotalFare(Integer totalFare) {
		this.totalFare = totalFare;
		return this;
	}

	public FlightDetails getFlight() {
		return new FlightDetails(flightName, flightNo, fromCity, tocity, date, airportName, totalFare);
	}
	
	

}
