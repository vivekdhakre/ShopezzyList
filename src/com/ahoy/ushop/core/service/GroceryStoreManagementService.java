package com.ahoy.ushop.core.service;

import java.util.List;

import com.ahoy.ushop.core.domain.GroceryStoreBranchDo;
import com.ahoy.ushop.core.domain.GroceryStoreInventoryDo;

public interface GroceryStoreManagementService {

	public List<GroceryStoreBranchDo> getStoresByPinCode(String pinCode);
	public void addStoreInventoryItems(List<GroceryStoreInventoryDo> InventoryItems);

}
