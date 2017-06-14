package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;

public interface DefaultShoppingListDAO {

	public DefaultShoppingListDo getDefaultShoppingListByFamilyCategory(long familyCategory,int timeGranularity);
	public List<DefaultShoppingListDo> getDefaultShoppingListByFamilyCategory(long familyCategory);
}
