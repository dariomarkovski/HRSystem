package com.finki.soa.group3.HRSystem.model.archive;

import com.finki.soa.group3.HRSystem.model.Person;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Document")
public class Document {
    //id na dokumentot
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String label;

    @Column(nullable = true)
    private String description;

    private LocalDateTime dateOfCreation;

    @Column(nullable = true)
    private LocalDateTime dateOfExpiration;

    @Column(nullable = true)
    private LocalDateTime notificationDate;

    private String context;

    @JoinColumn(nullable = false)
    @ManyToOne
    private HrWorker HRSignatory;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Person externalSignatory;

    @JoinColumn(nullable = false)
    @ManyToOne
    private PreviousDocumentState documentState;

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


    public Document(String label, String description, LocalDateTime dateOfCreation, LocalDateTime dateOfExpiration, LocalDateTime notificationDate, String context) {
        this.label = label;
        this.description = description;
        this.dateOfCreation = dateOfCreation;
        this.dateOfExpiration = dateOfExpiration;
        this.notificationDate = notificationDate;
        this.context = context;
    }
}