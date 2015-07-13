package com.sagunms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sagunms.model.Goal;
import com.sagunms.repository.GoalRespository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	private GoalRespository goalRespository;
	
	@Transactional
	public Goal save(Goal goal) {
		return goalRespository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRespository.loadAll();
	}

}
