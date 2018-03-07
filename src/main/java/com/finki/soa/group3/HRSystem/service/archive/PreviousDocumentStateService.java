package com.finki.soa.group3.HRSystem.service.archive;

import com.finki.soa.group3.HRSystem.model.archive.PreviousDocumentState;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.PreviousDocumentNotFoundException;

import java.util.Optional;

public interface PreviousDocumentStateService {

    PreviousDocumentState save(PreviousDocumentState document);

    Optional<PreviousDocumentState> findOne(Long id) throws PreviousDocumentNotFoundException;

    void delete(Long id);

    Iterable<PreviousDocumentState> findByDocumentLabel(String label);

    Iterable<PreviousDocumentState> findAll();

}
