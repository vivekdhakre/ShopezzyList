package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.UserDo;

public interface UserDAO {

	public void addUser(UserDo user);	
	public void updateUser(UserDo user);
	public UserDo getUserById(long id);
	public UserDo getUserByAppId(String appId);
	public List<UserDo>  getUserList();
	public int getTotalUsers();
	
}
