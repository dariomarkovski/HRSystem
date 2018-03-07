package com.finki.soa.group3.HRSystem.persistance.archive;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import com.finki.soa.group3.HRSystem.model.archive.PreviousDocumentState;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PreviousDocumentRepository extends CrudRepository<PreviousDocumentState, Long>{

    Iterable<PreviousDocumentState> findByDocumentLabel(String documentLabel);

}
