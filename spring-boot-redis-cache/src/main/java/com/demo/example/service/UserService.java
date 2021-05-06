package com.demo.example.service;

import java.util.List;

import com.demo.example.beans.APPUser;

public interface UserService {
	List<APPUser> getAllUsers();

	APPUser findById(Integer pId);
    
    void clearAllUserCache();
    
    void clear(Integer pId);
}
