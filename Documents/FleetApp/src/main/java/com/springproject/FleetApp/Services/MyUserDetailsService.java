package com.springproject.FleetApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Repositories.*;

@Service
public class MyUserDetailsService
{	
	@Autowired
	private UserRepository  userlogRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userlogRepository.findByUsername(username);
		
		if(user==null) 
		{
			throw new UsernameNotFoundException("User not found!");
		}
		
		return  new UserPrincipal(user);
	}

}
