package com.springproject.FleetApp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Repositories.*;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	
	
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}	
	
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
	
	public void save( Country country) {
		countryRepository.save(country);
	}

	public List<Country> getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
