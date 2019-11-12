package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
