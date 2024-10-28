package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.services.StateService;


@Controller



public class StateController {
	
@Autowired 
private StateService stateService;
	
	//Get All Countrys
	@SuppressWarnings("null")
	@GetMapping("states")
	
	//public String findAll(org.springframework.ui.Model model) {
	public String findAll(Model model){	
		
		//ModelMap modelMap = null;
		//modelMap.addAttribute("countries", countryService.findAll());
		//ModelAndView mav = null;
		//mav.addObject("countries", countryService.findAll());
		List<State> stateList = stateService.findAll();
	    // Log the data to check if it's dynamic
	    stateList.forEach(state -> System.out.println(state.getCapital()));
		
		model.addAttribute("states", stateService.findAll());
		return "state";
	} 
}
