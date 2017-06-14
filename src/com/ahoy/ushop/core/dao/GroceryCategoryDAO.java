package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.GroceryCategoryDo;

public interface GroceryCategoryDAO {

	public List<GroceryCategoryDo> getGroceryCategoryList(int fType);
	public GroceryCategoryDo getGroceryCategoryById(long id);

}

