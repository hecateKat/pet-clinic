package com.kat.petclinic.services.maps;
import com.kat.petclinic.entities.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId = 1L;
    final String surname = "Wrynn";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());

        ownerServiceMap.save(Owner.builder().id(ownerId).surname(surname).build());
    }

    @Test
    void findAll() {

        Set<Owner> ownerSet = ownerServiceMap.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);

        assertEquals(ownerId, owner.getId());

    }

    @Test
    void saveExistingId() {
        Long id = 2L;

        Owner owner2 = Owner.builder().id(id).build();

        Owner savedOwner = ownerServiceMap.save(owner2);

        assertEquals(id, savedOwner.getId());

    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());

    }


    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {

        ownerServiceMap.deleteById(ownerId);

        assertEquals(0, ownerServiceMap.findAll().size());

    }

    @Test
    void findBySurname() {
        Owner wrynn = ownerServiceMap.findBySurname(surname);

        assertNotNull(wrynn);

        assertEquals(ownerId, wrynn.getId());

    }
}