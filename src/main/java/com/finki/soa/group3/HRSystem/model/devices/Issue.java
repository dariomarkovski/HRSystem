package com.finki.soa.group3.HRSystem.model.devices;

import javax.persistence.*;

public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Device device;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean resolved;
}
