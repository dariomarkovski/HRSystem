package com.finki.soa.group3.HRSystem.model.archive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Document History")
public class PreviousDocumentState {

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
