package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
