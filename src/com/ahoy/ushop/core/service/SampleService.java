package com.ahoy.ushop.core.service;

import java.util.List;
 
public interface SampleService {
	
	public void addUser(String user);
	//below method will return a userdo which contain ad ,balance and adplace info as well
	public void saveNewUserSettings(String user);
	//public UserDo getUserByUserName(String userName);
	public String getUserById(Long id );
	public void deleteUser(String user);
	public void changePassword(String user);
	public void changeMailId(String user);
	public List<String>  getUserList();
	public List<String>  getUserListByMaccount(String code);
}
