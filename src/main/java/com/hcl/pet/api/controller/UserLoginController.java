package com.hcl.pet.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pet.api.service.SecurityServiceImpl;

@RestController
@RequestMapping("/") 
public class UserLoginController {

	@Autowired
	private SecurityServiceImpl SecurityServiceImpl;
	@PostMapping("/user/authenticate")
	public String authenticateUser(@RequestParam("userName") String user,@RequestParam("password") String pass)
	{
		return SecurityServiceImpl.authenticateUser(user, pass);
	}
}
