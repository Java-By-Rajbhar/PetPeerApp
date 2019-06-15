package com.hcl.pet.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pet.api.dao.PetRepository;
import com.hcl.pet.api.model.Pet;

@Service
public class PetServiceImpl implements PetService {
	
	@Autowired PetRepository petRepository;

	@Override
	public List<Pet> savePet(Pet pet) {
		    petRepository.save(pet);
			return petRepository.findAll();
		
	}

	@Override
	public List<Pet> petDetail() {
		// TODO Auto-generated method stub
		return petRepository.findAll();
	}

}
