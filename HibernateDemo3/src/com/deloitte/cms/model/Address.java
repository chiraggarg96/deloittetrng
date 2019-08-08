package com.deloitte.cms.model;



public class Address {

	private int aId;
	private String city;
	private String state;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", state=" + state + "]";
	}


	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		this.state = state;
	}

	
}
