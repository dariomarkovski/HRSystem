package com.finki.soa.group3.HRSystem.model.archive;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Document History")
public class PreviousDocumentState {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(nullable = false)
    LocalDateTime changedDate;

    @OneToMany
    private Set<Document> documentSet;

    public PreviousDocumentState(LocalDateTime changedDate) {
        this.changedDate = changedDate;
    }

    public PreviousDocumentState() {

    }
}
