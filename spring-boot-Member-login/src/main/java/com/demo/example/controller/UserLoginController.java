package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.beans.Users;
import com.demo.example.service.Userservice;

@RestController
public class UserLoginController {
	@Autowired
	Userservice userservice;
	@GetMapping("/user")
	public List<Users> getalluser(){
		List<Users>userlist = userservice.getalluser();
		return userlist;
		
	}

}
