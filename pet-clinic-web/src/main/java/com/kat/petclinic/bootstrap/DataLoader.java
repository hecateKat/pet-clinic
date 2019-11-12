package com.kat.petclinic.bootstrap;

import com.kat.petclinic.entities.*;
import com.kat.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0){
            loadData();
        }
    }

    private void loadData() {

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setName("Graham");
        owner1.setSurname("Masterton");
        owner1.setAddress("123 Darkshore");
        owner1.setCity("Miami");
        owner1.setTelephone("999666444");

        Pet grahamsPet = new Pet();
        grahamsPet.setPetType(savedDogPetType);
        grahamsPet.setName("Dracul");
        grahamsPet.setOwner(owner1);
        grahamsPet.setBirthDay(LocalDate.now().minusMonths(6));
        owner1.getPets().add(grahamsPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setName("Anne");
        owner2.setSurname("Rice");
        owner2.setAddress("321 Tirisfal");
        owner2.setCity("Stormwind");
        owner2.setTelephone("888555333");

        Pet anniesPet = new Pet();
        anniesPet.setPetType(savedCatPetType);
        anniesPet.setName("Luna");
        anniesPet.setOwner(owner2);
        anniesPet.setBirthDay(LocalDate.now().minusMonths(9));
        owner2.getPets().add(anniesPet);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(anniesPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);


        Vet vet1 = new Vet();
        vet1.setName("Vlad");
        vet1.setSurname("Tepesz");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setName("Mortizia");
        vet2.setSurname("Addams");
        vet2.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setName("Jaina");
        vet3.setSurname("Proudmore");
        vet3.getSpecialities().add(savedSurgery);

        vetService.save(vet3);
    }
}
