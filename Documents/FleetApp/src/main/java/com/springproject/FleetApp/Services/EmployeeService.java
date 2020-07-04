package com.springproject.FleetApp.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Repositories.*;

@Configuration
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}

	public List<Country> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> getemployees() {
		// TODO Auto-generated method stub
		return null;
	}
}
