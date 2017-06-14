package com.ahoy.ushop.core.util;

import java.util.List;

import com.ahoy.ushop.core.service.LocationServiceImpl;

public class UtilConstants {

	public static List<String> familyCategoryList ;
	public static List<String> groceryCategoryList ;
	public static List<String> groceryBrandList ;

	static{
		LocationServiceImpl miscServiceImpl=new LocationServiceImpl();
		familyCategoryList=miscServiceImpl.getFamilyCategoryList();
		groceryCategoryList=miscServiceImpl.getGroceryCategoryList();
		groceryBrandList=miscServiceImpl.getGroceryBrandList();	
	}
} 
