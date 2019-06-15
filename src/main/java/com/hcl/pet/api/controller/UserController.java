package com.hcl.pet.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pet.api.model.User;
import com.hcl.pet.api.service.UserServiceImpl;

@RestController
@RequestMapping("/registration")
public class UserController {
 
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/user/add")
	public String addUser(@RequestBody User user)
	{
		return userServiceImpl.addUser(user);
	}
}
