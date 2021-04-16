	package com.example.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;


public class JasperReportUtil {

	/*
	 * 從 .jrxml 的模板生成 PDF，並取得 byte[]   要取得PDF需要 implementation group: 'com.lowagie', name: 'itext', version: '2.1.7'

	 */
	public byte[] exportFormJrxml(String template, Map<String, Object> param) throws JRException {
		JasperReport jreport = getJasperReportFormJrxml(template);
		JasperPrint print = JasperFillManager.fillReport(jreport, param, new JREmptyDataSource());
		
		return JasperExportManager.exportReportToPdf(print);
	}
	
	/*
	 * 從 .jasper 的模板生成 PDF，並取得 byte[]
	 */
	public byte[] exportFormJasper(String template, Map<String, Object> param) throws JRException {
		JasperReport jreport = getJasperReportFormJasper(template);
		JasperPrint print = JasperFillManager.fillReport(jreport, param, new JREmptyDataSource());
		
		return JasperExportManager.exportReportToPdf(print);
	}
	
	/*
	 * 把 .jrxml 編譯成 .jasper，並讀取檔案
	 */
	private JasperReport getJasperReportFormJrxml(String template) throws JRException {
		InputStream is = null;
		
		try {
			is = new ClassPathResource(template).getInputStream();
			
			return JasperCompileManager.compileReport(is);
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("getJasperReportFormJrxml IOException");
			
			return null;
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * 讀取 .jasper 的檔案
	 */
	private JasperReport getJasperReportFormJasper(String template) throws JRException {
		InputStream is = null;
		
		try {
			is = new ClassPathResource(template).getInputStream();
			
			return (JasperReport) JRLoader.loadObject(is);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("getJasperReportFormJasper IOException");
			
			return null;
		} finally {
			try {
				is.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
