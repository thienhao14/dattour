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
		tours.add(new Tour(3, "Côn Đảo", "3 ngày 2 đêm", "máy bay", "hằng ngày", 1345000));
		tours.add(new Tour(4, "Phan Thiết", "2 ngày 1 đêm", "tàu lửa", "thứ 7 mỗi tuần", 1250000));
		tours.add(new Tour(5, "Đà Lạt", "2 ngày 2 đêm", "xe khách", "thứ 7 mỗi tuần", 1320000));
		tours.add(new Tour(6, "Nha Trang", "4 ngày 3 đêm", "tàu lửa", "định kỳ", 1790000));
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
