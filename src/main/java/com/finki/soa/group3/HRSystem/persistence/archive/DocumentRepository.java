package com.finki.soa.group3.HRSystem.persistence.archive;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface DocumentRepository extends CrudRepository<Document, Long> {

    Iterable<Document> findAllByLabel(String label);

    Iterable<Document> findAllByDateOfCreationMonthValue(Integer value);

    Iterable<Document> findAllByDateOfCreationYear(Integer year);

    Iterable<Document> findByDateOfCreationYearAndLabel(Integer year, String label);

    Iterable<Document> findByDateOfCreationMonthValueAndLabel(Integer value, String label);

    Iterable<Document> findByDateOfExpiraion(LocalDateTime date);
}
