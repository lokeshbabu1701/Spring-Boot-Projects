package com.pet.clinic.service;

import java.util.Set;

import com.pet.clinic.model.Owner;
import com.pet.clinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Owner owner);
	
	Set<Vet> findAll();
}
