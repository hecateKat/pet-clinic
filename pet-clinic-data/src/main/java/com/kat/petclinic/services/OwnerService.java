package com.kat.petclinic.services;

import com.kat.petclinic.entities.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {  //we get all method implemented by CrudService

    Owner findBySurname(String surname);

    List<Owner> findAllBySurnameLike (String surname);

}
