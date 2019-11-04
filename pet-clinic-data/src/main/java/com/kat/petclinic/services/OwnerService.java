package com.kat.petclinic.services;

import com.kat.petclinic.entities.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findBySurname(String surname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
