package com.ratingService.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingService.model.Rating;
import com.ratingService.repo.RatingRepo;
import com.ratingService.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	@Autowired
	RatingRepo ratingRepo;

	@Override
	public Rating create(Rating rating) {
		String string = UUID.randomUUID().toString();
		rating.setRating_id(string);
		Rating save = ratingRepo.save(rating);
		return save;
	}

	@Override
	public List<Rating> getAll() {
		List<Rating> all = ratingRepo.findAll();
		return all;
	}

	@Override
	public List<Rating> getByUserId(String userId) {
		 List<Rating> byUserId = ratingRepo.getByUserId(userId);
		return byUserId;
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		 List<Rating> byHotelId = ratingRepo.getByHotelId(hotelId);
		return byHotelId;
	}

}
