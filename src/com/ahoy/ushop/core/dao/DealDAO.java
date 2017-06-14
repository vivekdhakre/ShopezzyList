package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.DealDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;

public interface DealDAO {

	public List<DealDo> getDealsByItemName(String groceryItemName);
	public void addDeal(DealDo deal);

}
