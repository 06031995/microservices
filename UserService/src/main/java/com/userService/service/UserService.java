package com.userService.service;

import java.util.List;

import com.userService.model.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getById(String id);
	
	
	

}
