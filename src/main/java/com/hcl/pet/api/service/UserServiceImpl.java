package com.hcl.pet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pet.api.dao.UserRepository;
import com.hcl.pet.api.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		String temp="";
		User user1 =userRepository.save(user);
		if(user1==null)
		{
			temp="User registration has failed .Please try again";
		}
		else
		{
			temp="You are successfully registered. Please Sign in";
		}
		return temp;
	}
	/*
	 * @Override public String findByUserNameAndPassword(String username, String
	 * password) {
	 * 
	 * if(userRepository.findB)
	 * 
	 * return null; }
	 */

}
