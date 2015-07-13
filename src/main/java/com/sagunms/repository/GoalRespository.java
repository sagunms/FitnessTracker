package com.sagunms.repository;

import java.util.List;

import com.sagunms.model.Goal;

public interface GoalRespository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

}
