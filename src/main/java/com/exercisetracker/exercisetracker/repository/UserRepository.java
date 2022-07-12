package com.exercisetracker.exercisetracker.repository;

import com.exercisetracker.exercisetracker.model.Exercise;
import com.exercisetracker.exercisetracker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {


}
