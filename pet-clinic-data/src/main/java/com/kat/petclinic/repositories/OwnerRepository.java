package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
