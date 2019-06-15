package com.hcl.pet.api.service;

import java.util.List;

import com.hcl.pet.api.model.Pet;

public interface PetService {

	public List<Pet> savePet(Pet pet);
	
	public List<Pet> petDetail();
	
}
