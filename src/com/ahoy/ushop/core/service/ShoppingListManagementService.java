package com.ahoy.ushop.core.service;

import java.util.List;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;

public interface ShoppingListManagementService {

	public void addUserShoppingList(UserShoppingListDo userShoppingListDo);
	public DefaultShoppingListDo getDefaultShoppingList(long familyCategory,int timeGranularity);
	public List<DefaultShoppingListDo> getDefaultShoppingList(long familyCategory);
	public UserShoppingListDo getShoppingListByUserAppId(String userAppId);
	
	
}