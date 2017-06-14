package com.ahoy.ushop.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ahoy.ushop.core.dao.DefaultShoppingListDAO;
import com.ahoy.ushop.core.dao.UserDAO;
import com.ahoy.ushop.core.dao.UserShoppingListDAO;
import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;
@Service
public class ShoppingListManagementServiceImpl implements ShoppingListManagementService{

	@Autowired 
	private DefaultShoppingListDAO defaultShoppingListDAO;
	@Autowired 
	private UserShoppingListDAO userShoppingListDAO;
	@Autowired 
	private UserDAO userDAO;
	
	@Transactional
	public void addUserShoppingList(UserShoppingListDo userShoppingListDo) {
		userShoppingListDAO.addUserShoppingList(userShoppingListDo);
	}

	@Transactional
	public DefaultShoppingListDo getDefaultShoppingList(long familyCategory,int timeGranularity) {
		 return defaultShoppingListDAO.getDefaultShoppingListByFamilyCategory(familyCategory,timeGranularity);
	}
	@Transactional
	public List<DefaultShoppingListDo> getDefaultShoppingList(long familyCategory) {
		return defaultShoppingListDAO.getDefaultShoppingListByFamilyCategory(familyCategory);
	}
	@Transactional
	public UserShoppingListDo getShoppingListByUserAppId(String userAppId) {
		
		return	userShoppingListDAO.getShoppingListByUser(userDAO.getUserByAppId(userAppId).getUserPkey());
	}

	

}
