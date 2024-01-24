package com.ratingService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Rating {
	
	@Id
    private String rating_id;
	
	private String user_id;
	
	private String hotel_id;

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

	public Rating(String rating_id, String user_id, String hotel_id) {
		super();
		this.rating_id = rating_id;
		this.user_id = user_id;
		this.hotel_id = hotel_id;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [rating_id=" + rating_id + ", user_id=" + user_id + ", hotel_id=" + hotel_id + "]";
	}
	
	

}
