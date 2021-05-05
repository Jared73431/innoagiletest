package com.demo.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.example.beans.Users;

@Service
public interface Userservice {
	
	public List<Users> getalluser();
	
	public Users creatuser(Users user);
	
	public Users getUserbyid(Long id);
	
	public Users getUserbyemail(String email);

}
