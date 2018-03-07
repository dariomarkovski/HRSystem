package com.finki.soa.group3.HRSystem.Training;

import java.net.URL;

public class Video {
    private long id;
    private String name;
    private URL url;
    private String description;
    private String[] tags;

    public Video(long id, String name, String description, String[] tags) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    public void CreateVideo(){
        System.out.println("Video "+ this.name +" was created");
        return ;
    }

    public void DeleteVideo(){
        System.out.println("Video"+ this.name +" was deleted");
        return ;
    }

    public void EditVideo(){
        System.out.println("Video"+ this.name +" was edited");
        return ;
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
