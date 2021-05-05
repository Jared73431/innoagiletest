package com.demo.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.example.beans.Users;
import com.demo.example.dao.Userdao;
import com.demo.example.service.Userservice;
@Component
public class Userserviceimpl implements Userservice {
	
	@Autowired
	Userdao userdao;

	@Override
	public List<Users> getalluser() {
		List<Users> userlist = userdao.findAll();
		return userlist;
	}

	@Override
	public Users creatuser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserbyid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserbyemail(String email) {
		return userdao.findByEmailAddress(email);
		
		
	}

}
