package com.finki.soa.group3.HRSystem.WEB.archive;

import com.finki.soa.group3.HRSystem.model.archive.Document;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.DocumentNotFoundException;
import com.finki.soa.group3.HRSystem.service.archive.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping(value = "documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    Document save(@ModelAttribute Document document, @RequestParam("date") String date) {
        return this.documentService.save(document,date);
    }

    @GetMapping
    Optional<Document> findOne(Long id) throws DocumentNotFoundException {
        return this.documentService.findOne(id);
    }

    @DeleteMapping
    void delete(Long id) {
        this.documentService.delete(id);
    }

    @GetMapping(value = "/{label}")
    Iterable<Document> findByLabel(@PathVariable("label") String label) {
        return documentService.findByLabel(label);
    }

    @GetMapping(value = "/all")
    Iterable<Document> findAll() {
        return documentService.findAll();
    }

    @GetMapping(value = "/month/{month}")
    Iterable<Document> findByDateOfCreationMonth(@PathVariable("month") Integer month) {
        return documentService.findByDateOfCreationMonth(month);
    }

    @GetMapping(value = "/year/{year}")
    Iterable<Document> findByDateOfCreationYear(@PathVariable("year") Integer year) {
        return documentService.findByDateOfCreationYear(year);
    }

    @GetMapping(value = "/year/label/{year}/{label}")
    Iterable<Document> findByDateOfCreationYearAndLabel(@PathVariable("year") Integer year, @PathVariable("label") String label) {
        return documentService.findByDateOfCreationYearAndLabel(year,label);
    }

    @GetMapping(value = "/month/label/{month}/{label}")
    Iterable<Document> findByDateOfCreationMonthAndLabel(@PathVariable("month") Integer month, @PathVariable("label") String label) {
        return documentService.findByDateOfCreationMonthAndLabel(month, label);
    }


    /*Iterable<Document> findByDateOfExpiraionBefore(LocalDateTime date) {
        return null;
    }*/

}
