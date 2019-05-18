package com.jtliassociates.jtlitrading.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtliassociates.jtlitrading.model.AdminInfo;
import com.jtliassociates.jtlitrading.model.CallInfo;
import com.jtliassociates.jtlitrading.repository.AdminRepository;

@Service
public class AdminService {
	
	
	@Autowired
	private AdminRepository repository;
	
	public List<AdminInfo> getAllAdmin(){
		
		return repository.retrieveAllAdmin();
	}
	
	public void insertCallInfo(CallInfo info) {
		repository.insertCallInfo(info);
	}
	
}
