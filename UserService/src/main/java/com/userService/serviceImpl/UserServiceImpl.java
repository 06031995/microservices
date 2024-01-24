package com.userService.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userService.exception.UserException;
import com.userService.feignClient.HotelService;
import com.userService.model.Hotel;
import com.userService.model.Rating;
import com.userService.model.User;
import com.userService.repository.UserRepo;
import com.userService.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	//@Autowired
	//HotelService hotelservice;
	
	private Logger logger =LoggerFactory.getLogger(UserService.class);

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//generate uniqe userId
		String randomUUID = UUID.randomUUID().toString();
		user.setUser_id(randomUUID);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepo.findAll();  
	}

	@Override
	public User getById(String id) {
		// TODO Auto-generated method stub

		User user = userRepo.findById(id).orElseThrow(() -> new UserException("Not Found.......By" + id)); // custom
																											// exception

		// fetch rating of above user using RestTempate
		Rating[] forObject = restTemplate.getForObject("http://localhost:8083/rating/user/ " + user.getUser_id(),
				Rating[].class);
		List<Rating> list = Arrays.stream(forObject).toList();
		list.forEach(a -> {
           //hotel service
			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://localhost:8082/hotel/" + a.getHotel_id(), Hotel.class);
			Hotel body = forEntity.getBody();
			//Hotel body = hotelservice.getHotel(a.getHotel_id());
			a.setHotel(body);
		});

		System.out.println(forObject);
		logger.info("{}", forObject);
		user.setRating(list);

		return user;
	}

	
}
