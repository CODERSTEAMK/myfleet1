package com.kindsonthegenius.fleetapp.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	
	
		public List<Country> findAll(){
			return countryRepository.findAll();
		}	
		
		
		
		//Delete Country
		public void delete(Integer id) {
			countryRepository.deleteById(id);
		}
		
		//Update Country
		public void save( Country country) {
			countryRepository.save(country);
		}
	
	

}
