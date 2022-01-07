package com.exercisetracker.exercisetracker.service;

import com.exercisetracker.exercisetracker.model.Exercise;
import com.exercisetracker.exercisetracker.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private UserService userService;

    public Exercise saveExercise(String id, Exercise exerciseForm) {
//        String username = userService.findUserById(id).getUsername();
        if (exerciseForm.getDate() == null) exerciseForm.setDate(LocalDate.now());

        Exercise exerciseResult = new Exercise(exerciseForm.getDuration(), exerciseForm.getDate(), exerciseForm.getDescription(), id);

        return exerciseRepository.save(exerciseResult);
    }



    public List getExerciseLog(String id) {


        List exerciseLogs = exerciseRepository.findByUserId(id);
        HashMap<String, Integer> count = new HashMap<>();
        count.put("count", exerciseLogs.size());
        exerciseLogs.add(count);

        return exerciseLogs;

    }
}
