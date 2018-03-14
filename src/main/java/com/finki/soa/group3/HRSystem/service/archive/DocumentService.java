package com.finki.soa.group3.HRSystem.service.archive;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.DocumentNotFoundException;

import java.time.LocalDateTime;
import java.util.Optional;

public interface DocumentService {
    Document save(Document document, String date);

    Optional<Document> findOne(Long id) throws DocumentNotFoundException;

    void delete(Long id);

    Iterable<Document> findByLabel(String label);

    Iterable<Document> findAll();

    Iterable<Document> findByDateOfCreationMonth(Integer month);

    Iterable<Document> findByDateOfCreationYear(Integer year);

    Iterable<Document> findByDateOfCreationYearAndLabel(Integer year, String label);

    Iterable<Document> findByDateOfCreationMonthAndLabel(Integer month, String label);

    //Iterable<Document> findByDateOfExpiraionBefore(LocalDateTime date);
}
