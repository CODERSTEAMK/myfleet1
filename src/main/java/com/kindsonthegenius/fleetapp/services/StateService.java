package com.kindsonthegenius.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	
	
	
		public List<State> findAll(){
			return stateRepository.findAll();
		}	
		
		
		
		//Delete Country
		public void delete(Integer id) {
			stateRepository.deleteById(id);
		}
		
		//Update Country
		public void save( State state) {
			stateRepository.save(state);
		}

}
