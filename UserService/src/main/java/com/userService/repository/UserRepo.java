package com.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userService.model.User;

public interface UserRepo extends JpaRepository<User, String>{ //it provide all methods
	
	//you want to implament custome 

}
