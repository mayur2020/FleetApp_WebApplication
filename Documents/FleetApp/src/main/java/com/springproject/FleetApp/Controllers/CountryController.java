package com.springproject.FleetApp.Controllers;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Services.*;

import aj.org.objectweb.asm.Type;


@Controller
public class CountryController {
	
	@Autowired 
	private CountryService countryService;
	
	@GetMapping("countries")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}	
	
	//Add Country
	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping("countries/findById") 
	@ResponseBody
	public Optional<Country> findById(Integer id)
	{
		return countryService.findById(id);
	}
	
	@RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
