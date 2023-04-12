package com.example.dattour.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dattour.model.Tour;
import com.example.dattour.service.TourService;

@Controller
@RequestMapping("/tour")
public class TourController {
	@Autowired
	private TourService tourService;

	@GetMapping("")
	public ArrayList<Tour> getAllTours() {
		System.out.print(tourService.getAllTours());
		return tourService.getAllTours();
	}

	@GetMapping("/list")
	public String getList() {
		return "listTours";
	}

//	@GetMapping("/{id}")
//	public Tour getTour(long id) {
//		Tour tourObj = tourService.getTour(id);
//		if(tourObj == null) {
//			throw new RuntimeException("Tour not found");
//		}
//		return tourObj;
//	}
}
