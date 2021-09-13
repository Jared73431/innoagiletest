package com.demo.example.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Uid;

	private String name;

	private String password;

	
	private String email;

	@Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号码格式错误")
	@NotBlank(message = "手机号码不能为空")
	private String phone;

	private String articles;

	private String identityid;

	@CreationTimestamp
	private Date creatTime;

	private String missNumber;

	@UpdateTimestamp
	private Date missTime;

	@LastModifiedDate
	private Date allowTime;

	private String authority;

}
