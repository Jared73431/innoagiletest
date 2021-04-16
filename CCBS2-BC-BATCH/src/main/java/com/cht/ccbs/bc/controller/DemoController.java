package com.cht.ccbs.bc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	// 透過 @RequestMapping 指定從/會被對應到此hello()方法
	@RequestMapping("/hello")
	public String hello() {
		return "向全世界說聲Spring Boot 很高興認識你!";
	}
	@GetMapping("/hello2/{id}")
	public String heiio2(@PathVariable("id") String id) {
		return "向全世界說聲Spring Boot 很高興認識你!"+id;
	}
	@RequestMapping(value = "/testpost", method = RequestMethod.POST)
	public String idcheck() {
		System.out.println("hello  test post");
		return "ok";
	}
	@RequestMapping(value = "/loginbypost", method = RequestMethod.POST)
	public String loginByPost(@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "pwd", required = true) String pwd) {
		System.out.println("hello post");
		return name+pwd;
	}
	
	
}
