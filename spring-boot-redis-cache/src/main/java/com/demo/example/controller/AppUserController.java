package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.example.beans.APPUser;
import com.demo.example.service.UserService;

@Controller
public class AppUserController {
	
	@Autowired
	UserService userservice;
	
	
	@ResponseBody
	@PostMapping("/saveappuser")
	public String savebook(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) Integer password) {
		APPUser aPPUser = new APPUser();
		aPPUser.setUserName(username);;
		aPPUser.setPassWord(password);;
		userservice.inseruser(aPPUser);
		return "successful";
	}
	
	@ResponseBody
	@GetMapping("/getappuser")
	public List<APPUser> getall() {
		List<APPUser> APPUserlist = userservice.getAllUsers();
		return APPUserlist;
	}

}
