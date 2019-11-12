package com.kat.petclinic.repositories;

import com.kat.petclinic.entities.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
