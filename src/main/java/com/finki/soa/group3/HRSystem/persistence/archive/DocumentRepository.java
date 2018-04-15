package com.finki.soa.group3.HRSystem.persistence.archive;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface DocumentRepository extends CrudRepository<Document, Long> {

    Iterable<Document> findAllByLabel(String label);

}
