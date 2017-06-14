package com.ahoy.ushop.core.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahoy.ushop.core.dao.GroceryCategoryDAO;
import com.ahoy.ushop.core.dao.GroceryItemDAO;
import com.ahoy.ushop.core.dao.GroceryItemInstanceDAO;
import com.ahoy.ushop.core.dao.ItemMappingDAO;
import com.ahoy.ushop.core.dao.UserDAO;
import com.ahoy.ushop.core.domain.GroceryCategoryDo;
import com.ahoy.ushop.core.domain.GroceryItemDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;
import com.ahoy.ushop.core.domain.ItemMappingDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.util.ImageUtil;

@Service
public class GroceryItemManagementServiceImpl implements GroceryItemManagementService{

	private static Logger logger = LoggerFactory.getLogger(GroceryItemManagementServiceImpl.class);
	
	@Autowired 
	private GroceryItemInstanceDAO groceryItemInstanceDAO;
	@Autowired 
	private GroceryItemDAO groceryItemDAO;
	@Autowired 
	private GroceryCategoryDAO groceryCategoryDAO;
	@Autowired 
	private ItemMappingDAO itemMappingDAO;
	@Autowired 
	private UserDAO userDAO;
	
	@Transactional
	public void addItemInstances(List<GroceryItemInstanceDo> itemInstances) {
		for(int i=0;i<itemInstances.size();i++)
			groceryItemInstanceDAO.addItemInstance(itemInstances.get(i));
	}

	@Transactional
	public List<GroceryCategoryDo> getGroceryCategoryList(int fType) {
		
		return groceryCategoryDAO.getGroceryCategoryList(fType);
		
	}

	@Transactional
	public GroceryCategoryDo getGroceryCategoryDetail(long categoryId) {
		GroceryCategoryDo groceryCategoryDo=groceryCategoryDAO.getGroceryCategoryById(categoryId);
		List<ItemMappingDo> mappingList=itemMappingDAO.getGroceryItemMappingByCategory(categoryId);
		List<GroceryItemDo> itemList=new ArrayList<GroceryItemDo>();
		for(int i=0;i<mappingList.size();i++){
			GroceryItemDo groceryItemDo=groceryItemDAO.getGroceryItemById(mappingList.get(i).getGroceryItemFkey());
			//groceryItemDo.setGroceryItemImage(ImageUtil.getImageUrl(groceryItemDo.getGroceryItemImage()));
			itemList.add(groceryItemDo);
		}
		groceryCategoryDo.setItems(itemList);
		return groceryCategoryDo;
	}

	@Transactional
	public List<GroceryCategoryDo> getGroceryCategoryDetailList(int fType,HttpServletRequest request) {
		List<GroceryCategoryDo> categoryList = null;
		
		try{
			
			String imagePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/shopezzyimages/listapp/";
			
			categoryList=groceryCategoryDAO.getGroceryCategoryList(fType);
			for(GroceryCategoryDo groceryCategoryDo:categoryList){
				List<ItemMappingDo> mappingList=itemMappingDAO.getGroceryItemMappingByCategory(groceryCategoryDo.getGroceryCategoryPkey());
				List<GroceryItemDo> itemList=new ArrayList<GroceryItemDo>();
				if(mappingList!=null){
					for(int i=0;i<mappingList.size();i++){
						GroceryItemDo groceryItemDo=groceryItemDAO.getGroceryItemById(mappingList.get(i).getGroceryItemFkey());
						groceryItemDo.setGroceryItemImage(imagePath+groceryCategoryDo.getGroceryCategoryName().toLowerCase().replaceAll(" ", "_")+"/"+groceryItemDo.getGroceryItemImage());
						itemList.add(groceryItemDo);
					}
				}				
				groceryCategoryDo.setItems(itemList);
			}
			
		}catch(Exception e){
			logger.info("[getGroceryCategoryDetailList] "+e);
			System.out.println("[GroceryItemManagementServiceImpl][getGroceryCategoryDetailList] "+e);
			e.printStackTrace();
		}		
		
		return categoryList;
	}
	@Transactional
	public void doit() {
		UserDo userDo= userDAO.getUserById(3);
		userDo.setUpdatedBy("ganesga");
		return;
		
	}
	
		

}
