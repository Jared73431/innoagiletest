package com.demo.example.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class APPUser implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private Integer passWord;
}
