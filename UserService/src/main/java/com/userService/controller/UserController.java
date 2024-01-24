package com.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userService.model.User;
import com.userService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	// create user
	@PostMapping
	public User saveUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		System.out.println(saveUser);

		return saveUser;

	}
	// get All User
   @GetMapping
	public List<User> getAllUser() {
		List<User> allUser = userService.getAllUser();
		System.out.println(allUser);
		return allUser;
	}

	/// get By Id
   @GetMapping("/{id}")
	public User getById(@PathVariable String id) {
		User byId = userService.getById(id);
		System.out.println(byId);
		return byId;

	}
}
