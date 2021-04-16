package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Student;
import com.example.util.JasperReportUtil;

@Service
public class JasperReportService implements IJasperReportService{
	
	@Autowired
	JasperReportUtil jsutil;
	
	@Override
	public byte[] getProductTypePdf(Student ptVO) throws Exception {
		// 設定模板位置
		String template = "student.jrxml";
		Map<String, Object> ptMap = new HashMap<>();
		
		BeanUtils.describe(ptVO).forEach((k, v) -> ptMap.put(k, v));
		
		return jsutil.exportFormJrxml(template, ptMap);
	}
	
	

}
