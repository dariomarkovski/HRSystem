package com.finki.soa.group3.HRSystem.model.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {


    @GeneratedValue
    @Id
    private long number;
    @ManyToOne
    private Course course;



    public Chapter(Course course) {
        this.course = course;
    }
}
