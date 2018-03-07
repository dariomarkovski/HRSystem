package com.finki.soa.group3.HRSystem.model.archive;

import com.finki.soa.group3.HRSystem.model.Employee;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "HrPersonal")
public class HrWorker extends Employee {

    @OneToMany
    List<Document> contractsSigned;

    public HrWorker() {

    }

    public HrWorker(String firstName, String lastName, String EMBG, List<Document> contractsSigned) {
        super(firstName, lastName, EMBG);
        this.contractsSigned = contractsSigned;
    }
}
