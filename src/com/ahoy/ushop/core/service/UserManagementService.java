package com.ahoy.ushop.core.service;

import java.util.List;

import com.ahoy.ushop.core.domain.UserDo;

public interface UserManagementService {

	public void addUser(UserDo user);
	public void updateUser(UserDo user);
	public UserDo getUserByAppId(String appId);

}
