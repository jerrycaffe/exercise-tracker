package com.exercisetracker.exercisetracker.controller;

import com.exercisetracker.exercisetracker.model.User;
;
import com.exercisetracker.exercisetracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User userForm){
        return userService.saveUser(userForm);
    }

    @GetMapping(value = "/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


}
