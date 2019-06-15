package com.hcl.pet.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.pet.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public User findByUserNameAndPassword(String username, String password);

}
