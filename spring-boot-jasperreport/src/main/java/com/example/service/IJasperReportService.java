package com.example.service;

import com.example.bean.Student;

public interface IJasperReportService {

	public byte[] getProductTypePdf(Student ptVO) throws Exception;
}
