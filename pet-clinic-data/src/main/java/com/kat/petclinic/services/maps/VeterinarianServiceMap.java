package com.kat.petclinic.services.maps;

import com.kat.petclinic.entities.Veterinarian;
import com.kat.petclinic.services.CrudService;

import java.util.Set;

public class VeterinarianServiceMap extends AbstractMapService<Veterinarian, Long>  implements CrudService<Veterinarian, Long> {

    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Veterinarian object) {
        super.delete(object);
    }

    @Override
    public void deteleById(Long id) {
        super.deleteById(id);
    }
}
