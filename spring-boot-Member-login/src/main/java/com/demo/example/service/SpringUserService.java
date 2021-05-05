package com.demo.example.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.example.beans.Users;
import com.demo.example.config.NotFoundException;


@Service
public class SpringUserService implements UserDetailsService {
	@Autowired
	Userservice uservices;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Users user = uservices.getUserbyemail(username);

			return new User(user.getEmail(), user.getPassword(), Collections.emptyList());
		} catch (NotFoundException e) {
			throw new UsernameNotFoundException("Username is wrong.");
		}
	}
}
