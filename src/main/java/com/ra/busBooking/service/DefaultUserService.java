package com.ra.busBooking.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.ra.busBooking.DTO.UserRegisteredDTO;
import com.ra.busBooking.model.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);


	
}
