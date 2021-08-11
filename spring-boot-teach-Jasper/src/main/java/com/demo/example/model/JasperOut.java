package com.demo.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class JasperOut {

	@Id
	private Integer ids;
	
	private String personid;
	
	private String no;
	
	private String datestring;
	
	private String phone;
	
}
