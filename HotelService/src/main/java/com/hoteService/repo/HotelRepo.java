package com.hoteService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hoteService.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, String>{
	
	

	@Query(value = "select * from hotel where id=:id",nativeQuery = true)
	public Hotel getById(String id);
}
