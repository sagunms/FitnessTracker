package com.sagunms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sagunms.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRespository {
	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		em.persist(goal);
		em.flush();
		
		return goal; 
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Goal> loadAll() {
		
		Query query = (Query) em.createQuery("Select g from Goal g");
		
		List goals = query.getResultList();
		
		return goals;
	}
}
