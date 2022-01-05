package com.exercisetracker.exercisetracker.repository;

import com.exercisetracker.exercisetracker.model.Exercise;
import com.exercisetracker.exercisetracker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {

    List<Exercise> findByUsername(String username);
}
