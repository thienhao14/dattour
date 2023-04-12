package com.example.dattour.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dattour.model.Customer;
import com.example.dattour.model.Tour;
import com.example.dattour.service.CustomerService;
import com.example.dattour.service.TourService;

@Controller
@RequestMapping("/tour")
public class TourController {
	@Autowired
	private TourService tourService;
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("")
	public ArrayList<Tour> getAllTours() {
		System.out.print(tourService.getAllTours());
		return tourService.getAllTours();
	}

	@GetMapping("/listTours")
	public String list(Model model) {
		model.addAttribute("listTours", tourService.getAllTours());
		return "listTours";
	}

	@GetMapping("/{id}")
	public String getTour(@PathVariable long id, Model model) {
		Tour tourObj = tourService.getTour(id);
		model.addAttribute("tour", tourService.getTour(id));
		if (tourObj == null) {
			throw new RuntimeException("Tour not found");
		}
		return "tourDetails";
	}
	
	@GetMapping("/bookingTour")
	public String bookingTour() {
		return "bookingTour";
	}

	@PostMapping("/confirm")
	public String confirm(Customer customer, Model model) {
		Customer c = customerService.saveCustomer(customer);
		model.addAttribute("customer",c);
		return "confirm";
	}
	
}
