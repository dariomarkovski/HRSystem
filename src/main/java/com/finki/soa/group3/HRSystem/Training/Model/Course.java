package com.finki.soa.group3.HRSystem.Training.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private String[] tags;
    private boolean status; // active/passive
    private Set<Employee> employees;

    @OneToMany(mappedBy = "Course")
    private List<Chapter> chapterList;

    @OneToMany (mappedBy = "Video")
    private List<Video> videos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "courses_employees", joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"))
    public Set<Employee> getEmployees() {
        return employees;
    }


    public Course(long id, String name, String description, String[] tags, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.status = status;
    }

    public void CreateCourse(){
        System.out.println("Course"+ this.name +" was  created");
        return ;
    }

    public void EditCourse(){
        System.out.println("Course"+ this.name +" was  edited");
        return ;

    }

    public void DeleteCourse(){
        System.out.println("Course"+ this.name +" was deleted");
        return ;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTags() {
        return tags;
    }

    public boolean isStatus() {
        return status;
    }
}
