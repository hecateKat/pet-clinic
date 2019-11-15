package com.kat.petclinic.services;

import com.kat.petclinic.entities.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {  //we get all method implemented by CrudService

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike (String lastName);

}
