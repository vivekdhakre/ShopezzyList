package com.ahoy.ushop.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahoy.ushop.core.dao.UserDAO;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.util.UtilConstants;
@Service
public class UserManagementServiceImpl implements UserManagementService{

	@Autowired 
	private UserDAO userDAO;
	
	@Transactional
	public void addUser(UserDo user) {
		userDAO.addUser(user);
	}

	@Transactional
	public void updateUser(UserDo user) {
		userDAO.updateUser(user);
	}

	@Transactional
	public UserDo getUserByAppId(String appId) {
		return userDAO.getUserByAppId(appId);
	}

}
