package com.finki.soa.group3.HRSystem.model.archive;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Director")
public class Director extends HrWorker{

    public Director() {
    }

    public Director(String firstName, String lastName, String EMBG, List<Document> contractsSigned) {
        super(firstName, lastName, EMBG, contractsSigned);
    }


}
