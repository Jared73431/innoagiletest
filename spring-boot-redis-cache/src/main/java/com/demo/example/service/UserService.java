package com.demo.example.service;

import java.util.List;

import com.demo.example.beans.APPUser;

public interface UserService {
	public List<APPUser> getAllUsers();

	public APPUser findById(Integer pId);
    
	public void clearAllUserCache();
    
	public void clear(Integer pId);
	
	public Iterable<APPUser> inseruser(APPUser aPPUser);
}
