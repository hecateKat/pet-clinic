package com.kat.petclinic.services.springdatajpa;

import com.kat.petclinic.entities.Vet;
import com.kat.petclinic.repositories.VetRepository;
import com.kat.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSpringDataJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSpringDataJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();

        vetRepository.findAll().forEach(vets::add);

        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deteleById(Long id) {
        vetRepository.deleteById(id);
    }
}
