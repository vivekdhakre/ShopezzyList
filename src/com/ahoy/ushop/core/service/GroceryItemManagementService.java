package com.ahoy.ushop.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ahoy.ushop.core.domain.GroceryCategoryDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;

public interface GroceryItemManagementService {

	public void addItemInstances(List<GroceryItemInstanceDo> itemInstances);
	public  List<GroceryCategoryDo> getGroceryCategoryList(int fType);
	public  GroceryCategoryDo getGroceryCategoryDetail(long categoryId);
	public  List<GroceryCategoryDo> getGroceryCategoryDetailList(int fType, HttpServletRequest request);
	public void doit();
		

}
