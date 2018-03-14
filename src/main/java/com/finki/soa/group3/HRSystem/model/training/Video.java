package com.finki.soa.group3.HRSystem.model.training;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private URL url;
    private String description;
    private String[] tags;

    @JoinColumn
    @ManyToOne
    private Category category;

    @JoinColumn
    @ManyToOne
    private Course course;

    public Video(long id, String name, URL url, String description, String[] tags) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
        this.tags = tags;
    }

    public URL getUrl() {

        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
