package com.finki.soa.group3.HRSystem.service.archive.Implementation;

import com.finki.soa.group3.HRSystem.model.archive.PreviousDocumentState;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.PreviousDocumentNotFoundException;
import com.finki.soa.group3.HRSystem.persistance.archive.PreviousDocumentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PreviousDocumentStateService implements com.finki.soa.group3.HRSystem.service.archive.PreviousDocumentStateService{
    private final PreviousDocumentRepository repository;

    public PreviousDocumentStateService(PreviousDocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public PreviousDocumentState save(PreviousDocumentState document) {
        return this.repository.save(document);
    }

    @Override
    public Optional<PreviousDocumentState> findOne(Long id) throws PreviousDocumentNotFoundException {
        Optional<PreviousDocumentState> previousDocumentState = repository.findById(id);
        if(previousDocumentState.isPresent()) {
            return previousDocumentState;
        }
        else {
            throw new PreviousDocumentNotFoundException(id);
        }
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<PreviousDocumentState> findByDocumentLabel(String label) {
        return this.repository.findByDocumentLabel(label);
    }

    @Override
    public Iterable<PreviousDocumentState> findAll() {
        return this.repository.findAll();
    }
}
