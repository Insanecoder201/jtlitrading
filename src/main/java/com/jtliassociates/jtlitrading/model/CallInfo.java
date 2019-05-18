package com.jtliassociates.jtlitrading.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CallInfo {
	
	public CallInfo() {
		super();
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pk_seq")
	private long id;
	
	@Column(name="calltype")
	private String callType;
	
	@Column(name="callinfo")
	private String callInfo;
	
	@Column(name="calldate")
	private LocalDateTime callDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getCallInfo() {
		return callInfo;
	}

	public void setCallInfo(String callInfo) {
		this.callInfo = callInfo;
	}

	public LocalDateTime getCallDate() {
		return callDate;
	}

	public void setCallDate(LocalDateTime callDate) {
		this.callDate = callDate;
	}

	@Override
	public String toString() {
		return "CallInfo [id=" + id + ", callType=" + callType + ", callInfo=" + callInfo + ", callDate=" + callDate
				+ "]";
	}
}
