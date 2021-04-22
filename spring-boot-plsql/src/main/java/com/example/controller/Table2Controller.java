package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.Table2Service;

@Controller
public class Table2Controller {
	@Autowired
	Table2Service tableservice;
	@ResponseBody
	@GetMapping("/dosql")
	public String dosql() {
		tableservice.dosql();
		return "OK";
	}
}
