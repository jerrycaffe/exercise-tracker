package com.exercisetracker.exercisetracker.dto;


import org.springframework.lang.NonNull;

public class UserRequest {
    @NonNull
    private String username;
public UserRequest(){

}
    public UserRequest(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "username='" + username + '\'' +
                '}';
    }
}
