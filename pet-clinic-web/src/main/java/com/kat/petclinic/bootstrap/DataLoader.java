package com.kat.petclinic.bootstrap;

import com.kat.petclinic.entities.Owner;
import com.kat.petclinic.entities.Vet;
import com.kat.petclinic.services.OwnerService;
import com.kat.petclinic.services.VetService;
import com.kat.petclinic.services.maps.OwnerServiceMap;
import com.kat.petclinic.services.maps.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setName("Graham");
        owner1.setSurname("Masterton");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setName("Anne");
        owner2.setSurname("Rice");

        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setName("Vlad");
        vet1.setSurname("Tepesz");

        vetService.save(vet1);

    }
}
