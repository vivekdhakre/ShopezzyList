package com.ahoy.ushop.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahoy.ushop.core.dao.GroceryStoreBranchDAO;
import com.ahoy.ushop.core.dao.GroceryStoreInventoryDAO;
import com.ahoy.ushop.core.domain.GroceryStoreBranchDo;
import com.ahoy.ushop.core.domain.GroceryStoreInventoryDo;

@Service
public class GroceryStoreManagementServiceImpl implements GroceryStoreManagementService{

	@Autowired 
	private GroceryStoreBranchDAO groceryStoreBranchDAO;
	@Autowired 
	private GroceryStoreInventoryDAO groceryStoreInventoryDAO;
	
	@Transactional
	public List<GroceryStoreBranchDo> getStoresByPinCode(String pinCode) {
		
		return groceryStoreBranchDAO.getStoresByPinCode(pinCode);
	}

	@Transactional
	public void addStoreInventoryItems(List<GroceryStoreInventoryDo> InventoryItems) {
		for(int i=0;i<InventoryItems.size();i++)
			groceryStoreInventoryDAO.addStoreInventoryItem(InventoryItems.get(i));
	}

}
