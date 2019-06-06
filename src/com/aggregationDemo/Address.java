package com.aggregationDemo;

public class Address {
	String streetName;
	int aptNo;
	String city;
	
	public Address(String streetName, int aptNo, String city) {
		super();
		this.streetName = streetName;
		this.aptNo = aptNo;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", aptNo=" + aptNo + ", city=" + city + "]";
	}
}
