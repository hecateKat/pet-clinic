package com.kat.petclinic.services;

import com.kat.petclinic.entities.Owner;

public interface OwnerService extends CrudService<Owner, Long> {  //we get all method implemented by CrudService

    Owner findBySurname(String surname);

}
