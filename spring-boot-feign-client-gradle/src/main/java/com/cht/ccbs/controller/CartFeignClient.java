package com.cht.ccbs.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "aac", url = "http://localhost:8081")
public interface CartFeignClient {

	@GetMapping("/student/allstudent")
	public List getAll();

	@RequestMapping(method = RequestMethod.POST, value = "/savestudent")
	public String savestudent(@RequestParam("age") int age,@RequestParam("name")String name,@RequestParam("registrationNumber") String registrationNumber);
	
	@RequestMapping(method = RequestMethod.POST, value = "/deletestudent")
	public void delete(@RequestParam("id")int id);
}