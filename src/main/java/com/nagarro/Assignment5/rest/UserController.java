package com.nagarro.Assignment5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Assignment5.entity.User;
import com.nagarro.Assignment5.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userservice;

	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		System.out.println(user);
		return userservice.login(user);
	}

}
