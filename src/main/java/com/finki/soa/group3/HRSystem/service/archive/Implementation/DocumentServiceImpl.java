package com.finki.soa.group3.HRSystem.service.archive.Implementation;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.DocumentNotFoundException;
import com.finki.soa.group3.HRSystem.persistence.archive.DocumentRepository;
import com.finki.soa.group3.HRSystem.service.archive.DocumentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService{
    private final DocumentRepository documentRepository;

    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public Document save(Document document, String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime expirationDate = LocalDateTime.parse(date,formatter);
        document.setDateOfCreation(LocalDateTime.now());
        document.setDateOfExpiration(expirationDate);
        return this.documentRepository.save(document);
    }

    @Override
    public Optional<Document> findOne(Long id) throws DocumentNotFoundException {
        Optional<Document> document = this.documentRepository.findById(id);
        if(document.isPresent()) {
            return document;
        }
        else {
            throw new DocumentNotFoundException(id);
        }
    }

    @Override
    public void delete(Long id) {
        this.documentRepository.deleteById(id);
    }

    @Override
    public Iterable<Document> findByLabel(String label) {
        return this.documentRepository.findAllByLabel(label);
    }

    @Override
    public Iterable<Document> findAll() {
        return this.documentRepository.findAll();
    }

    @Override
    public Iterable<Document> findByDateOfCreationMonth(Integer month) {
        return this.documentRepository.findAllByDateOfCreationMonthValue(month);
    }

    @Override
    public Iterable<Document> findByDateOfCreationYear(Integer year) {
        return this.documentRepository.findAllByDateOfCreationYear(year);
    }

    @Override
    public Iterable<Document> findByDateOfCreationYearAndLabel(Integer year, String label) {
        return this.documentRepository.findByDateOfCreationYearAndLabel(year,label);
    }

    @Override
    public Iterable<Document> findByDateOfCreationMonthAndLabel(Integer month, String label) {
        return this.documentRepository.findByDateOfCreationMonthValueAndLabel(month,label);
    }


}
