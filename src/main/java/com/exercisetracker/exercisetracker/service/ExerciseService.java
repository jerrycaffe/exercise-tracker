package com.exercisetracker.exercisetracker.service;

import com.exercisetracker.exercisetracker.model.Exercise;
import com.exercisetracker.exercisetracker.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private UserService userService;

    public Exercise saveExercise(String id, Exercise exerciseForm) {
        String username = userService.findUserById(id).getUsername();
        if (exerciseForm.getDate() == null) exerciseForm.setDate(LocalDate.now());
        Exercise exerciseResult = new Exercise(exerciseForm.getDuration(), exerciseForm.getDate(), exerciseForm.getDescription(), username);
        return exerciseRepository.save(exerciseResult);
    }


    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public List getExerciseLog(String id) {
        String username = userService.findUserById(id).getUsername();
        List exerciseLogs = exerciseRepository.findByUsername(username);
        HashMap<String, Integer> count = new HashMap<>();
        count.put("count", exerciseLogs.size());
        exerciseLogs.add(count);

        return exerciseLogs;

    }
}
