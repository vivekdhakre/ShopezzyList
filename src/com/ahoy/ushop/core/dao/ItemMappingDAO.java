package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.ItemMappingDo;

public interface ItemMappingDAO {

	public List<ItemMappingDo> getGroceryItemMappingByCategory(long categoryFkey);
}
