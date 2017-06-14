package com.ahoy.ushop.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ahoy.ushop.core.domain.GroceryItemDo;
import com.ahoy.ushop.core.domain.GroceryCategoryDo;
import com.ahoy.ushop.core.service.GroceryItemManagementService;
import com.ahoy.ushop.core.util.ImageUtil;

@Controller
public class GroceryItemController {
	
	private static Logger logger = LoggerFactory.getLogger(GroceryItemController.class);
	
	
	@Autowired 
	private GroceryItemManagementService groceryItemManagementService;
	
	@RequestMapping(value = "/getGroceryCategoryList")
	public @ResponseBody List<GroceryCategoryDo> getGroceryCategoryList(@RequestParam(required = true, value = "fType") int fType )  {
		List<GroceryCategoryDo> list=groceryItemManagementService.getGroceryCategoryList(fType);
		return list;
		
	}
	@RequestMapping(value = "/getGroceryCategoryDetail")
	public @ResponseBody GroceryCategoryDo getGroceryCategoryDetail(@RequestParam(required = true, value = "category") long categoryId ) {
		GroceryCategoryDo groceryCategoryDo=groceryItemManagementService.getGroceryCategoryDetail(categoryId);
		for(GroceryItemDo groceryItemDo:groceryCategoryDo.getItems()){
			groceryItemDo.setGroceryItemImage(ImageUtil.getImageUrl(groceryItemDo.getGroceryItemImage()));
 		}
		return groceryCategoryDo;
	}
	@RequestMapping(value = "/getGroceryCategoryDetailList")
	public @ResponseBody List<GroceryCategoryDo> getGroceryCategoryDetailList(@RequestParam(required = true, value = "fType") int fType , HttpServletRequest request) {
		
		List<GroceryCategoryDo> list = new ArrayList<GroceryCategoryDo>();
		
		try{
			list=groceryItemManagementService.getGroceryCategoryDetailList(fType,request);
//			for(GroceryCategoryDo groceryCategoryDo:list){
//				for(GroceryItemDo groceryItemDo:groceryCategoryDo.getItems()){
//					groceryItemDo.setGroceryItemImage(ImageUtil.getImageUrl(groceryItemDo.getGroceryItemImage()));
//				}
//			}
		}catch(Exception e){
			logger.error("[getGroceryCategoryDetailList] "+ e);
			System.out.println("[getGroceryCategoryDetailList] "+e);
			e.printStackTrace();
		}
		
		return list;	
	}
	@RequestMapping(value = "/doit")
	public  void doit( ) {
		groceryItemManagementService.doit();
	}
}
