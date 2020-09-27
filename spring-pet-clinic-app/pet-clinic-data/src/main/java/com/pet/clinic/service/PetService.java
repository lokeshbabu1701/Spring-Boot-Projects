package com.pet.clinic.service;

import java.util.Set;

import com.pet.clinic.model.Owner;
import com.pet.clinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Owner owner);

	Set<Pet> findAll();
}
