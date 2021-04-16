package com.bhait.kela.server.main.service;

import java.util.List;

import com.bhaiti.kela.server.main.beans.Student;

public interface StudentService {
	//public Student saveall(String name,int age,String registrationNumber);
	public  List<Student> getAll();
	
	public String  saveall(int age, String name, String registrationNumber);
	
	public void delete(int id);
	
	public Student getbykey(Integer id);
}
