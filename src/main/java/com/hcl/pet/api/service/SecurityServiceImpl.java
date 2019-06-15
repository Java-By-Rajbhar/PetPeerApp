package com.hcl.pet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pet.api.dao.UserRepository;
import com.hcl.pet.api.model.User;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private UserRepository userRepository;
	String temp="";
	@Override
	public String authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
	if(username!=null &&password!=null)
	{
		User user =userRepository.findByUserNameAndPassword(username, password);
		System.out.println("user data : "+user);
		if(user==null)
		{
			temp="No data found";
		}
		else
		{
			temp=username+" has been login successfully";
		}
	}
	else {
		temp="Please pass username and password";
	}
		return temp;
	}

}
