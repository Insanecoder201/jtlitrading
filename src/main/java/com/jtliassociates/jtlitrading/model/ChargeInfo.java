package com.jtliassociates.jtlitrading.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChargeInfo {

	public ChargeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	@Column(name="pk_seq")
	private long id;
	
	@Column(name="freq")
	private Integer freq;
	
	@Column(name="charge")
	private Integer charge;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getFreq() {
		return freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
	}

	public Integer getCharge() {
		return charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "ChargeInfo [id=" + id + ", freq=" + freq + ", charge=" + charge + "]";
	}
	
	
	
}
