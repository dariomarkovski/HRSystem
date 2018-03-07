package com.finki.soa.group3.HRSystem.model.archive;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Document History")
public class PreviousDocumentState {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(nullable = false)
    LocalDateTime changedDate;
    @Column(nullable = false)
    Document previousState;

    public PreviousDocumentState(LocalDateTime changedDate, Document previousState) {
        this.changedDate = changedDate;
        this.previousState = previousState;
    }

    public PreviousDocumentState() {

    }

}
