package com.kat.petclinic.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

}
