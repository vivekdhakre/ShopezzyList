package com.ahoy.ushop.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;
import com.ahoy.ushop.core.service.ShoppingListManagementService;
import com.ahoy.ushop.core.service.UserManagementService;

@Controller
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired 
	private UserManagementService userManagementService;
	@Autowired 
	private ShoppingListManagementService shoppingListManagementService;
	 
	
	
	@RequestMapping(value = "/addUser",  method = RequestMethod.POST)
	@ResponseBody
	public void addUser(@RequestBody UserDo user) {
		logger.info("[addUser] "+user);
		userManagementService.addUser(user);
	}
	@RequestMapping(value = "/updateUser",  method = RequestMethod.POST)
	@ResponseBody
	public void updateUser(@RequestBody UserDo user) {
		 
		userManagementService.updateUser(user);
	}
	
}