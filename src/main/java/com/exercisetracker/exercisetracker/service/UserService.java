package com.exercisetracker.exercisetracker.service;

import com.exercisetracker.exercisetracker.exceptions.RecordNotFoundException;
import com.exercisetracker.exercisetracker.model.User;
import com.exercisetracker.exercisetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



    public User saveUser(User userForm){
        return userRepository.save(userForm);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User findUserById(String id){
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new RecordNotFoundException("Cannot find any user with the id of " + id);
        }
        return user.get();
    }
}
