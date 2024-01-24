package com.hoteService.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoteService.model.Hotel;
import com.hoteService.repo.HotelRepo;
import com.hoteService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepo hotelRepo;

	@Override
	public Hotel create(Hotel hotel) {
		String randomUUID = UUID.randomUUID().toString();
		hotel.setId(randomUUID);
		Hotel save = hotelRepo.save(hotel);
		return save;
	}

	@Override
	public List<Hotel> getAll() {
		List<Hotel> all = hotelRepo.findAll();
		return all;
	}

	@Override
	public Hotel getById(String id) {
		 Hotel byId = hotelRepo.getById(id);
		return byId;
	}

}
