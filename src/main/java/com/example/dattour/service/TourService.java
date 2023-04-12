package com.example.dattour.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dattour.dao.BookingDAO;
import com.example.dattour.dao.CustomerDAO;
import com.example.dattour.dao.TourDAO;
import com.example.dattour.model.Booking;
import com.example.dattour.model.Customer;
import com.example.dattour.model.Tour;

@Service
public class TourService {
	
	@Autowired
	private TourDAO tourDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private BookingDAO bookingDAO;
	
	
	public ArrayList<Tour> getAllTours(){
		return tourDAO.getAllTours();
	}

	public Tour getTour(long id) {
		return tourDAO.getTour(id);
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerDAO.saveCustomer(customer);
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingDAO.saveBooking(booking);
	}
	
}
