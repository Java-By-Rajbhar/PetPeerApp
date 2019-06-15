package com.hcl.pet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pet.api.model.Pet;
import com.hcl.pet.api.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	
@Autowired PetService petService;
	
	@PostMapping("/addPet")
	public List<Pet> addPet(@RequestBody Pet pet) {
		
		return petService.savePet(pet);	
	}
	@GetMapping("/petDetail")
	public List<Pet> petDetail()
	{
		return petService.petDetail();
	}

}
