package com.finki.soa.group3.HRSystem.model.training;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String description;

    @OneToMany (mappedBy = "Category")
    private List<Video> videos;

    @OneToMany (mappedBy = "Category")
    private List<Course> courses;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
