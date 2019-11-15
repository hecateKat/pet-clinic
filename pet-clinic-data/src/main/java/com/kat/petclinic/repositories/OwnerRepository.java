package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String surname);

    List<Owner> findAllByLastNameLike (String surname);

}
