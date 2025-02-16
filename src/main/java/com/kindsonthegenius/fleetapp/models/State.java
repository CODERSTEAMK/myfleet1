package com.kindsonthegenius.fleetapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class State {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String name;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}




	

	

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	private String capital;
    private String code;

	@ManyToOne
	//@JoinColumn(name="countryid", insertable=false, updatable=false)
	
	
	
private Country country;
	
    private Integer countryid;
	
	private String details;
	
	
	
	//my data
	
	//private List<Country> countries = new ArrayList<>();
    //List<Country> filteredList = countries.stream()
       //     .filter(countries -> countries.getId() > 1)
        //    .collect(Collectors.toList());
	
	
	
	
	public void setCapital(String capital) {
		this.capital=capital;
	}
	
	public String getCapital() {
		return capital;
	}


}
