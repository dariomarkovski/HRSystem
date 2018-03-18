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

}
