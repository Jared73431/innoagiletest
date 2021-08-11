package com.demo.example.service;

import com.demo.example.model.JasperOut;

public interface Jasperservice {
	
	public JasperOut getbykey(Integer ISBN);

	public byte[] getPdf(JasperOut jasperOut) throws Exception;

	public void insert(JasperOut jasperOut);
}
