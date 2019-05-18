package com.jtliassociates.jtlitrading.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInfo {
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name="pk_seq")
	private long id;

	@Column(name="emailid")
	private String emailId;
	
	@Column(name="phoneno")
	private String phoneno;
	
	@Column(name="privilege")
	private String privilege;
	
	@Column(name="entrydate")
	private LocalDateTime entrydate;
	
	@Column(name="enddate")
	private LocalDateTime enddate;
	
	@Column(name="status")
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public LocalDateTime getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(LocalDateTime entrydate) {
		this.entrydate = entrydate;
	}

	public LocalDateTime getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDateTime enddate) {
		this.enddate = enddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", emailId=" + emailId + ", phoneno=" + phoneno + ", privilege=" + privilege
				+ ", entrydate=" + entrydate + ", enddate=" + enddate + ", status=" + status + "]";
	}
	
	
	
}
