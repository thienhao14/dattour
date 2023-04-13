package com.example.dattour.model;

import java.util.Date;

public class ShowBooking {
	private String name;
	private String address;
	private String email;
	private String phone;
	private Date departureDate;
	private int noAdults;
	private int noChildren;
	public ShowBooking(String name, String address, String email, String phone, Date departureDate, int noAdults,
			int noChildren) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.departureDate = departureDate;
		this.noAdults = noAdults;
		this.noChildren = noChildren;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public int getNoAdults() {
		return noAdults;
	}
	public void setNoAdults(int noAdults) {
		this.noAdults = noAdults;
	}
	public int getNoChildren() {
		return noChildren;
	}
	public void setNoChildren(int noChildren) {
		this.noChildren = noChildren;
	}
	@Override
	public String toString() {
		return "ShowBooking [name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", departureDate=" + departureDate + ", noAdults=" + noAdults + ", noChildren=" + noChildren + "]";
	}
	
	
}
