package com.ahoy.ushop.core.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;
import com.ahoy.ushop.core.service.ShoppingListManagementService;
import com.ahoy.ushop.core.service.UserManagementService;

@Controller
public class ShoppingListController {
 
	@Autowired 
	private ShoppingListManagementService shoppingListManagementService;
	@Autowired 
	private UserManagementService userManagementService;
	 
	@RequestMapping(value = "/getdefaultShoppingList")
	public  void getdefaultShoppingList(@RequestParam(required = true, value = "familyCategory") long familyCategory ,@RequestParam(required = true, value = "timeGranularity")int timeGranularity,HttpServletResponse response) {
		
		response.setContentType("application/json");
		try {
			response.getWriter().write(shoppingListManagementService.
					getDefaultShoppingList(familyCategory,timeGranularity).getItemListJson());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/getdefaultShoppingLists")
	public  void getdefaultShoppingList(@RequestParam(required = true, value = "familyCategory") long familyCategory ,HttpServletResponse response) {
		
		response.setContentType("application/json");
		String s1="{\"timeGranularity\":";
		String s2=",\"items\":";
		String jsonOutput="[";
		List<DefaultShoppingListDo> list=shoppingListManagementService.getDefaultShoppingList(familyCategory);
		jsonOutput=jsonOutput+s1+list.get(0).getTimeGranularity()+s2+list.get(0).getItemListJson()+"},";
		jsonOutput=jsonOutput+s1+list.get(1).getTimeGranularity()+s2+list.get(1).getItemListJson()+"},";
		jsonOutput=jsonOutput+s1+list.get(2).getTimeGranularity()+s2+list.get(2).getItemListJson()+"}]";

			
		try {
			response.getWriter().write(jsonOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/getShoppingList")
	public void getUserShoppingList(@RequestParam(required = false, value = "userAppId") String userAppId,HttpServletResponse response ) {
		response.setContentType("application/json");
		try {
			response.getWriter().write(shoppingListManagementService
					.getShoppingListByUserAppId(userAppId).getItemListJson());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return shoppingListManagementService.getShoppingListByUserAppId(userAppId);  
	}
	
	@RequestMapping(value = "/addShoppingList",  method = RequestMethod.POST)
	@ResponseBody
	public void addUserShoppingList(@RequestBody UserShoppingListDo userShoppingListDo){//,@RequestParam(required = false, value = "userAppId") String userAppId) {
		UserDo user=userManagementService.getUserByAppId(userShoppingListDo.getUserAppId());
		userShoppingListDo.setUserFkey(user.getUserPkey());
		shoppingListManagementService.addUserShoppingList(userShoppingListDo);
	}
	
}







