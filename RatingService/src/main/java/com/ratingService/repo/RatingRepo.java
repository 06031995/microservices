package com.ratingService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ratingService.model.Rating;

public interface RatingRepo extends JpaRepository<Rating, String>{

	@Query(value = "select * from rating where user_id=:userId",nativeQuery = true)
	List<Rating> getByUserId(String userId);

	@Query(value = "select * from rating where hotel_id=:hotelId",nativeQuery = true)
	List<Rating> getByHotelId(String hotelId);

}
