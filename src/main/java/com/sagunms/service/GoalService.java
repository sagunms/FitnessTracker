package com.sagunms.service;

import java.util.List;

import com.sagunms.model.Goal;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();
}
