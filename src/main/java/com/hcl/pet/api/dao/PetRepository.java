package com.hcl.pet.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.pet.api.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
