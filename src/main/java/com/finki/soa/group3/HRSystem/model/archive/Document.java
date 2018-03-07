package com.finki.soa.group3.HRSystem.model.archive;

import com.finki.soa.group3.HRSystem.model.Person;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

public class Document {
    //id na dokumentot
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //labela na dokumentot (mozhe da bide i posebna klasa)
    private String label;
    //opis na dokumentot

    @Column(nullable = true)
    private String description;
    //date na kreiranje

    private LocalDateTime dateOfCreation;
    //date na istekuvanje

    @Column(nullable = true)
    private LocalDateTime dateOfExpiration;
    //data koga treba da stigne notifikacija

    @Column(nullable = true)
    private LocalDateTime notificationDate;
    //Kontekst na dokumentot


    private String context;
    //potpisnici od HR timot dokolku gi ima
    //@OneToMany

    @Column(nullable = true)
    private List<HrWorker> HRSignatory;
    //potpisnici od vraboteni dokolju gi ima
    //@OneToMany

    @Column(nullable = true)
    private List<Person> ExternalSignatory;
    //prehodna sostojba na dokumentot
    //@OneToMany

    @Column(nullable = true)
    private List<PreviousDocumentState> previousStates;

    public Document() {

    }

    public Document(String label, String description, LocalDateTime dateOfCreation, LocalDateTime dateOfExpiration, LocalDateTime notificationDate, String context, List<HrWorker> HRSignatory, List<Person> externalSignatory, List<PreviousDocumentState> previousStates) {
        this.label = label;
        this.description = description;
        this.dateOfCreation = dateOfCreation;
        this.dateOfExpiration = dateOfExpiration;
        this.notificationDate = notificationDate;
        this.context = context;
        this.HRSignatory = HRSignatory;
        ExternalSignatory = externalSignatory;
        this.previousStates = previousStates;
    }
}