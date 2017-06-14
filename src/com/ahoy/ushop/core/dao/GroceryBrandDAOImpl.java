package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.GroceryBrandDo;
import com.ahoy.ushop.core.domain.GroceryCategoryDo;
//done
@Repository
public class GroceryBrandDAOImpl implements GroceryBrandDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
  
	@SuppressWarnings("unchecked")
	@Override
	public List<GroceryBrandDo> getGroceryBrandList() {
		List<GroceryBrandDo> groceryBrandDoList = sessionFactory.getCurrentSession().createCriteria(GroceryBrandDo.class)
		.addOrder(Order.asc("groceryBrandPkey"))
		.list();

		if(groceryBrandDoList !=null && groceryBrandDoList.size()>0){
			return groceryBrandDoList;
		}else{
			return  null;
		}
	}
}
