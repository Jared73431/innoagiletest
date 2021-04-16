package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class democontroller {

	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "message2222");
		return "hello";
		
	}
}
