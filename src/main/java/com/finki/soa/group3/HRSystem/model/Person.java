package com.finki.soa.group3.HRSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String firstName;
    String lastName;
    String EMBG;

    public Person() {

    }

    public Person(String firstName, String lastName, String EMBG) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EMBG = EMBG;
    }
}
