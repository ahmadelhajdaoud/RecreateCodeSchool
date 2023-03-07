package org.generation.italy.recreateCodeSchool.model.entities;

import java.time.LocalDate;

public class Course {
    private long id;
    private String title;
    private String description;
    private String program;
    private double duration;
    private boolean isActive;
    private LocalDate createdAt;

    public Course(){

        this.createdAt = LocalDate.now();

    }
    public Course(long id, String title, String description, String program, double duration, LocalDate createdAt){
        this(id,title,description,program,duration,true,createdAt);
    }

    public Course(long id, String title, String description, String program, double duration,boolean isActive, LocalDate createdAt){
        this.id = id;
        this.title = title;
        this.description = description;
        this.program = program;
        this.duration = duration;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }
    public long getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getProgram() {
        return program;
    }

    public double getDuration() {
        return duration;
    }

    public boolean isActive() {
        return isActive;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
    @Override
    public String toString(){
        return String.format("Course->[id=%d, title=%s, description=%s, program=%s, duration=%f, isActive=%b, createdAt=%s]",
                id,title,description,program,duration,isActive,createdAt);
    }
}
