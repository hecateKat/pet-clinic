package com.kat.petclinic.services.maps;

import com.kat.petclinic.entities.Owner;
import com.kat.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deteleById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findBySurname(String surname) {
        return null;
    }
}
