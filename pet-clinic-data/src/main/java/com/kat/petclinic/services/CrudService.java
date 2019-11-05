package com.kat.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {   //generics, coz other Services will extend it

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete (T object);

    void deteleById(ID id);
}
