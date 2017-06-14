package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.GroceryStoreBranchDo;

public interface GroceryStoreBranchDAO {

	public List<GroceryStoreBranchDo> getStoresByPinCode(String pinCode);
}
