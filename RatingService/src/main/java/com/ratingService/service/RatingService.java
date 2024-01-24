package com.ratingService.service;

import java.util.List;

import com.ratingService.model.Rating;

public interface RatingService {

	Rating create(Rating rating);

	List<Rating> getAll();

	List<Rating> getByUserId(String userId);

	List<Rating> getByHotelId(String hotelId);

}
