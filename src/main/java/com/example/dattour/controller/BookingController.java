package com.example.dattour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dattour.service.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
}
