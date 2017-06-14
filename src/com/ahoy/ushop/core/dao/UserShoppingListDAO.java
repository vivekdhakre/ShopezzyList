package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;

public interface UserShoppingListDAO {

	public void addUserShoppingList(UserShoppingListDo userShoppingListDo);
	public UserShoppingListDo getShoppingListByUserAppId(String userAppId);
	public UserShoppingListDo getShoppingListByUser(long userFkey);
	public List<UserShoppingListDo> getShoppingListsByUser(long userFkey);

}
