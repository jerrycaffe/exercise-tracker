package com.exercisetracker.exercisetracker.controller;

import com.exercisetracker.exercisetracker.model.Exercise;

import com.exercisetracker.exercisetracker.service.ExerciseService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ExcerciseController {


    @Autowired
    private ExerciseService exerciseService;


    @PostMapping("/users/{id}/exercises")
    public Exercise addExercis(@PathVariable String id, @Valid @RequestBody Exercise exercise) {
        return exerciseService.saveExercise(id, exercise);
    }

    @GetMapping("/users/{id}/logs")
    public List getExerciseLog(@PathVariable String id){
    return exerciseService.getExerciseLog(id);
    }
}
