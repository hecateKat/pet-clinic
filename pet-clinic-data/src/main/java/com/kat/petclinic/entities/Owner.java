package com.kat.petclinic.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id, String name, String surname, String address, String city, String telephone, Set<Pet> pets) {
        super(id, name, surname);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }


    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")  //if I delete owner, his pets will be deleted aswell
    private Set<Pet> pets = new HashSet<>();
}
