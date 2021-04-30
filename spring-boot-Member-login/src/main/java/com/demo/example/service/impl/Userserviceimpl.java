package com.demo.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.example.beans.User;
import com.demo.example.dao.Userdao;
import com.demo.example.service.Userservice;
@Component
public class Userserviceimpl implements Userservice {
	
	@Autowired
	Userdao userdao;

	@Override
	public List<User> getalluser() {
		List<User> userlist = userdao.findAll();
		return userlist;
	}

}
