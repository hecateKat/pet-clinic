package com.kat.petclinic.services;

import com.kat.petclinic.entities.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();

}
