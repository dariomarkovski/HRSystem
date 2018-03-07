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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDateTime getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDateTime dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDateTime getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(LocalDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public List<HrWorker> getHRSignatory() {
        return HRSignatory;
    }

    public void setHRSignatory(List<HrWorker> HRSignatory) {
        this.HRSignatory = HRSignatory;
    }

    public List<Person> getExternalSignatory() {
        return ExternalSignatory;
    }

    public void setExternalSignatory(List<Person> externalSignatory) {
        ExternalSignatory = externalSignatory;
    }

    public List<PreviousDocumentState> getPreviousStates() {
        return previousStates;
    }

    public void setPreviousStates(List<PreviousDocumentState> previousStates) {
        this.previousStates = previousStates;
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