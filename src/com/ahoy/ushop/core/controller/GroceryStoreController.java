package com.ahoy.ushop.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahoy.ushop.core.domain.GroceryStoreBranchDo;
import com.ahoy.ushop.core.service.GroceryStoreManagementService;

@Controller
public class GroceryStoreController {

	@Autowired 
	private GroceryStoreManagementService groceryStoreManagementService;
	
	@RequestMapping(value = "/getStoresByLocation")
	public @ResponseBody List<GroceryStoreBranchDo> getStoresByLocation(@RequestParam(required = false, value = "pin") String pin ) {
 
		return groceryStoreManagementService.getStoresByPinCode(pin);
	}
}
