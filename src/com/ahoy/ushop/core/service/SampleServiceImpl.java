package com.ahoy.ushop.core.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
@Service
public class SampleServiceImpl implements SampleService {


	private static final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);
	
	
	 
//	@Autowired 
//	private AdplaceUtil adplaceUtil;
	@Transactional
	public void addUser(String user) {	
		
		logger.debug("Inside UserManagementServiceImpl: addUser: ");

	}
 
	@Transactional
	public String getUserById(Long id) {
		return null;
	}

	@Override
	public void saveNewUserSettings(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMailId(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUserListByMaccount(String code) {
		// TODO Auto-generated method stub
		return null;
	} 
}

