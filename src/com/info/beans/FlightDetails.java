package com.info.beans;

public class FlightDetails {
	
	private String flightName;
	
	private Integer flightNo;
	
	private String fromCity;
	
	private String tocity;
	
	private String date;
	
	private String airportName;
	
	private Integer totalFare;


	public FlightDetails(String flightName, Integer flightNo, String fromCity, String tocity, String date,
			String airportName, Integer totalFare) {
		super();
		this.flightName = flightName;
		this.flightNo = flightNo;
		this.fromCity = fromCity;
		this.tocity = tocity;
		this.date = date;
		this.airportName = airportName;
		this.totalFare = totalFare;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Integer getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Integer getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(Integer totalFare) {
		this.totalFare = totalFare;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightName=" + flightName + ", flightNo=" + flightNo + ", fromCity=" + fromCity
				+ ", tocity=" + tocity + ", date=" + date + ", airportName=" + airportName + ", totalFare=" + totalFare
				+ "]";
	}
	
	
	
	

}
