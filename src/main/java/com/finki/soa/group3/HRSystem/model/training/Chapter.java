package com.finki.soa.group3.HRSystem.model.training;

import javax.persistence.*;

@Entity
public class Chapter {


    @GeneratedValue
    @Id
    private long number;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Course course;

    public Chapter(Course course) {
        this.course = course;
    }

    public Chapter () {

    }
}
