package com.bhait.kela.server.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhait.kela.server.main.dao.StudentDAO;
import com.bhait.kela.server.main.service.StudentService;
import com.bhaiti.kela.server.main.beans.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	
	@Override
	public List<Student> getAll() {
		
		List<Student> stulist = studentDAO.findAll();
		
		return stulist;
	}


	@Override
	public String saveall(int age, String name,  String registrationnumber) {
		Student student = new Student();
		try {
			student.setAge(age);
			student.setName(name);
			student.setRegistrationNumber(registrationnumber);
			String sss =  studentDAO.save(student).toString();
			System.out.println(sss);
			return "successful";
			
	
		} finally {
			student = null;
		}
		
	}


	@Override
	public void delete(int id) {
		studentDAO.deleteById(id);;
		
	}


	@Override
	public Student getbykey(Integer ID) {
		Student student = studentDAO.findById(ID).orElseThrow();
		return student;
	}



}
