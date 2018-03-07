package com.finki.soa.group3.HRSystem.model;

import com.finki.soa.group3.HRSystem.model.Person;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

    public Employee() {
    }

    public Employee(String firstName, String lastName, String EMBG) {
        super(firstName, lastName, EMBG);
    }
}
