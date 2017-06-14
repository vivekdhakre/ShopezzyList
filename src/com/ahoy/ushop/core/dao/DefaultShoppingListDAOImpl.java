package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
//done
@Repository
public class DefaultShoppingListDAOImpl implements DefaultShoppingListDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@SuppressWarnings("unchecked")
	@Override
	public DefaultShoppingListDo getDefaultShoppingListByFamilyCategory(long familyCategory, int timeGranularity) {
		logger.debug("Inside DefaultShoppingListDAOImpl: getDefaultShoppingListByFamilyCategory: "+familyCategory);
		List<DefaultShoppingListDo> list = sessionFactory.getCurrentSession().createCriteria(DefaultShoppingListDo.class)
		.add(Restrictions.eq("familyCategoryFkey",familyCategory))
		.add(Restrictions.eq("timeGranularity",timeGranularity))
		.addOrder(Order.asc("defaultShoppingListPkey"))
		.list();

		DefaultShoppingListDo defaultShoppingListDo;
		if(list !=null && list.size()>0){
			defaultShoppingListDo = list.get(0);
		}else{
			defaultShoppingListDo= null;
		}

		return defaultShoppingListDo;	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<DefaultShoppingListDo> getDefaultShoppingListByFamilyCategory(long familyCategory ) {
		logger.debug("Inside DefaultShoppingListDAOImpl: getDefaultShoppingListByFamilyCategory: "+familyCategory);
		List<DefaultShoppingListDo> list = sessionFactory.getCurrentSession().createCriteria(DefaultShoppingListDo.class)
		.add(Restrictions.eq("familyCategoryFkey",familyCategory))
		.addOrder(Order.asc("defaultShoppingListPkey"))
		.list();

		if(list !=null && list.size()>0){
			return list;
		}else{
			return null;
		}
	}
  
}
