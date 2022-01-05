package com.exercisetracker.exercisetracker.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Document("exercise")
public class Exercise {
    @Id
    private String id;

    @NotNull(message = "cannot be empty")
    private int duration;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    @NotNull(message = "Description cannot be empty")
    private String description;

    private String username;

    public Exercise(){}

    public Exercise(int duration, LocalDate date, String description, String username) {

        this.duration = duration;
        this.date = date;
        this.description = description;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id='" + id + '\'' +
                ", duration=" + duration +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
