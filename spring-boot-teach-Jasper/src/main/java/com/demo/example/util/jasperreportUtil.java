package com.demo.example.util;

import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
@Component
public class jasperreportUtil {
	/*
	 * 從 .jrxml 的模板生成 PDF，並取得 byte[] 要取得PDF需要 implementation group: 'com.lowagie',
	 * name: 'itext', version: '2.1.7'
	 * 
	 */
	public byte[] exportFormJrxml(String template, Map<String, Object> param) throws JRException {
		JasperReport jaspreport = getJasperReportFormJrxml(template);
		JasperPrint print = JasperFillManager.fillReport(jaspreport, param, new JREmptyDataSource());

		return JasperExportManager.exportReportToPdf(print);

	}

	/*
	 * 把 .jrxml 編譯成 .jasper，並讀取檔案
	 */
	public JasperReport getJasperReportFormJrxml(String template) throws JRException {
		InputStream input = null;
		try {

			input = new ClassPathResource(template).getInputStream();
			return JasperCompileManager.compileReport(input);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getJasperReportFormJrxml IOException");

			return null;
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * 從 .jasper 的模板生成 PDF，並取得 byte[]
	 */
	public byte[] exportFormJasper(String template, Map<String, Object> param) throws JRException {
		JasperReport jaspreport = getJasperReportFormJasper(template);
		JasperPrint print = JasperFillManager.fillReport(jaspreport, param, new JREmptyDataSource());

		return JasperExportManager.exportReportToPdf(print);
	}

	/*
	 * 把 .jrxml 編譯成 .jasper，並讀取檔案
	 */
	private JasperReport getJasperReportFormJasper(String template) throws JRException {
		InputStream input = null;
		try {

			input = new ClassPathResource(template).getInputStream();
			return (JasperReport) JRLoader.loadObject(input);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getJasperReportFormJrxml IOException");

			return null;
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
