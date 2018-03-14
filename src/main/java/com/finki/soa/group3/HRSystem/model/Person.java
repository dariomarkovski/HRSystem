package com.finki.soa.group3.HRSystem.model;

import com.finki.soa.group3.HRSystem.model.archive.Document;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String firstName;
    String lastName;
    String EMBG;

    @OneToMany(mappedBy = "signatures")
    private Set<Document> documents;

    public Person() {

    }

    public Person(String firstName, String lastName, String EMBG) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EMBG = EMBG;
    }
}
