package com.example.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long uid;

	@Temporal(TemporalType.DATE)
	@Column(name="allow_time")
	private Date allowTime;

	private String articles;

	private String authority;

	@Temporal(TemporalType.DATE)
	@Column(name="creat_time")
	private Date creatTime;

	private String email;

	private String identityid;

	@Column(name="miss_number")
	private String missNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="miss_time")
	private Date missTime;

	private String name;

	private String password;

	private String phone;

	public User() {
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Date getAllowTime() {
		return this.allowTime;
	}

	public void setAllowTime(Date allowTime) {
		this.allowTime = allowTime;
	}

	public String getArticles() {
		return this.articles;
	}

	public void setArticles(String articles) {
		this.articles = articles;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityid() {
		return this.identityid;
	}

	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}

	public String getMissNumber() {
		return this.missNumber;
	}

	public void setMissNumber(String missNumber) {
		this.missNumber = missNumber;
	}

	public Date getMissTime() {
		return this.missTime;
	}

	public void setMissTime(Date missTime) {
		this.missTime = missTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}