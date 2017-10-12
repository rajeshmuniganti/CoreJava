package com.src.cloning.practice;

public class EmployeeAddress {
	private String flatNo;
	private String street;
	private String city;

	public EmployeeAddress(String flatNo, String street, String city) {
		super();
		this.flatNo = flatNo;
		this.street = street;
		this.city = city;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [flatNo=" + flatNo + ", street=" + street + ", city=" + city + "]";
	}

}
