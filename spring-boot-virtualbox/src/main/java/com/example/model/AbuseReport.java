package com.example.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the abuse_reports database table.
 * 
 */
@Entity
@Table(name="abuse_reports")
@NamedQuery(name="AbuseReport.findAll", query="SELECT a FROM AbuseReport a")
public class AbuseReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cached_markdown_version")
	private Integer cachedMarkdownVersion;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String message;

	@Column(name="message_html")
	private String messageHtml;

	@Column(name="reporter_id")
	private Integer reporterId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id")
	private Integer userId;

	public AbuseReport() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCachedMarkdownVersion() {
		return this.cachedMarkdownVersion;
	}

	public void setCachedMarkdownVersion(Integer cachedMarkdownVersion) {
		this.cachedMarkdownVersion = cachedMarkdownVersion;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageHtml() {
		return this.messageHtml;
	}

	public void setMessageHtml(String messageHtml) {
		this.messageHtml = messageHtml;
	}

	public Integer getReporterId() {
		return this.reporterId;
	}

	public void setReporterId(Integer reporterId) {
		this.reporterId = reporterId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}