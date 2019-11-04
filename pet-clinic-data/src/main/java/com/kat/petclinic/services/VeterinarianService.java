package com.kat.petclinic.services;

import com.kat.petclinic.entities.Veterinarian;

import java.util.Set;

public interface VeterinarianService {

    Veterinarian findById(Long id);

    Veterinarian save (Veterinarian veterinarian);

    Set<Veterinarian> findAll ();
}
