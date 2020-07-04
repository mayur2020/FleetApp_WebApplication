package com.springproject.FleetApp.Models;

import java.util.Collection;
import java.util.Collections;

import org.apache.catalina.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springproject.FleetApp.Models.*;
import com.springproject.FleetApp.Repositories.*;

public class UserPrincipal implements UserDetails  {
	
	private User user;

	public UserPrincipal(com.springproject.FleetApp.Models.User user2) 
	{
		this.user = (User) user2;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	public String getPassword() {
		return user.getPassword();
	}

	public String getUsername() {
		return user.getUsername();
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true ;
	}

}
