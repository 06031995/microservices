package com.userService.model;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Rating {

	private String rating_id;
	
	private String user_id;
	
	private String hotel_id;
	
	private int rating;
	
	private Hotel hotel;

	public String getRating_id() {
		return rating_id;
	}

	public void setRating_id(String rating_id) {
		this.rating_id = rating_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(String hotel_id) {
		this.hotel_id = hotel_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
  

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Rating(String rating_id, String user_id, String hotel_id, int rating) {
		super();
		this.rating_id = rating_id;
		this.user_id = user_id;
		this.hotel_id = hotel_id;
		this.rating = rating;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [rating_id=" + rating_id + ", user_id=" + user_id + ", hotel_id=" + hotel_id + ", rating="
				+ rating + "]";
	}
	
	
}
