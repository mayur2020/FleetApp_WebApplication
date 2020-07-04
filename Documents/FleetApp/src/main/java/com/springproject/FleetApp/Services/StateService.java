package com.springproject.FleetApp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Repositories.*;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	//Get All States
	public List<State> findAll(){
		return stateRepository.findAll();
	}	
	
	//Get State By Id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}	
	
	//Delete State
	public void delete(int id) {
		stateRepository.deleteById(id);
	}
	
	//Update State
	public void save( State state) {
		stateRepository.save(state);
	}

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getState() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
