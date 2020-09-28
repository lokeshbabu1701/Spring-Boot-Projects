package com.pet.clinic.service;

import com.pet.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
}
