package com.finki.soa.group3.HRSystem.model.archive.exceptions;

public class PreviousDocumentNotFoundException extends Exception{

    public PreviousDocumentNotFoundException(Long id) {
        super(String.format("Document with id: %d not found", id));
    }

}
