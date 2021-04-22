package com.example.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "table2")
public class table2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer ISBN;
	
	private String title;

	private String author;

	private Integer year;

	private String publisher;

	private double cost;
	
}
