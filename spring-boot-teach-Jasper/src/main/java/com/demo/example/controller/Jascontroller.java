package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.example.model.JasperOut;
import com.demo.example.service.Jasperservice;

@Controller
public class Jascontroller {

	@Autowired
	Jasperservice jasperservice;
	
	@ResponseBody
	@PostMapping("/save")
	public String savebook(@RequestParam(value = "ids", required = true) Integer ids,
			@RequestParam(value = "personid", required = true) String personid,
			@RequestParam(value = "phone", required = true) String phone,
			@RequestParam(value = "no", required = true) String no,
			@RequestParam(value = "datestring", required = true) String datestring) {
		JasperOut jasperOut = new JasperOut();
		jasperOut.setIds(ids);
		jasperOut.setPhone(phone);
		jasperOut.setPersonid(personid);
		jasperOut.setNo(no);
		jasperOut.setDatestring(datestring);
		jasperservice.insert(jasperOut);
		return "successful";
	}
	
	
	@ResponseBody
	@GetMapping("/printPDF/{ids}")
	public ResponseEntity<byte[]> print(@PathVariable(value = "ids") int ids) throws Exception {
		HttpHeaders header = new HttpHeaders();
		header.setContentDispositionFormData("bcr", "demo.pdf");
		header.setContentType(MediaType.APPLICATION_PDF);

		return new ResponseEntity<byte[]>(jasperservice.getPdf(jasperservice.getbykey(ids)), header,
				HttpStatus.OK);
	}
}
