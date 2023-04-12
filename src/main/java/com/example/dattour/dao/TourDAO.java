package com.example.dattour.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.dattour.model.Tour;

@Repository
public class TourDAO {
	private final long id = 0L;
	private static ArrayList<Tour> tours;

	public static ArrayList<Tour> initListTours() {
		tours = new ArrayList<>();
		tours.add(new Tour(1, "Phú Quốc", "3 ngày 2 đêm", "máy bay", "hằng ngày", 1595000));
		tours.add(new Tour(2, "Nha Trang", "2 ngày 2 đêm", "tàu lửa", "tối thứ 6 và CN", 1540000));
		return tours;
	}

	public ArrayList<Tour> getAllTours() {
		return initListTours();
	}

	
	public static Tour getTour(long id) {
		ArrayList<Tour> tours = initListTours();
		for(int i = 0; i<tours.size(); i++) {
			if(id == tours.get(i).getId()) {
				return tours.get(i);
			}
		}
		return null;
	}
}
