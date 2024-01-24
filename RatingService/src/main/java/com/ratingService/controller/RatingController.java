package com.ratingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingService.model.Rating;
import com.ratingService.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping
	public Rating create(@RequestBody Rating rating) {
		Rating ra=ratingService.create(rating);
		return ra;
	}
	
	@GetMapping
	public List<Rating> getAll(){
		List<Rating> list=ratingService.getAll();
		return list;
	}
	
	//get rating by UserId
	@GetMapping("/user/{userId}")
	public List<Rating> getByUserId(@PathVariable String userId) {
		List<Rating> byUserId = ratingService.getByUserId(userId);
		return byUserId;
	}
	
	//get rating by UserId
		@GetMapping("/hotel/{hotelId}")
		public List<Rating> getByHotelId(@PathVariable String hotelId) {
			List<Rating> byHotelId = ratingService.getByHotelId(hotelId);
			return byHotelId;
		}

}
