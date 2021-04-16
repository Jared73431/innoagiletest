package com.cht.ccbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class callcontroller {
	@Autowired
	CartFeignClient cartFeignClient;
	
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/getall")
    public List getAllStudents() {
		List studentlist =  cartFeignClient.getAll();
		return studentlist;
		
	}
	@ResponseBody
	@PostMapping("/save")
	public String savestudent(@RequestParam(value = "age", required = true) int age,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "registrationNumber", required = true) String registrationNumber) {
		System.out.println("hello post");
		cartFeignClient.savestudent(age, name, registrationNumber);
		return "successful";
	}
	
	@ResponseBody
	@PostMapping("/delete")
	public void delete(@RequestParam(value = "id", required = true) int id) {
		System.out.println("hello post");
		cartFeignClient.delete(id);
	}

}
