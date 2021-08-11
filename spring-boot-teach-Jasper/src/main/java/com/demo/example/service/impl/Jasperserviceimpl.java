package com.demo.example.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.DAO.JasperDAO;
import com.demo.example.model.JasperOut;
import com.demo.example.service.Jasperservice;
import com.demo.example.util.jasperreportUtil;
@Service
public class Jasperserviceimpl implements Jasperservice{
	
	@Autowired
	jasperreportUtil jasperUtil;

	@Autowired
	JasperDAO jasperDAO;
	
	@Override
	public JasperOut getbykey(Integer ids) {
		JasperOut jasperOut = jasperDAO.findById(ids).orElseThrow();
		return jasperOut;
		
	}

	@Override
	public byte[] getPdf(JasperOut JasperOut) throws Exception {
		String template = "templates/demo.jrxml";
		Map<String, Object> jasperMap = new HashMap<>();
		BeanUtils.describe(JasperOut).forEach((k, v) -> jasperMap.put(k, v));
		
		return jasperUtil.exportFormJrxml(template, jasperMap);
	}

	@Override
	public void insert(JasperOut jasperOut) {
		jasperDAO.save(jasperOut);
		
	}

}
