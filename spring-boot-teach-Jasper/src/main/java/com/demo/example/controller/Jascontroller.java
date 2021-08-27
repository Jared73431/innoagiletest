package com.demo.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
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
import com.demo.example.util.jasperreportUtil;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRTextExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;

@Controller
public class Jascontroller {

	@Autowired
	Jasperservice jasperservice;
	
	@Autowired
	jasperreportUtil jasperUtil;
	
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
	
	@ResponseBody
	@GetMapping("/printTXT/{ids}")
	public void printTXT(@PathVariable(value = "ids") int ids) throws Exception {
		// Step1.01: Defined -- Report Template File ( *.jasper )
		File templateFile = new File("C:\\gradletest\\spring-boot-teach-Jasper\\src\\main\\resources\\templates\\demo.jasper");

		// Step1.02: Defined -- Export File ( *.csv )
		File outputFile = new File("C:\\Test_Demo.txt");


		// Step2.--: Data Mapping Setting
		Map<String, Object> dataParameters = new HashMap<>();
		BeanUtils.describe(jasperservice.getbykey(ids)).forEach((k, v) -> dataParameters.put(k, v));

		// Step3.--: Jasper File Setting
		FileInputStream jasperFile = new FileInputStream(templateFile);
		JasperPrint jasperPrinter = JasperFillManager.fillReport(jasperFile, dataParameters, new JREmptyDataSource());

		// Step4.--: Export Process ...
		JRTextExporter exporter = new JRTextExporter();
		exporter.setParameter(JRTextExporterParameter.CHARACTER_ENCODING, "BIG5");
		exporter.setParameter(JRTextExporterParameter.JASPER_PRINT, jasperPrinter);
		exporter.setParameter(JRTextExporterParameter.OUTPUT_FILE_NAME, outputFile.getAbsolutePath());
		exporter.setParameter(JRTextExporterParameter.CHARACTER_WIDTH, Float.valueOf(10));
	    exporter.setParameter(JRTextExporterParameter.CHARACTER_HEIGHT, Float.valueOf(30));

	    exporter.exportReport();
	}
	
	@ResponseBody
	@GetMapping("/printCSV/{ids}")
	public void printCSV(@PathVariable(value = "ids") int ids) throws Exception {
		// Step1.01: Defined -- Report Template File ( *.jasper )
		File templateFile = new File("C:\\gradletest\\spring-boot-teach-Jasper\\src\\main\\resources\\templates\\demo.jasper");

		// Step1.02: Defined -- Export File ( *.csv )
		File outputFile = new File("C:\\Test_Demo.txt");


		// Step2.--: Data Mapping Setting
		Map<String, Object> dataParameters = new HashMap<>();
		BeanUtils.describe(jasperservice.getbykey(ids)).forEach((k, v) -> dataParameters.put(k, v));

		// Step3.--: Jasper File Setting
		FileInputStream jasperFile = new FileInputStream(templateFile);
		JasperPrint jasperPrinter = JasperFillManager.fillReport(jasperFile, dataParameters, new JREmptyDataSource());

		// Step4.--: Export Process ...
		JRCsvExporter exporter = new JRCsvExporter();
		exporter.setParameter(JRCsvExporterParameter.CHARACTER_ENCODING, "BIG5");
		exporter.setParameter(JRCsvExporterParameter.JASPER_PRINT, jasperPrinter);
		exporter.setParameter(JRCsvExporterParameter.OUTPUT_FILE_NAME, outputFile.getAbsolutePath());

	    exporter.exportReport();
	}

}
