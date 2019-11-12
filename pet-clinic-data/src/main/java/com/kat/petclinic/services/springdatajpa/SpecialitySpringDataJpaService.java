package com.kat.petclinic.services.springdatajpa;

import com.kat.petclinic.entities.Speciality;
import com.kat.petclinic.repositories.SpecialityRepository;
import com.kat.petclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

public class SpecialitySpringDataJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySpringDataJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialities = new HashSet<>();

        specialityRepository.findAll().forEach(specialities::add);

        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
