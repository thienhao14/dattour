package com.example.dattour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dattour.dao.BookingDAO;
import com.example.dattour.model.Booking;

@Service
public class BookingService {
	@Autowired
	private BookingDAO bookingDAO;
	public Booking saveBooking(Booking booking) {
		return bookingDAO.saveBooking(booking);
	}
}
