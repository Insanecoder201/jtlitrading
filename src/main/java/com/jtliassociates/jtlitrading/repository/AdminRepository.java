package com.jtliassociates.jtlitrading.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jtliassociates.jtlitrading.model.AdminInfo;
import com.jtliassociates.jtlitrading.model.CallInfo;

@Repository
@Transactional
public class AdminRepository {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EntityManager manager;
	
	
	public List<AdminInfo> retrieveAllAdmin() {
		return manager.createQuery("select a from AdminInfo a", AdminInfo.class).getResultList();
	}
	
	public void insertCallInfo(CallInfo info) {
		manager.persist(info);
	}
}
