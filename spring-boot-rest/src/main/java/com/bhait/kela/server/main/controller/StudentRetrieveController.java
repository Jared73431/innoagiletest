package com.bhait.kela.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhait.kela.server.main.service.StudentService;
import com.bhaiti.kela.server.main.beans.Student;

@Controller
public class StudentRetrieveController {

	@Autowired
	StudentService studentService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")
	public List<Student> getAllStudents() {
		List<Student> studentlist = studentService.getAll();
		return studentlist;

	}

	@ResponseBody
	@PostMapping("/savestudent")
	public String savestudent(@RequestParam(value = "age", required = true) int age,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "registrationNumber", required = true) String registrationNumber) {

		String succ = studentService.saveall(age, name, registrationNumber);

		return succ;
	}

	@ResponseBody
	@PostMapping("/deletestudent")
	public void deletestudent(@RequestParam(value = "id", required = true) int id) {
		System.out.println("hello post");
		studentService.delete(id);

	}

	@ResponseBody
	@GetMapping("/savestudentget")
	public String savestudentget(@PathVariable(value = "age", required = true) int age,
			@PathVariable(value = "name", required = true) String name,
			@PathVariable(value = "registrationNumber", required = true) String registrationNumber) {
		System.out.println("hello post");

		String succ = studentService.saveall(age, name, registrationNumber);

		return succ;
	}

	@ResponseBody
	@GetMapping("/getbookbykey/{id}")
	public Student getbykey(@PathVariable(value = "id") int id) {
		Student student = studentService.getbykey(id);
		return student;
	}
}
