package com.kat.petclinic.bootstrap;

import com.kat.petclinic.entities.Owner;
import com.kat.petclinic.entities.PetType;
import com.kat.petclinic.entities.Vet;
import com.kat.petclinic.services.OwnerService;
import com.kat.petclinic.services.PetTypeService;
import com.kat.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType cat = new PetType();
        cat.setName("Dog");

        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setName("Graham");
        owner1.setSurname("Masterton");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setName("Anne");
        owner2.setSurname("Rice");

        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setName("Vlad");
        vet1.setSurname("Tepesz");

        vetService.save(vet1);

    }
}
