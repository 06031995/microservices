package com.hoteService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoteService.model.Hotel;
import com.hoteService.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@PostMapping
	public Hotel create(@RequestBody Hotel hotel) {
		Hotel hotel2 = hotelService.create(hotel);
		return hotel2;
	}
	
	@GetMapping
	public List<Hotel> getAll(){
		List<Hotel> all = hotelService.getAll();
		return all;
	}
	
	@GetMapping("/{id}")
	public Hotel getbyId(@PathVariable String id){
		Hotel list=(Hotel) hotelService.getById(id);
		return list;
		
	}

}
