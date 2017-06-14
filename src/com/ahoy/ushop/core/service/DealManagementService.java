package com.ahoy.ushop.core.service;

import java.util.List;

import com.ahoy.ushop.core.domain.DealDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;

public interface DealManagementService {

	public List<DealDo> getDealsByItem(String itemName);
	public void addDeals(List<DealDo> deals);
	
}
