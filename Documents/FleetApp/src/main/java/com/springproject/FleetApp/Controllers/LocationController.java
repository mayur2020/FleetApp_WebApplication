package com.springproject.FleetApp.Controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Services.*;



@Controller
public class LocationController {
	
	@Autowired	private LocationService locationService;
	@Autowired	private CountryService countryService;
	@Autowired	private StateService stateService;
	
	@GetMapping("locations")
	public String findAll(Model model){
		List<State> locationList = stateService.getLocations();
		model.addAttribute("locations", locationService.findAll());
		
		List<State> countryList = stateService.getCountries();
		model.addAttribute("countries", countryService.findAll());
		
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateService.findAll());

		return "location";
	}
	
	@GetMapping("/findById")
	@ResponseBody
	public Optional<Location> findById(Integer id) {
		return locationService.findById(id);
	}		
	
	@GetMapping("/findByDescriptionContaining/{description}")
	public List<Location> findByDescriptionContaining(@PathVariable("description") String description) {
		return locationService.findByDescriptionContaining(description);
	}

	@PostMapping("locations/addNew")
	public String save(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String deleteById(Integer id) {
		locationService.deleteById(id);
		return "redirect:/locations";
	}
	
	
}