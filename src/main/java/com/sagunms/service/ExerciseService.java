package com.sagunms.service;

import java.util.List;

import com.sagunms.model.Activity;
import com.sagunms.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}