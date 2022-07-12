package com.exercisetracker.exercisetracker.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ErrorResponse {
    private HttpStatus status;
    private String message;
    private List<String> details;

    public ErrorResponse(HttpStatus status, String message, List<String> details) {
        this.status = status;
        this.message = message;
        this.details = details;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
