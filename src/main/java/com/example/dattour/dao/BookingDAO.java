package com.example.dattour.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.dattour.model.Booking;

@Repository
public class BookingDAO {

private static ArrayList<Booking> bookings;
	
	public ArrayList<Booking> initListBookings(){
		bookings = new ArrayList<>();
		return bookings;
	}
	
	public Booking saveBooking(Booking booking) {
		bookings.add(booking);
		return booking;
	}

}
