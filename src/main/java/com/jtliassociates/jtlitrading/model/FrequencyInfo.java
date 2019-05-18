package com.jtliassociates.jtlitrading.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FrequencyInfo {

	public FrequencyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name="pk_seq")
	private long id;
	
	@Column(name="phoneno")
	private String phoneno;
	
	@Column(name="freq")
	private Integer freq;
	
	@Column(name="month")
	private LocalDateTime month;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Integer getFreq() {
		return freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
	}

	public LocalDateTime getMonth() {
		return month;
	}

	public void setMonth(LocalDateTime month) {
		this.month = month;
	}
	
	
}
