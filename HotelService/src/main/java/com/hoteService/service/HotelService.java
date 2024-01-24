package com.hoteService.service;

import java.util.List;

import com.hoteService.model.Hotel;

public interface HotelService {
	

	public Hotel create(Hotel hotel);
	
	public List<Hotel> getAll();

	public Hotel getById(String id);
		
		

}
