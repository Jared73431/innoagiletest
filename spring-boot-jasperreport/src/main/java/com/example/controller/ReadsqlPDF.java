package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.Student;
import com.example.service.JasperReportService;

@Controller
public class ReadsqlPDF {
	@Autowired
	JasperReportService jspser;
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/student/printpdf")
	public ResponseEntity<byte[]> print() throws Exception{
		HttpHeaders header = new HttpHeaders();
		header.setContentDispositionFormData("att","expamle.pdf");
		header.setContentType(MediaType.APPLICATION_PDF);
		Student student = new Student();
		student.setAge(22);
		student.setName("cccc");
		student.setRegistrationNumber("你好");
		student.setId(11);
		
		return new ResponseEntity<byte[]>(jspser.getProductTypePdf(student), header, HttpStatus.OK);
	}
	
}
