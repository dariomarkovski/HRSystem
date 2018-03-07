package com.finki.soa.group3.HRSystem.Training.Model;

import javax.persistence.*;
import java.net.URL;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;

    @OneToMany (mappedBy = "Video")
    private List<Video> videos;

    @OneToMany (mappedBy = "Course")
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
