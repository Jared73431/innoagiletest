package com.demo.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.example.beans.User;
@Service
public interface Userservice {
	
	public List<User> getalluser();

}
