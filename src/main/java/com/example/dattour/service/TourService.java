package com.example.dattour.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.dattour.model.Tour;

@Service
public class TourService {
	public ArrayList<Tour> getAllTours(){
		ArrayList<Tour> tours = new ArrayList<>();
		tours.add(new Tour(1, "Phú Quốc", "3 ngày 2 đêm", "máy bay", "hằng ngày", 1595000));
		tours.add(new Tour(2, "Nha Trang", "2 ngày 2 đêm", "tàu lửa", "tối thứ 6 và CN", 1540000));
		return tours;
	}

	public Tour getTour(long id) {
		Tour tourObj = new Tour();
		tourObj.getId();
		return tourObj;
	}
}
