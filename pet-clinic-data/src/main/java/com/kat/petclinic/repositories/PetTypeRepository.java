package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
