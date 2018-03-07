package com.finki.soa.group3.HRSystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

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
