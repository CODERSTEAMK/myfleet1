package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import ch.qos.logback.core.model.Model;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.services.CountryService;


@Controller



public class CountryController {
	
@Autowired 
private CountryService countryService;
	
	//Get All Countrys
	@SuppressWarnings("null")
	@GetMapping("countries")
	
	//public String findAll(org.springframework.ui.Model model) {
	public String findAll(Model model){	
		
		//ModelMap modelMap = null;
		//modelMap.addAttribute("countries", countryService.findAll());
		//ModelAndView mav = null;
		//mav.addObject("countries", countryService.findAll());
		List<Country> countryList = countryService.findAll();
	    // Log the data to check if it's dynamic
	    countryList.forEach(country -> System.out.println(country.getCapital()));
		
		model.addAttribute("countries", countryService.findAll());
		return "country";
	} 
}
