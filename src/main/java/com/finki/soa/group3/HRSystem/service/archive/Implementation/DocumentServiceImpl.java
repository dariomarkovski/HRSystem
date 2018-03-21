package com.finki.soa.group3.HRSystem.service.archive.Implementation;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.DocumentNotFoundException;
import com.finki.soa.group3.HRSystem.persistence.archive.DocumentRepository;
import com.finki.soa.group3.HRSystem.persistence.person.HrWorkerRepository;
import com.finki.soa.group3.HRSystem.persistence.person.PersonRepository;
import com.finki.soa.group3.HRSystem.service.archive.DocumentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService{
    private final DocumentRepository documentRepository;
    private final HrWorkerRepository hrWorkerRepository;
    private final PersonRepository personRepository;
    public static Long SEQUENCE = 1L;

    public DocumentServiceImpl(DocumentRepository documentRepository, HrWorkerRepository hrWorkerRepository, PersonRepository personRepository) {
        this.documentRepository = documentRepository;
        this.hrWorkerRepository = hrWorkerRepository;
        this.personRepository = personRepository;
    }

    @Override
    public Document save(Document document, String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if(document.getSignaturesFromHR()==null){
            HrWorker hrWorker = new HrWorker();
            Long num = SEQUENCE;
            num++;
            hrWorker.setEMBG(String.valueOf(num));
            hrWorker.setFirstName("RandomName"+String.valueOf(num));
            hrWorker.setLastName("RandomLastName"+String.valueOf(num));
            SEQUENCE++;
            hrWorkerRepository.save(hrWorker);
            document.setSignaturesFromHR(hrWorker);
        }
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

}
